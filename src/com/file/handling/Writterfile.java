package com.file.handling;

import java.io.File;
import java.io.IOException;


import java.io.FileWriter;

public class Writterfile {
	public static void main(String[] args)throws IOException {
		FileWriter writer=new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\my folder\\myfile.txt",false);
		writer.write("hello world \n");
		writer.write("java \n");
		
		writer.close();
	}

}
