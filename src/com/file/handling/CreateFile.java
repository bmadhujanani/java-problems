package com.file.handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
    	
        try {
            File f = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\my folder\\myfile.txt");

            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
