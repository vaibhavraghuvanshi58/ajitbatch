package org.day6;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) throws Exception{
		String basepath ="C:/Users/User1/Desktop/Class_ppt/";
		File fl = new File(basepath);
		File[]  retArray = fl.listFiles();
		int dirCount = 0;
		int filecount = 0;
//		for(int i = 0 ; i <  retArray.length ;i++){
//			File f = retArray[i];
//			if(f.isDirectory()){
//				dirCount++;
//			}
//			if(f.isFile()){
//				String fname = f.getName();
//				if(fname.endsWith(".jar")){
//				filecount++;
//				}
//			}
//		}
//		System.out.println("File Count :" + filecount);
//		System.out.println("Directory Count :" + dirCount );
//		
//		
		String[] ls  = fl.list();
		
		for(int j = 0 ; j < ls.length ; j++){
			System.out.println(ls[j]);
		}
		
//		for(int i = 1; i <  10; i++){
//			File fl = new File(basepath+i+".txt");
//		fl.createNewFile();
//		}		
		
		
	}
}
