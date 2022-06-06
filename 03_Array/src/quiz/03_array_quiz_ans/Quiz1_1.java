package quiz;

import java.util.Scanner;

public class Quiz1_1 {

	public static void main(String[] args) {
		String[] seasonal = { 
				"입춘", "우수", "경칩", "춘분",
				"청명", "곡우", "입하",
				"소만", "망종", "하지", "소서", "대서",
				"입추", "처서", "백로", "추분",
				"한로", "상강", "입동",
				"소설", "대설", "동지", "소한", "대한" };
		String ans = "";
		int order = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		do {
			order = (int)(Math.random()*24);
			count++;
			System.out.println((order+1)+"번째 절기는?");
			ans = sc.next();
			if(seasonal[order].equals(ans)) {
				System.out.println("정답입니다!");
				System.out.println("시도 횟수:" + count);
				break;
			}else {
				System.out.println("오답입니다! => 정답 : " + seasonal[order]);
			}
			
		} while (!seasonal[order].equals(ans));
		System.out.println("프로그램 종료!");
	}
}
