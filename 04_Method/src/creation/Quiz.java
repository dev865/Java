package creation;

public class Quiz {

	public static void main(String[] args) {
		// 랜덤으로 정수 5개를 배열에 담는 메서드
		// 그 배열을 전달 받아 평균 연산하는 메서드
		// 정수 5개와 연산 결과를 출력하는 메서드
		// main 메서드에는 어떠한 연산식도 있으면 안됨
		// 메서드간 데이터 전달 및 호출만 있어야 함
		
		
		// 중 !! 요 !! 중 !! 요 !! 중 !! 요 !! 중 !! 요 !!
		// _1파일처럼 줄일때 조금 혼동가능한부분
		// 17번줄의 avgMethod(random())을 집어넣으면 numArr와는 다른값일 것이다. 
		// 랜덤이 두번도니까. 그래서 _1처럼 줄이는 경우는 
		// 단발성일 경우 좋지만 오랜 지속적으로 메서드를 호출해야되는경우 좋지 않을수 잇음
		
		int[] numArr = random();
		double avg = avgMethod(numArr);	
		resultMethod(numArr, avg);
	}

	private static void resultMethod(int[] myArr, double avg) {
		System.out.println("5개의 정수의 값");
		for (int i : myArr) {
			System.out.print(i + " ");
		}
		System.out.println("평균값 : " + avg);
	}

	private static double avgMethod(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum/arr.length;
		return avg;
		
	}
	private static int[] random () {
		int[] myArr = new int [5];
		for(int i = 0; i < myArr.length; i++) {
			myArr[i] = (int)(Math.random()*10)+1;
		}
		return myArr;
	}
}
