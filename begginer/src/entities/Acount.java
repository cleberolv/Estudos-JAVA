package entities;

public class Acount {
	private int acountNubmer;
	private String acountName;
	private double initialDeposit;
	
	//Constructor with 2 arguments
	
	public Acount(int acountNubmer, String acountName) {
		this.acountNubmer = acountNubmer;
		this.acountName = acountName;
	}
	
	//Constructor with 3 arguments
	
	public Acount(int acountNubmer, String acountName, double initialDeposit) {
		this.acountNubmer = acountNubmer;
		this.acountName = acountName;
		deposit(initialDeposit);
	}

	// Gets and Setters
	
	public String getAcountName() {
		return acountName;
	}

	public void setAcountName(String acountName) {
		this.acountName = acountName;
	}
	
	public int getAcountNubmer() {
		return acountNubmer;
	}
	
	public double getInitialDeposit() {
		return initialDeposit;
	}
	
	//Methods
	
	public void deposit(double amount) {
		initialDeposit += amount;
	}
	
	public void withdraw(double amount) {
		initialDeposit -= amount + 5.0;
	}
	
	
	public String toString() {
		return "Nome do Cliente: " 
				+ acountName 
				+ ", Número da Conta: " 
				+ acountNubmer 
				+ ", Saldo da conta: $" 
				+ String.format("%.2f", initialDeposit);
	}

}
