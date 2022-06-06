package conditions;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// 현재시간을 (24시간 기준)을 입력받아
		// 9시 이전이면 굿모닝 출력
		// 14시 이전이면 굿앱터눈
		// 22시 이전이면 굿나잇
		System.out.println("시간을 적어주세요");
		Scanner sc = new Scanner(System.in);
		int now = sc.nextInt();
		
		if(now < 9) {
			System.out.println("good morning");
		} else if(now < 14) {
			System.out.println("good afternoon");
		} else if(now <22) {
			System.out.println("good night");
		}
	}
}
