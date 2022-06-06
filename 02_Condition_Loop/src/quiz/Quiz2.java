package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// Q2. 음수나 0을 입력할때까지 숫자를 계속 입력받고
		// 음수나 0이 입력되면 지금까지 입력된 수의 총합과 평균을 구하세요
		
		int inputNum = 0, sum = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 > ");
		inputNum = sc.nextInt();
		while(inputNum > 0) {
			sum += inputNum;
			count++;
			System.out.println("숫자를 입력해주세요 > ");
			inputNum = sc.nextInt();
		}
		if(count == 0) {
			System.out.println("숫자를 하나도 입력하시지 않았습니다.");
		} else {
			System.out.printf("합계: %d, 평균: %f", sum, (float)sum/count);
		}
		// supported by 박현대
		
		
	}
}
