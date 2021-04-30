package lockedMeProject;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	
	
	public void mainMenuMethod() throws IOException {	
		
		int menuInput;
		System.out.println("Main Menu Options: \n Select 1 : Represents Current File Name \n Select 2 : Options to Create, Delete, Search files  \n Select 3 : Exit Application");
		System.out.println("\n");
		System.out.println("Enter the valid option from menu:");
		
		do {
			Scanner sc = new Scanner(System.in);
			menuInput = sc.nextInt();
			
			switch(menuInput)
			{
			case 1:
				System.out.println("*****************************************");
				
				FileClass fi = new FileClass();
				fi.fileMethod();
				break;
				
			case 2:
				System.out.println("*****************************************");
				OperationsMenu om = new OperationsMenu();
				om.operationMenuMethod();
				break;
				
			case 3:
				System.out.println("**********************************************");
				break;
				
			default:
				System.out.println("Invalid Option! Please Enter Again.");
				break;
			}

	}while(menuInput != 3) ;
		System.out.println("Thank You for using our services");
}
	
}
