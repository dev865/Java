package loops;

public class GuGuDan {

	public static void main(String[] args) {
		// 구구단을 찍어보자 => 중첩반복문으로!
		// \t 탭효과
		// System.out.println(); 엔터효과
		// 2 * 1 = 2	3 * 1 = 3........... 9 * 1 = 9
		//	.......................................
		//	.......................................
		//	.................................9 * 9 = 81
		
		for(int j =1; j < 10; j++) {
			for(int i =2; i<10; i++) {
				System.out.print(i + "X" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
