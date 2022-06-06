package quiz;

import java.text.DecimalFormat;
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
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트에 참여할 인원 > ");
		int testerCount = sc.nextInt();
		
		String[] names = new String[testerCount];
		int[][] scores = new int[testerCount][3];
		int[] totals = new int[testerCount];
		double[] avgs = new double[testerCount];
		DecimalFormat df = new DecimalFormat("#.##");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println((i+1)+"번째 테스터 이름 입력 > ");
			names[i] = sc.next();
			
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println((i+1)+"번째 테스터의"
						+ (j==0 ? "국어" : j==1 ? "영어" : "수학") +" 점수 입력 > ");
				scores[i][j] = (int)(Math.random()*40)+61;
//				scores[i][j] = sc.nextInt();
				totals[i] += scores[i][j];
			}
			avgs[i] = (double)totals[i] / scores[i].length;
//			avgs[i] = Math.round(((double)totals[i] / scores[i].length));
		}
		
		System.out.println("============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t순위");
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+"\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.print(totals[i]+"\t");
			System.out.print(df.format(avgs[i])+"\t");
			
			int rank = 1;
			for (int r = 0; r < totals.length; r++) {
				if(totals[i] < totals[r]) {
					rank++;
				}
			}
			System.out.println(rank);
		}
	}
}
