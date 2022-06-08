package quiz.bank;

public class Banker_old {

	public static void main(String[] args) {
		User me = new User("park", 10000);
		User you = new User("you", 100000);
		
		// 은행계좌 개설하기 2개 (myBA, urBA)
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		// 잔액 조회 기능 구현
		
		
		me.setAccount(acc1);
		you.setAccount(acc2);
		
		System.out.println("my계좌 잔액:" + me.getAccount().getBalance());
		System.out.println("your계좌 잔액:" + you.getAccount().getBalance());
		
		// 입금, 출금 기능 구현 => setter의 활용 한계점		
//		myBA.setBalance(10000);
//		urBA.setBalance(50000);
//		
//		myBA.setBalance(-5000);
//		urBA.setBalance(-20000);
		
		// 입금
		me.getAccount().saving(10000);
		you.getAccount().saving(50000);
		
		// 출금
		me.getAccount().withdraw(5000);
		you.getAccount().withdraw(20000);

	}

}
