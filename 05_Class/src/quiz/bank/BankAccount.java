package quiz.bank;
// 추상화
// 은행계좌 정보 > BankAccount class > 계좌는 소유자 정보를 갖고 있지 않음, 잔액만
// 사람(User)는 은행계좌를 갖고 있다 > 이름, 현금보유액, 은행계좌
// 사람은 은행원을 통해 은행계좌를 활용한다 (입금, 출금)
public class BankAccount {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
}
