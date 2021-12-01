package finalProject;

import java.util.GregorianCalendar;

import java.util.Scanner;

import data.structs.*;

public class UserInterface {

	private Scanner input = new Scanner(System.in);

	public String nextScreen;

	public boolean killUi = false;

	public List<Transaction> transactions = new List<Transaction>();

	public void welcomeScreen() {
		System.out.println("Welcome to EasyAccounting! Please choose from one of the following by entering it's abbreviation into the console.\n");
	}

	public void goToNextScreen() {
		System.out.println("Enter New Transaction(ENT)   Enter New Financial Goal(ENFC)   Manage Financial Goals(MFG)   Edit User Profile(EUP)\n");
		nextScreen = input.nextLine();
		if (nextScreen.equals("ENT")) {
			transactionScreen();
		} else if (nextScreen.equals("ENFC")) {

		} else if (nextScreen.equals("MFG")) {

		} else if (nextScreen.equals("EUP")) {

		} else {
			System.out.println("It appears the option you have chosen is not valid. Please try again.");
			nextScreen = input.nextLine();
			goToNextScreen();
		}
	}

	public void transactionScreen() {
		System.out.println("Is the transaction a purchase, withdrawal, or deposit?");
		String actionType = input.next();
		input.nextLine();
		boolean typeDefined = false;
		double amount;
		int day;
		int month;
		int year;
		String description;
		while (!typeDefined) {
			switch (actionType) {
			case "purchase":
				System.out.println("Enter purchase amount");
				amount = input.nextDouble();
				System.out.println("Enter purchase date in the form Day Month Year with no slashes.");
				day = input.nextInt();
				month = input.nextInt();
				year = input.nextInt();
				System.out.println("Enter purchase description if you would like one. If not enter N/A.");
				description = input.next();
				transactions.add(
						new Transaction(new GregorianCalendar(year, month, day), "purchase", -amount, description));
				typeDefined = true;
				break;
			case "withdrawal":
				System.out.println("Enter withdrawal amount");
				amount = input.nextDouble();
				System.out.println("Enter withdrawal date in the form Day Month Year with no slashes.");
				day = input.nextInt();
				month = input.nextInt();
				year = input.nextInt();
				System.out.println("Enter withdrawal description if you would like one. If not enter N/A.");
				description = input.next();
				transactions.add(
						new Transaction(new GregorianCalendar(year, month, day), "withdrawal", -amount, description));
				typeDefined = true;
				break;
			case "deposit":
				System.out.println("Enter deposit amount");
				amount = input.nextDouble();
				System.out.println("Enter deposit date in the form Day Month Year with no slashes.");
				day = input.nextInt();
				month = input.nextInt();
				year = input.nextInt();
				System.out.println("Enter deposit description if you would like one. If not enter N/A.");
				description = input.nextLine();
				transactions
						.add(new Transaction(new GregorianCalendar(year, month, day), "deposit", amount, description));
				typeDefined = true;
				break;
			default:
				System.out.println("Bad input, please try again.");
			}
		}
		System.out.println("Enter \"Home\" if you would like to return to the Home Screen \nEnter \"New\" if you would like to enter another transaction\nEnter \"Exit\" if you would like to exit the program");
		String nxt = input.next();
		boolean val = false;
		while (!val) {
			if (nxt.equals("Home")) {
				System.out.println("\n\n");
				val=true;
			} else if (nxt.equals("New")) {
				System.out.println("\n\n");
				transactionScreen();
				val=true;
			} else if (nxt.equals("Exit")) {
				System.out.println("\n\n");
				killUi = true;
			} else {
				System.out.println("Bad input, please try again.");
			}
		}
	}

}
