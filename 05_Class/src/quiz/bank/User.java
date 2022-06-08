package quiz.bank;

public class User {
	private String name;
	private int cashAmount;
	private BankAccount account;

//	public User() {
//		this.account = new BankAccount();
//	}
	public User() {
		this.name = null;
		this.cashAmount = 0;
	}

	public User(String name) {
		this.name = name;
	}

	public User(String name, int cashAmount) {
		this(name);
		this.cashAmount = cashAmount;
	}

	public User(String name, int cashAmount, BankAccount account) {
		this(name, cashAmount);
		this.account = account;
		printResult();
	}

	private void printResult() {
		System.out.println("계좌 개설 완료");
		System.out.println(toString());
		System.out.println(this.account.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", cashAmount=" + cashAmount + "]";
	}

}
