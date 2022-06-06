package resursive;

public class RecursiveMethod {

	public static void main(String[] args) {
		// 재귀 메서드
		// 자신이 다시 자기를 부르는 메서드
		// 반드시 종료 조건과 연산
		// 1부터 10까지의 합을 구하시오
		// 단, 반복문을 사용하지 않음
		
		int sum = recursion(10);
		System.out.println(sum);
	}

	private static int recursion(int i) {
		if(i > 0) {
			return i + recursion(i-1);
		} else {
			return 0;
		}
	}
}
