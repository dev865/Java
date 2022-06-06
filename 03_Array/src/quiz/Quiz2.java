package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// 테스트에 참여할 인원수를 입력하세요 > 3 
		// 1번째 사람의 이름을 입력하세요 > 
		// 1번째 사람의 국어점수 입력 > 
		// 1번째 사람의 영어점수 입력 > 
		// 1번째 사람의 수학점수 입력 >
		// ......
		// 3번째 사람의 수학점수 입력 > 
		
		// 이름  국어  영어  수학  총점  평균
		// aaa   88    99    87    ?     ?
		// ......
		System.out.println("몇명입니까?");
		Scanner sc = new Scanner(System.in);
		int pNum = sc.nextInt();
		String[] subject = {"국어","영어","수학"};
		int[][] wholeArr = new int[pNum][subject.length];
		
		
		for(int i =0; i < pNum; i++) {
			for(int j = 0; j < subject.length; j++) {
				System.out.println(subject[j]+"점수를 입력하세요 >");
				int score = sc.nextInt(); 
				wholeArr[i][j] = score;
			}
		}
		
		for(int i =0; i < subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}System.out.print("총합\t"+"평균");
		System.out.println();
		
		for(int i =0; i < pNum; i++) {
			int total = 0;
			for(int j = 0; j < subject.length; j++) {
				total += wholeArr[i][j];
				System.out.print(wholeArr[i][j]+ "\t");
			}
			System.out.print(total+ "\t"+ (double)(total/(subject.length)));
			System.out.println();
		}
	}

}
