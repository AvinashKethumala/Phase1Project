package lockedMeProject;

import java.io.IOException;

public class WelcomeClass {
	
	public void welcomeMethod() {
		System.out.println("*****Welcome to LockedMe Application*****");
		System.out.println("\n");
		System.out.println("     Developer: Avinash Kethumala     ");
		System.out.println("   Email @ yadavavinash.2890@gmail.com");
		System.out.println("\n");
		
		System.out.println("******************************************************");
		
		MainMenu menu = new MainMenu();
		try {
			menu.mainMenuMethod();
		} catch (IOException e) {
			System.out.println("Main Menu not Executed");
		}
	}

}
