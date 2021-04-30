package lockedMeProject;

import java.io.File;

public class FileClass {
	
	public void fileMethod() {
		System.out.println("Represent List of Files in Folder");
		System.out.println("\n");
		File file = new File("D:\\Phase1 Files Dummy");
		String[] files = file.list();
		
		for(String fileList : files) {
			System.out.println(fileList);
		}
		
		
	}
	
	

}
