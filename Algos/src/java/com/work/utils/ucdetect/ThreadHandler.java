package com.work.utils.ucdetect;

import java.util.AbstractSet;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author xx61691
 *
 */
public class ThreadHandler {

	private static final int MAX_THREAD = 50;//Configure this
	private static final int MAX_MINS_FOR_EACH_MULTI_THREAD=30;//Configure this
	
	private ExecutorService executor;
	private ConcurrentSkipListSet<String> methodNameSet = new ConcurrentSkipListSet<>();
	
	/**
	 * Method retrieve the set of method names from the queued files based on
	 * the REGEX in ScanFileForMethodNames
	 * 
	 * @param i
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public ConcurrentSkipListSet<String> getMethodNames(int i)
			throws InterruptedException, ExecutionException {
		
		executor = Executors.newFixedThreadPool(MAX_THREAD);
		
		while (i-- > 0) {
			Future<List<String>> future = executor.submit(new ScanFileForMethodNames());
			List<String> methodNames = future.get();
			methodNameSet.addAll(methodNames);
		}
		
		executor.shutdown();
		
		return methodNameSet;
	}
	
	
	/**
	 * Method needs to match each java file with the list of method names which we have.
	 * The final list corresponds to the method names which were not invoked
	 * 
	 * @param i
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public void matchMethodNames(int i) throws InterruptedException, ExecutionException{
		
		executor = Executors.newFixedThreadPool(MAX_THREAD);
		
		while (i-- > 0) {
			executor.submit(new ScanFileForMethodNamesMatches());
		}
		
		executor.shutdown();
		
	}
	
	/**
	 * Wait for the threads to complete the process
	 * 
	 * @throws InterruptedException
	 */
	public void awaitTermination() throws InterruptedException{
		executor.awaitTermination(MAX_MINS_FOR_EACH_MULTI_THREAD, TimeUnit.MINUTES);
	}
	
}
