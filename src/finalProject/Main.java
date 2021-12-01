package finalProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface UI = new UserInterface();
		runUI(UI);

	}

	public static void runUI(UserInterface UI) {
		while (!UI.killUi) {
			if (UI.welcomeScreen()) {
				UI.goToNextScreen();
			}
		}
	}
}
