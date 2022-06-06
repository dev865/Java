package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// 24절기 맞추기 게임
		String[] seasonal = { 
				"입춘", "우수", "경칩", "춘분",
				"청명", "곡우", "입하",
				"소만", "망종", "하지", "소서", "대서",
				"입추", "처서", "백로", "추분",
				"한로", "상강", "입동",
				"소설", "대설", "동지", "소한", "대한" };
		// ? 번째 절기는 무엇입니까 >
		// 정답 or 오답입니다 > 정답은 ?
		// 정답을 맞출 때까지 몇 번 시도했는지 출력

		int order = (int) (Math.floor(Math.random() * 24));
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println((order + 1) + "번째 절기는 무엇입니까?");
		do {
			System.out.println("정답은?>");
			String result = sc.next();
			if (result.equals(seasonal[order])) {
				count++;
				System.out.println("정답입니다 시도횟수는" + count);
				break;
			}
			count++;
			System.out.println("틀렸습니다.");
		} while (true);
// Supported by 최성열
	}

}
