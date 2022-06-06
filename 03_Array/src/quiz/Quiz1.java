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
				"한로",	"상강", "입동",
				"소설",	"대설", "동지", "소한", "대한"
		};
		
			// 한문제 맞출때 까지 카운트세는 코드 
		
		// ? 번째 절기는 무엇입니까 >
		// 정답 or 오답입니다 > 정답은 ?
		// 정답을 맞출 때까지 몇 번 시도했는지 출력
//		int ranNum = (int)Math.floor(Math.random()*24)+1;
//		String ranAns = seasonal[ranNum-1];
//		Scanner sc = new Scanner(System.in);
//		int cnt = 0;
//		
//		while (true) {
//			System.out.println(ranNum + "번째 절기는 무었입니까?");
//			String myAns = sc.next();
//			if(ranAns.equals(myAns)) {
//				cnt++;
//				System.out.println("정답입니다!");
//				System.out.println("시도횟수 : " + cnt);
//				break;
//			} else {
//				cnt++;
//				System.out.println("오답입니다! 다시!");
//			}
//		}
		
			// 틀릴경우 정답을 알려주고 새로운 문제를 내는 코드
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		while (true) {
			int ranNum = (int)Math.floor(Math.random()*24)+1;
			String ranAns = seasonal[ranNum-1];
			System.out.println(ranNum + "번째 절기는 무었입니까?");
			String myAns = sc.next();
			if(ranAns.equals(myAns)) {
				cnt++;
				System.out.println("정답입니다!");
				System.out.println("시도횟수 : " + cnt);
				break;
			} else {
				cnt++;
				System.out.println("오답입니다! 정답은 : "+ ranAns);
				System.out.println();
			}
		}System.out.println("프로그램 종료___");
		
		
		
	}

}
