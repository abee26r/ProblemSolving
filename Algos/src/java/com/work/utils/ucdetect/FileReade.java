/**
 * 
 */
package com.work.utils.ucdetect;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xx61691
 *
 */
public class FileReade {

	public static List<String> matchInFile(StringBuilder sb, Pattern p, int i) throws IOException{
		List<String> matchedList = new ArrayList<>();
		
		if(sb.length() > 0){
			Matcher m = p.matcher(sb);		
			while(m.find()){
				matchedList.add(m.group(i));
			}
		}
		return matchedList;
	}
	
	public static StringBuilder getFileContent(File f) throws IOException{
		
		List<String> fileList = Files.readAllLines(f.toPath(), Charset.defaultCharset());	
		StringBuilder sb = new StringBuilder();
		for (String string : fileList) {
			sb.append(string);
		}
		return sb;
	}
}
