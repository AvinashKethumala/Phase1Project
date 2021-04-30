package lockedMeProject;

import java.io.IOException;
import java.util.Scanner;

public class OperationsMenu {
	
	public void operationMenuMethod() throws IOException {
		int operationInput;
		
		
		System.out.println("Operational Menu Options: \n Select 1 : Create File \n Select 2 : Delete File \n Select 3 : Search File \n Select 4 : Main Menu");
		System.out.println("\n");
		System.out.println("Enter Valid Option from Operational Menu : ");
		
		do {
			Scanner sc = new Scanner(System.in);
			operationInput = sc.nextInt();
			
			switch(operationInput) {
			case 1:
				System.out.println("\n");
				System.out.println("*****************************************");
				AddFile addFile = new AddFile();
				addFile.addFileMethod();		
				break;
				
			case 2:
				DeleteFile deleteFile = new DeleteFile();
				deleteFile.deleteFileMethod();
				break;
				
			case 3:
				SearchFile searchFile = new SearchFile();
				searchFile.searchFileMethod();
				break;
				
			case 4:
				MainMenu mainMenu = new MainMenu();
				mainMenu.mainMenuMethod();
				break;
				
			default:
				System.out.println("Invalid Input! Please Enter Again");
			}
			
		}while (operationInput != 4);
			System.out.println("Enter Main Menu");
	}
}
