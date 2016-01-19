/**
 * 
 */
package com.work.utils.ucdetect;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/**
 * @author xx61691
 *
 */
public class ScanFileForMethodNames implements Callable<List<String>> {

	private final Pattern METHOD_PATTERN = Pattern.compile("(public|protected|private|static|\\s) +[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;])");
	
	@Override
	public List<String> call() throws Exception {
		return scanFileForMethodNames();
	}

	private List<String> scanFileForMethodNames() throws IOException {

		File f = ThreadDataQueue.fileQueue.poll();
		
		if(f != null)
			return FileReade.matchInFile(FileReade.getFileContent(f), METHOD_PATTERN, 2);
		
		return null;
	}
	
//	public static void main(String[] args) throws Exception {
//		
//		File f = new File("C:/Users/XX61691/Documents/Data/GITCode/GITHUB/ProblemSolving/Algos/src/java/com/work/utils/ucdetect/FileReade.java");
//		
//		List<String> l =  FileReade.matchInFile(f, 
//					Pattern.compile("(public|protected|private|static|\\s) +[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;])"));
//		
//		System.out.println("www");
//	}
}
