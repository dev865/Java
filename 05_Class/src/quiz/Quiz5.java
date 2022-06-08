package object;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		int[] arr = input();
		int op = operator();
		calculator(arr , op);
	}
	private static int[] input() {
		int[] nums = new int[2];
		for(int i = 0; i < nums.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			int num = sc.nextInt();
			nums[i] = num;
		}
		return nums;
	}
	private static int operator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자를 입력하세요 > ");
		String op = sc.next();
		switch (op) {
		case "+":
			return 0;
		case "-":
			return 1;
		
		case "*":
			return 2;
		
		case "/":
			return 3;
		
		case "%":
			return 4;
		default:
			return 8;
		}
		
	}
	private static void calculator(int[] arr , int op) {
		int a = arr[0];
		int b = arr[1];
		switch (op) {
		case 0:
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
		case 1:
			System.out.println(a + " - " + b + " = " + (a-b));
			break;
		
		case 2:
			System.out.println(a + " * " + b + " = " + (a*b));
			break;
		
		case 3:
			System.out.println(a + " / " + b + " = " + (a/b));
			break;
		
		case 4:
			System.out.println(a + " % " + b + " = " + (a%b));
			break;
		
		}
	}
}
