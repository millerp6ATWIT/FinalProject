package finalProject;

import java.util.GregorianCalendar;

public class Transaction {

	protected String type;
	
	protected String description;
	
	protected double amount;
	
	protected GregorianCalendar date;

	protected Transaction(GregorianCalendar date, String type, double amount, String description) {
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.description = description;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public String getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}

}
