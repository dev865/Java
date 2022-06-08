package object;

class BankAccount{
	String owner;
	int accNum;
	int deposit; 
	
	void makeAccount(String name, int num, int money){
		owner = name;
		accNum = num;
		deposit = money;
	}
	void getInfo() {
		System.out.println("1: "+owner);
		System.out.println("2: "+accNum);
		System.out.println("3: "+deposit);
	}
	void save(int money) {
		deposit += money;
	}
	void withraw(int money) {
		if(money <= deposit) {
			deposit -= money;
		} else {
			System.out.println("잔액이 부족합니다");
		}
	}
}
public class BankingService {

	public static void main(String[] args) {
		// BankAccount 클래스를 정의한다
		// BankAccount에는 예금주(owner), 계좌번호(accNum), 계좌잔액(deposit)
		// 계좌현황조회, 입금, 출금을 할 수 있다(메서드)
		System.out.println("-------------");
		BankAccount myAccount = new BankAccount();
		myAccount.makeAccount("Sang", 1111, 10000);
		myAccount.getInfo();
		System.out.println("-----저금중--------");
		myAccount.save(10000);
		myAccount.getInfo();
		System.out.println("--------출금중-----");
		myAccount.withraw(30000);
		myAccount.getInfo();
		
	}	
}
