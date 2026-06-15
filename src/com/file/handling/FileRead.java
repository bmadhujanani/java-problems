package com.file.handling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\my folder\\myfile.txt");
		int ch;
		while((ch=f.read())!=-1) {
			System.out.println((char)ch);
		}
	}
}
