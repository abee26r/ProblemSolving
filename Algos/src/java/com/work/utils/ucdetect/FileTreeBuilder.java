package com.work.utils.ucdetect;

import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xx61691
 *
 */
public class FileTreeBuilder {

	
	/*
	 * Recursively build the list of all the java files in the project
	 */
	public List<File> locateFiles(File root){
		
		List<File> fileList = new LinkedList<File>();
		
		File []tempFileArr = root.listFiles(new FileFilter() {//accept only directories and .java
			
			@Override
			public boolean accept(File pathname) {
				String s = pathname.getPath();
				if(pathname.isDirectory() || pathname.getName().endsWith("java"))
					return filterStuff(s);
				else
					return false;
			}
		});
		
		for (File file : tempFileArr) {
			if(file.isDirectory()){
				List<File> subdirectoryList = locateFiles(file);//if directory then drill in
				fileList.addAll(subdirectoryList);
			}else{
				fileList.add(file);
			}
			
		}
		
		return fileList;
	}
	
	private boolean filterStuff(String s) {
		boolean b = true;
		if (s.indexOf("com\\pncbank\\pme\\ps\\global\\command") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\global\\exceptions") > 1
				|| s.indexOf("com\\pncbank\\pme\\pmeservice\\exception") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\gppservice\\validatemessage") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\gppservice") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\gppservice\\iban") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\domain\\model\\oly") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\jaxbeans\\pain") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\gppservice\\profilelist") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\paymententry\\command") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\domain\\model\\pain") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\gppservice\\messagesubmit") > 1
				|| s.indexOf("com\\pncbank\\pme\\pmeservice\\model") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\global\\entity") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\jaxbeans\\highrisk") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\externalinterface\\error") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\global\\json") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\senddate\\exceptions") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\paymententry\\dto") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\cif") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\dal") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\global\\constants") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\account\\exceptions") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\calendarservice") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\gppservice\\loadprofile") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\paymententry\\validator\\vo") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\paymententry\\error") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\partnerservice") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\soapbinding\\accountservice") > 1
				|| s.indexOf("com\\pncbank\\pme\\ps\\paymententry\\json") > 1
				|| s.indexOf("test\\cases") > 1 || s.indexOf("Test") > 1
				|| s.indexOf("DomesticEntryDomainModelPAINMapper") > 1
				|| s.indexOf("ProfilePropertyReader") > 1){
			b = false;
		}
		
		return b;
	}
	
}
