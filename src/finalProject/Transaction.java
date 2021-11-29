package finalProject;

import java.util.Date;

public abstract class Transaction {

	protected String type;
	
	protected String description;
	
	protected double amount;
	
	protected Date date;

	protected Transaction(Date date, String type, double amount, String description) {
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.description = description;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setDate(Date date) {
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

	public Date getDate() {
		return date;
	}

	public String getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}

}
