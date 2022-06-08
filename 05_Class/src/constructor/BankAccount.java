package constructor;

public class BankAccount {
	private String owner;
	private int accNum;
	private double deposit;
	
	
	public BankAccount(int accNum, double deposit) {
		this.accNum = accNum;
		this.deposit = deposit;
	}
	public BankAccount(String owner, int accNum, double deposit) {
		this.owner = owner;
		this.accNum = accNum;
		this.deposit = deposit;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	
	
}
