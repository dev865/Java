package object;

import java.util.Scanner;

public class Quiz4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 사칙 연산을 누르세요");
		String input = sc.next();
		switch (input) {
		case "+":
			plus();
			break;
		case "-":
			minus();
		break;
		case "*":
			multi();
		break;
		case "/":
			division();
		break;
		case "%":
			remainder();
			break;
		default:
			break;
		}
	}
	private static void remainder() {
		System.out.println("첫번째 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		
	}
	private static void division() {
		System.out.println("첫번째 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
	private static void multi() {
		System.out.println("첫번째 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	}
	private static void minus() {
		System.out.println("첫번째 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	private static void plus() {
		System.out.println("첫번째 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
}
