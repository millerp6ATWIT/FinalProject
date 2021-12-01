package finalProject;

import java.util.GregorianCalendar;

import java.util.Scanner;

import data.structs.*;

public class UserInterface {

	private Scanner input = new Scanner(System.in);

	public String nextScreen;

	public boolean killUi = false;
	
	public QueueInterface<Transaction> transactions = new Queue<Transaction>();

	public boolean welcomeScreen() {
		System.out.println(
				"Welcome to EasyAccounting! Please choose from one of the following and enter it into the console.\n");
		System.out.println(
				"Enter New Transaction   Enter New Financial Goal   Manage Financial Goals   Edit User Profile\n");
		nextScreen = input.nextLine();
		return true;
	}

	public void goToNextScreen() {
		if (nextScreen.equals("Enter New Transaction")) {
			transactionScreen();
		} else if (nextScreen.equals("Enter New Financial Goal")) {

		} else if (nextScreen.equals("Manage Financial Goals")) {

		} else if (nextScreen.equals("Edit User Profile")) {

		} else {
			System.out.println("It appears the option you have chosen is not valid. Please try again.");
			nextScreen = input.nextLine();
			goToNextScreen();
		}
	}

	public void transactionScreen() {
		System.out.println("Is the transaction a purchase, withdrawal, or deposit?");
		String actionType = input.next();
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
				description = input.nextLine();
				transactions.enqueue(new Transaction(new GregorianCalendar(year, month, day), "purchase", -amount, description));
				typeDefined=true;
				break;
			case "withdrawal":
				System.out.println("Enter withdrawal amount");
				amount = input.nextDouble();
				System.out.println("Enter withdrawal date in the form Day Month Year with no slashes.");
				day = input.nextInt();
				month = input.nextInt();
				year = input.nextInt();
				System.out.println("Enter withdrawal description if you would like one. If not enter N/A.");
				description = input.nextLine();
				transactions.enqueue(new Transaction(new GregorianCalendar(year, month, day), "withdrawal", -amount, description));
				typeDefined=true;
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
				transactions.enqueue(new Transaction(new GregorianCalendar(year, month, day), "deposit", amount, description));
				typeDefined=true;
				break;
			default:
				System.out.println("Bad input, please try again.");
			}
		}

	}

}
