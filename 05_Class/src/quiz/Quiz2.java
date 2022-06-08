package object;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("품명: >");
		String item = sc.next();
		System.out.println("수량: >");
		int qty = sc.nextInt();
		System.out.println("단가: >");
		int price = sc.nextInt();
		
		compute(item, qty, price);
	}

	private static void compute(String item, int qty, int price) {
		System.out.println("품명 : " + item);
		System.out.println("금액 : " + (qty*price));
	}
}
