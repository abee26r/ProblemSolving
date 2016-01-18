package com.work.utils.ucdetect;

import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * <b>Assumption:</b>
 * 	The method names are unique.
 * 
 * @author xx61691
 *
 */
public class UnusedMethodFinder {
	
	private FileTreeBuilder fileTreeBuilder = new FileTreeBuilder();
	private ThreadHandler handler = new ThreadHandler();

	public static void main(String[] args) {
		
//		if(args.length == 0)
//			throw new RuntimeException("Provide location of the project");
		args = new String[]{"C:/Users/XX61691/Documents/Data/GITCode/sprint6_New/PaymentSystems"};
		
		UnusedMethodFinder finder = new UnusedMethodFinder();
		try {
			finder.doProcess(args[0]);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}
	
	private void doProcess(String root) throws InterruptedException, ExecutionException {
		
		File file = new File(root);
		List<File> fileList = fileTreeBuilder.locateFiles(file);//get files
		//Queue up the files for the threads to process and get the method names
		ThreadDataQueue.fileQueue = new LinkedBlockingQueue<>(fileList);
		ConcurrentSkipListSet<String> metNmSet = handler.getMethodNames(fileList.size());//get the method names
		
		handler.awaitTermination();//wait for above async process to complete
		
		//Queue up the methodName for the threads to process and matches
		ThreadDataQueue.methodNameSet = (ConcurrentSkipListSet<String>) metNmSet;
		//Queue up the files for the threads to process and get the method names
		ThreadDataQueue.fileQueue = new LinkedBlockingQueue<>(fileList);
		handler.matchMethodNames(fileList.size());
		
		//metNmSet contains the list of the methods which did not have references
		
		handler.awaitTermination();//wait for above async process to complete
		
		while(!metNmSet.isEmpty()){
			System.out.println(metNmSet.pollFirst().toString());
		}
		System.out.println("Done");
	}
	
	
}
