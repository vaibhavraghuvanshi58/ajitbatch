package org.common;

import java.io.File;
import java.io.FileWriter;

public class FileFunctions {
	public static void writeFile(String filePath, String Content){
		try{
			FileWriter writer = new FileWriter(new File(filePath));
			writer.write(Content);
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
