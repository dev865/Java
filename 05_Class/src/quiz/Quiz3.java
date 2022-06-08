package object;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		System.out.println("숫자 입력");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		for(int i = 0; i < inputNum; i++) {
			System.out.println(fibo(inputNum));
		}
	}

	private static int fibo(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return (fibo(n-2)+fibo(n-1));
		}

	}
}
