package lockedMeProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	
	public void addFileMethod() throws IOException {
		
		String folderName = "D:\\Phase1 Files Dummy\\";
		System.out.println("Enter File Name to be creted:");
		Scanner sc = new Scanner(System.in);
		String newFileName = sc.nextLine();			
		String filePath = folderName + newFileName;
		File newFile = new File(filePath);
		newFile.createNewFile();
		System.out.println("\n");
		System.out.println("New File Created");
		
	}
	
	
	
	

}
