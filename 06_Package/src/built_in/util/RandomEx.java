package built_in.util;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// 랜덤숫자를 만들수 있는 클래스
		int rnum = (int)(Math.random()*45)+1;
		int rnum2 = (int)(Math.floor(Math.random()*100))+1;
		
		Random r = new Random();
//		랜덤수를 만들어 낼 때 사용하는 기준값 100을 적용하여
//		같은 확률상에서 랜덤숫자를 생성할 수 있도록 하는 방법
//		Random r = new Random(100L); 
		int rInt = r.nextInt(100)+1; // 1~100
		System.out.println(rInt);
	}
}
