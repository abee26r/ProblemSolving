/**
 * 
 */
package com.work.utils.ucdetect;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author xx61691
 *
 */
public class ScanFileForMethodNamesMatches implements Runnable {

	
	private static String MET_PATTERN = "(?:\\.zzz\\(|zzz.*zzz)";
	
	private void scanFileForMethodNamesMatches() throws IOException {

		
		StringBuilder sb = FileReade.getFileContent(ThreadDataQueue.fileQueue.poll());
		
		for (Iterator<String> iterator = ThreadDataQueue.methodNameSet.iterator(); iterator.hasNext();) {
			String str = iterator.next();
			List<String> matchedList = FileReade.matchInFile(sb, Pattern.compile(MET_PATTERN.replaceAll("zzz", str)), 0);
			if(matchedList.size() > 0){
				ThreadDataQueue.methodNameSet.remove(str);
			}
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			scanFileForMethodNamesMatches();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
