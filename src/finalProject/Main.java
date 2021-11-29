package finalProject;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	static Queue<Purchase> purchases;
	static Queue<Withdrawl> withdrawals;
	static Queue<Deposit> deposits;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface UI = new UserInterface();
		//Code will go here to read in previously stored data from excel or csv with some kind of data initialization class. for now:
		initializeData();
		runUI(UI);
		
		
	}
	
	public static void initializeData() {
		purchases = new LinkedList<>();
		withdrawals = new LinkedList<>();
		deposits = new LinkedList<>();
	}
	
	public static void runUI(UserInterface UI) {
		if (UI.welcomeScreen()) {
		UI.goToNextScreen();
		}
	}
}
