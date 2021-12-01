package finalProject;

import java.util.Date;

public class Purchase extends Transaction {

	public Purchase(Date date, String type, double amount, String description) {
		super(date, type, -amount, description);
	}

}
