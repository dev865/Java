package conditions;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// 영어로 계절을 입력하면 (대소문자 구분하지 않음)
		// 한국어로 번역하여 출력하는 프로세스 만들어보기
		// switch case 문으로 작성
		
		System.out.println("영어로 계절을 적어보세요");
		Scanner sc = new Scanner(System.in);
		String season = sc.next().toLowerCase();
		switch(season) {
		case "spring":
			System.out.println("봄이구나");
			break;
		case "summer":
			System.out.println("여름이구나");
			break;
		case "fall":
			System.out.println("가을이구나");
			break;
		case "winter":
			System.out.println("겨울이구나");
			break;
		}
	}
}
