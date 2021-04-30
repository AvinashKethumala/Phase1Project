package lockedMeProject;

import java.io.File;
import java.util.Scanner;

public class DeleteFile  {
	public void deleteFileMethod() {

		String folderName = "D:\\Phase1 Files Dummy\\";
		System.out.println("\n");
		System.out.println("************************************************");
		System.out.println("Enter File Name to Delete :");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();			
		String filePath = folderName + fileName;
		File newFile = new File(filePath);
		System.out.println("\n");
		if(newFile.delete()) {
			System.out.println("File has been Deleted");				
		}else {
			System.out.println("File Not Deleted");				
		}
		}
}
