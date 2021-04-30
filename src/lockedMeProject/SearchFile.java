package lockedMeProject;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
	
	public void searchFileMethod() {
		
	boolean isPresent = false;
		
		System.out.println("\n");
		System.out.println("***************************************");
		System.out.println("Enter File Name to Search: ");
		
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		File file = new File("D:\\Phase1 Files Dummy");
		String[] fileList = file.list();
		
		for(String matchFile : fileList) {
		if(fileName.equals(matchFile)) {
			isPresent = true;
		}
		}
		if(isPresent == true) {
			System.out.println("\n");
			System.out.println("Search File Found : " + fileName);
		}else {
			System.out.println("\n");
			System.out.println("Search File Not Found");
		}
	}
}
