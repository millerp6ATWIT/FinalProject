package finalProject;

import java.util.Scanner;

public class UserInterface {

	private Scanner input = new Scanner(System.in);

	public String nextScreen;

	public boolean welcomeScreen() {
		System.out.println("Welcome to EasyAccounting! Please choose from one of the following and enter it into the console.\n");
		System.out.println("Enter New Transaction   Enter New Financial Goal   Manage Financial Goals   Edit User Profile\n");
		nextScreen = input.nextLine();
		return true;
	}
	
	public void goToNextScreen() {
		if (nextScreen.equals("Enter New Transaction")) {
			transactionScreen();
		}
		else if (nextScreen.equals("Enter New Financial Goal")) {
			
		}
		else if (nextScreen.equals("Manage Financial Goals")) {
			
		}
		else if (nextScreen.equals("Edit User Profile")) {
			
		}
		else {
			System.out.println("It appears the option you have chosen is not valid. Please try again.");
			nextScreen = input.nextLine();
			goToNextScreen();
		}
	}

	
	public void transactionScreen() {
		System.out.println("Is the transaction a purchase, withdrawal, or deposit?");
		
		
		
	}

}
