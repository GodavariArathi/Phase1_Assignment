package com.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class example {
	public void SortFileNames() {
			File fileDir = new File("C:\\Users\\agodavari\\eclipse-workspace\\DXC_Assignment1\\src\\com\\project");
			if(fileDir.isDirectory()){
				List<String> listFile = Arrays.asList(fileDir.list());
				System.out.println("Listing files unsorted");
				for(String s:listFile){
					System.out.println(s);
				}
				Collections.sort(listFile);
				System.out.println("Sorting by filename in ascending order");
				for(String s:listFile){
					System.out.println(s);
				}
				System.out.println("Sorting by filename in descending order");
				Collections.sort(listFile,Collections.reverseOrder());
				for(String s:listFile){
				System.out.println(s);
				}

			}
			else{
				System.out.println(fileDir.getAbsolutePath() + " is not a directory");
			}

		}

	public void addFiles() {
		
		try {
			Scanner sc = new Scanner(System.in);
			String fname=sc.next();
			File myFile=new File(fname);
			FileOutputStream is=new FileOutputStream("C:\\Users\\agodavari\\eclipse-workspace\\DXC_Assignment1\\src\\com\\project"+fname);
			boolean flag=myFile.createNewFile();
			
			if(flag) {
				
				System.out.println("File created Successfully!");
				
				}
			
			else {
				System.out.println("File already present.\n");
		}
			}
		catch(Exception e) {
			System.out.println("Problem in creating file");
		}
	}
	
public void deleteFiles() {
	Scanner sc = new Scanner(System.in);
	String fname=sc.next();
	 
	String fileName="C:\\Users\\agodavari\\eclipse-workspace\\DXC_Assignment1\\src\\com\\project"+fname;
	try
    { 
        if(Files.deleteIfExists(Paths.get(fileName)))
        	System.out.println("Deletion successful.");
    } 
    catch(NoSuchFileException e) 
    { 
        System.out.println("No such user exists"); 
    } 
    catch(DirectoryNotEmptyException e) 
    { 
        System.out.println("Directory is not empty."); 
    } 
    catch(FileSystemException e) 
    { 
    	System.out.println("Cannot delete the file, because it is being used.");

    } 
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void SearchFile() { 
	      File dir = new File("C:\\Users\\agodavari\\eclipse-workspace\\DXC_Assignment1\\src\\com\\project");
	      FilenameFilter filter = new FilenameFilter() {
	         public boolean accept (File dir, String name) { 
	            return name.startsWith("b");
	         } 
	      }; 
	      String[] children = dir.list(filter);
	      if (children == null) {
	         System.out.println("Either dir does not exist or is not a directory"); 
	      } else { 
	         for (int i = 0; i< children.length; i++) {
	            String filename = children[i];
	            System.out.println(filename);
	         } 
	      } 
	   } 
	}