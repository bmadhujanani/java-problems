package com.file.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//public class FileBufferedReader {
//	public static void main(String[] args) throws IOException {
//		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\my folder\\myfile.txt"));
//		String line;
//		while((line=bf.readLine())!=null) {
//		System.out.println(line);
//			
//		}
//	}
//}




public class FileBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\my folder\\myfile.txt"));
		String line;
		while((line=bf.readLine())!=null) {
		String[] word=line.split(" ");
			for(int i=0;i<word.length;i++) {
				System.out.println(word[i]);
			
		}
		
	}bf.close();
}
}

