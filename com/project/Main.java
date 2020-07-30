package com.project;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends example{
	public static void main(String[] args) throws Exception {
		
		System.out.println("--------Welcome to LockedMe.com------");
		System.out.println("%%Your name%% welcomes you on behalf of LockedMe.com");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name=scan.next();
		Main obj=new Main();
		while(true) {
			
			System.out.println("---------Menu------");
			System.out.println("1.Sorting the list of files");
			System.out.println("2.Add a file to the application ");
			System.out.println("3.Delete a file from application ");
			System.out.println("4.To search file is present in application directory");
			System.out.println("0.exit");
			System.out.println();
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();

			switch(choice){
			case 1:
				System.out.println("List of files sorted");
				obj.SortFileNames();
				break;
			case 2:
				System.out.println(" adding a file ");
				obj.addFiles();
				break;
			case 3:
				System.out.println("Deleting a file  ");
				obj.deleteFiles();
				break;
			case 4:
				System.out.println("searching a file");
				obj.SearchFile();
				break;
			case 0:
				System.out.println("Closing the application!!!!");
				System.exit(0);
				break;
			default:
				System.out.println("Error");
				
				
			}
		}
	}
}