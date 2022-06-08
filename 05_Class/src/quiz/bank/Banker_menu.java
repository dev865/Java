package quiz.bank;

import java.util.Scanner;

public class Banker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		User me = null;
		User you = null;		
		
		BankAccount acc1 = null;
		BankAccount acc2 = null;
		
		int menu = 0;
		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;
		int money = 0;
		
		while (flag) {
			System.out.println("\n==============뱅킹 시스템============");
			System.out.println("1.계좌개설 / 2.입금 / 3.출금 / etc.종료");
			menu = sc.nextInt();
			System.out.println("---------------------------------------");
			
			switch (menu) {
			case 1:
				acc1 = new BankAccount();
				me =  new User("park", 10000);
				me.setAccount(acc1);
				System.out.println("계좌 개설 완료");
				System.out.println(me.toString());
				System.out.println(me.getAccount().toString());
				
				acc2 = new BankAccount();
				you =  new User("you", 50000);
				you.setAccount(acc2);
				System.out.println("계좌 개설 완료");
				System.out.println(you.toString());
				System.out.println(you.getAccount().toString());
				break;
			case 2:
				System.out.println("입금할 금액 > ");
				money = sc.nextInt();
				if(money <= me.getCashAmount()) {
					me.getAccount().saving(money);
					System.out.println("입금 완료");
					me.setCashAmount(me.getCashAmount()-money);
					System.out.println(me.toString());
					System.out.println(me.getAccount().toString());						
				} else {
					System.out.println("수중에 있는돈보다 많은돈을 누르셨습니다 >");
				}
				break;
			case 3:
				System.out.println("출금할 금액 > ");
				money = sc.nextInt();
				if(money <= me.getAccount().getBalance()) {
					me.getAccount().withdraw(money);
					System.out.println("출금 완료");
					me.setCashAmount(me.getCashAmount()+money);
					System.out.println(me.toString());
					System.out.println(me.getAccount().toString());					
				}else {
					System.out.println("계좌 잔고가 부족합니다");
				}break;
			default:
				flag = false;
				System.out.println("==========뱅킹시스템 종료========");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}