package creation;

public class Quiz_1 {

	public static void main(String[] args) {
		// 랜덤으로 정수 5개를 배열에 담는 메서드
		// 그 배열을 전달 받아 평균 연산하는 메서드
		// 정수 5개와 연산 결과를 출력하는 메서드
		// main 메서드에는 어떠한 연산식도 있으면 안됨
		// 메서드간 데이터 전달 및 호출만 있어야 함
		printResult(makeAverage(makeRandomNumbers()));
	}

	private static void printResult(double avg) {		
		System.out.println("평균값 : " + avg);
	}

	private static double makeAverage(int[] numArr) {
		int total = 0;
		for (int i : numArr) {
			total += i;
		}
		return (double)total / numArr.length;
	}

	private static int[] makeRandomNumbers() {
		int[] numArr = new int[5];
		System.out.println("5개의 정수 값");
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random()*100);
			System.out.print(numArr[i] + " ");
		}
		return numArr;
	}
}
