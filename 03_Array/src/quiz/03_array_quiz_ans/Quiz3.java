package quiz;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// 숫자 야구 게임
		Scanner sc = new Scanner(System.in);
		int count = 0; // 시도횟수
		int[] comNum = { 0, 0, 0 }; // 컴퓨터숫자 배열
		int[] myNum = new int[3]; // 추측숫자 배열

		// 컴퓨터 숫자 중복되지 않게 추출하기
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (comNum[j] == comNum[i]) {
					i--;
					break;
				}
			}
		}
		// 컴퓨터 숫자 추출결과 체크
		for (int i : comNum) {
			System.out.print(i + " ");
		}
		while (true) {
			int stk = 0, ball = 0;
			System.out.println("숫자를 추측 > ");
			String myNumStr = sc.next(); // 숫자를 문자로 받는다
			String[] myNumStrArr = myNumStr.split(""); // 문자를 배열로 만든다
			count++;
			// 입력받은 문자를 숫자로 변환하여 배열에 저장
			for (int i = 0; i < myNumStrArr.length; i++) {
				myNum[i] = Integer.parseInt(myNumStrArr[i]);
			}
			// 숫자와 자리수 비교
			for (int i = 0; i < comNum.length; i++) { // 컴숫자를 기준으로
				for (int j = 0; j < myNum.length; j++) { // 입력 숫자를 비교
					if (comNum[i] == myNum[j] && i == j) { // 값과 자리수가 같으면
						stk++;
					} else if (comNum[i] == myNum[j] && i != j) {// 값은 같으나 자리수가 다르면
						ball++;
					}
				}
			}
			// 모든 숫자가 값과 자리수가 다르면
			if (stk == 0 && ball == 0) {
				System.out.println("OUT!");
			} else {
				System.out.print("시도 횟수 : " + count);
				System.out.println(" > " + stk + "S " + ball + "B");
			}
			if (stk == 3) {
				System.out.println("게임종료 : 총 시도횟수 : " + count);
				break;
			}
		}
	}
}
