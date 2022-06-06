package loops;

public class WhileEx {

	public static void main(String[] args) {
		// 1 부터 20까지 합 구하기 while 이용하기
		int i =1;
		int sum = 0;
		while(i < 21) {
			sum += i;
			i++;
		}System.out.println(sum);
		
		// 1부터 100까지 홀수의합 구하기 do while 이용하기
		
		int i2 = 1;
		int oddSum = 0;
		do {
			if(i2 % 2 == 1) {
				oddSum += i2;
			}
			i2++;
		} while (i2 < 101);
		System.out.println(oddSum);
	}
}
