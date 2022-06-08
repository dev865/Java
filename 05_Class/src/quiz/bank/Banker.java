package quiz.bank;

import java.util.Scanner;

public class Banker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고객의 수 입력 > ");
		int limit = sc.nextInt();
		Bank bank = new Bank(limit);

//		User me = null;
//		User you = null;
//		User an = null;

		int menu = 0;
		boolean flag = true;
		int money = 0;
		int regCount = 0;

		while (flag) {
			System.out.println("\n==============뱅킹 시스템============");
			System.out.println("1.계좌개설 / 2.입금 / 3.출금 / 4.무기명계좌개설 / 5.이체 etc.종료");
			menu = sc.nextInt();
			System.out.println("---------------------------------------");

			switch (menu) {
			case 1:
				if(regCount < limit) {
					System.out.println("고객명 입력 > ");
					String userName = sc.next();
					System.out.println("최초 입금액 > ");
					int initBalance = sc.nextInt();
					bank.getUsers()[regCount]
							= new User(userName,initBalance,new BankAccount());
					regCount++;
				}else {
					System.out.println("고객 수 초과");
				}
//				me = new User("park", 10000, new BankAccount());
//				you = new User("you", 50000, new BankAccount());
				break;
			case 2:
				System.out.println("입금할 금액 > ");
				money = sc.nextInt();
				bank.saving(money, me);
				
				break;
			case 3:
				System.out.println("출금할 금액 > ");
				money = sc.nextInt();
				bank.withdraw(money, me);
				
				break;
//			case 4:
//				an = new User(); // User에 디폴트 생성자 선언 필수!
//				break;
			case 5:
				System.out.println("이체할 금액 > ");
				int from = sc.nextInt();
				if(from < limit && bank.getUsers()[from] != null) {
					User me = bank.getUsers()[from];
					System.out.println("To : 고객 번호 입력 (0~ limit-1 > ");
					int to = sc.nextInt();
					if(to < limit && bank.getUsers()[to] != null) {
						User you = bank.getUsers()[to];
						System.out.println("이체할 금액 > ");
						money = sc.nextInt();
						
						bank.transfer(money, me, you);
					}else {
						System.out.println("미개설 계좌번호이거나");
						System.out.println("없는 고객 번호 입니다");
					}
				}else {
					System.out.println("미개설 계좌번호이거나");
					System.out.println("없는 고객 번호 입니다");
					
				}
				break;

			default:
				flag = false;
				System.out.println("==========뱅킹시스템 종료========");
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
