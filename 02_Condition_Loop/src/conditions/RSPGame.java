package conditions;

import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		// 가위바위보 게임만들기
		// 1. 컴퓨타가 랜덤으로 가위바위보 선택
		// 2. 나도 가위바위보를 입력
		// 3. 승무패 결과 출력
		
		System.out.println("가위 바위 보 게임 시작 > ");
		Scanner sc = new Scanner(System.in);
		int comNum = (int)(Math.floor(Math.random()*3));
		System.out.println("컴퓨터가 결정을 완료하였습니다");

		System.out.println("가위 바위 보 중 한개를 선택하여 주세요 >");
		String myChoice = sc.next();
		
		String comChoice = comNum == 0 ? "가위" : comNum == 1 ? "바위" : "보";

		if(comChoice.equals(myChoice)) {
			System.out.println("비겼습니다");
		} else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "이겼습니다" : "졌습니다");
			} else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보") ? "이겼습니다" : "졌습니다");
			} else { // 컴선택 보
				System.out.println(myChoice.equals("가위") ? "이겻습니다" : "졌습니다");
			}
		}
	}
	
}
