package quiz.bank;

public class Bank {
	private User[] users;
	
	public Bank(int cnt) {
		users = new User[cnt];
	}


	public User[] getUsers() {
		return users;
	}
	

	public void setUsers(User[] users) {
		this.users = users;
	}

	public void saving(int money, User user) {
		if (money <= user.getCashAmount()) {	
			user.getAccount().setBalance(
					user.getAccount().getBalance() + money
					);
			System.out.println("입금 완료");
			user.setCashAmount(user.getCashAmount() - money);
			System.out.println(user.toString());
			System.out.println(user.getAccount().toString());					
		}else {
			System.out.println("보유한 현금이 부족합니다");
		}
	}

	public void withdraw(int money, User user) {
		if(money <= user.getAccount().getBalance()) {
			user.getAccount().setBalance(
					user.getAccount().getBalance() - money
					);
			System.out.println("출금 완료");
			user.setCashAmount(user.getCashAmount() + money);
			System.out.println(user.toString());
			System.out.println(user.getAccount().toString());	
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}

	public void transfer(int money, User from, User to) {
		if(from.getAccount().getBalance() >= money) {
			from.getAccount().setBalance(from.getAccount().getBalance()-money);
			to.getAccount().setBalance(to.getAccount().getBalance()+money);
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
}
