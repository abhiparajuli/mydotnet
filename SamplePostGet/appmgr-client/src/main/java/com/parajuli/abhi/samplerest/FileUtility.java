package com.parajuli.abhi.samplerest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtility {
	public static String extractFileContent(String fileName){
    	String fileContent = "";
    	FileReader myFileReader = null;
		BufferedReader myReader = null;
    	try{    		
    		if(new File(fileName).exists()){
				myFileReader = new FileReader(fileName);
				myReader = new BufferedReader(myFileReader);
				String line = null;
				while ((line = myReader.readLine()) != null){
					fileContent += line;
				}				
    		}
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}finally{
    		try {
				myReader.close();
				myFileReader.close();
			} catch (IOException e) {
				//catch but do nothing
			}			
    	}
    	System.out.println("*******FILE CONTENT*************");
    	System.out.println(fileContent.trim());
    	System.out.println("********************************");
		return fileContent.trim();
    }
}
