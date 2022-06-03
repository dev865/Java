package printEx;

import java.util.Scanner;

public class Myinfo {
	public static void main(String[] args) {
		String name = "Lee";
		int age = 30;
		float height = 167.8f;
		double weight = 79.2;
		char blood = 'O';
		boolean vachine = false;
		long asset = 21480000000L;
		String description = "현재는 학생입니다.";
		
		Scanner sc = new Scanner(System.in);
		// 정보 입력 안내
		// 입력 받은 정보를 변수에 저장
		
		System.out.println("성을 입력하세요");
		name = sc.nextLine();	// 띄어쓰기포
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		System.out.println("키를 입력하세요");
		height = sc.nextFloat();
		System.out.println("무게를 입력하세요");
		weight = sc.nextDouble();
		System.out.println("혈액형을 입력하세요");
		blood = sc.next().charAt(0);
		System.out.println("접종여부를 입력하세요");
		vachine = sc.nextBoolean();
		System.out.println("자기소개하세요");
		description = sc.next();	//띄어쓰기 불가능
		System.out.println("자산을 적으세요");
		asset = sc.nextLong();
		
		
		
		
		// 문자: %s, 정수: %d, 실수: %f
//		System.out.printf("성: %s",name );
//		System.out.printf("나이: %d", age);
//		System.out.printf("키: %f", height );
//		System.out.printf("무게: %f", weight );
//		System.out.printf("접종여부: %s", vachine);
//		System.out.printf("자산: %d", asset );
//		System.out.printf("자기소개: %s", description );
		System.out.printf("%s,%d,%f,%f,%s,%s,%d,%s", name, age, height, weight, blood, vachine, asset, description);
	}
}
