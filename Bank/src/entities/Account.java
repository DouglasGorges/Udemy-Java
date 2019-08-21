package entities;

public class Account {

	private String name;
	private int accountNumber;
	private double amount = 0;

	public Account(String name, int accountNumber, double amount) {
		this.name = name;
		this.accountNumber = accountNumber;
		addAmount(amount);
	}

	public void addAmount(double value) {
		this.amount += value;
	}

	public void removeAmount(double value) {
		this.amount -= (value + 5);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public String toString() {
		return "Holder: " + name + " / Account: " + accountNumber + " / Balance: US$" + String.format("%.2f", amount);
	}

}
