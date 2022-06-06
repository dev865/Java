package loops;

import java.util.Iterator;
import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		// 원하는 단을 입력하여 그 단의 구구단을 출력해보세요
		// for 문을 이용하기 let => int
		
		System.out.println("원하는 구구단을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int myNum = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(myNum + "x" + i + "=" + myNum*i);
		}
		
		
	}
}
