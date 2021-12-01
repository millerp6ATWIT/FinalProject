package finalProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface UI = new UserInterface();
		runUI(UI);

	}

	public static void runUI(UserInterface UI) {
		UI.welcomeScreen();
		while (!UI.killUi) {
			UI.goToNextScreen();
		}
	}
}
