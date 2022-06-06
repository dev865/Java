package basic;

public class MakeArray {

	public static void main(String[] args) {
		// 배열은 타입과 크기가 무조건 만들때 정의 되어야 한다!!!
		boolean[] boolArr; // 배열의 선언
		boolArr = new boolean[5]; // 초기화 할 때 반드시 크기를 정의할 것!
		
		int intArr[] = new int[10]; // 배열의 선언 및 초기화
		
		String[] strs = new String[7]; // 배열인 변수의 이름은 복수형으로 명명하길 권장
		
		float[] floats = {1.1f, 2.2f, 3.3f, 4.4f}; // 배열 초기화 표기식
		
		// 배열의 인덱스 번호는 0번부터 시작
		// 배열의 마지막 인덱스 번호는 항상 배열의 길이에서 -1을 한 값
		// 자바에서는 한 번 선언된 배열은 크기를 변경할 수 없음!!!!!!!!!!
		
		// 위의 intArr에 10개의 랜덤 정수를 넣은후 출력 해보세요
		System.out.print("[");
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random()*100))+1;
			System.out.print(intArr[i]+ " ");
		}
		System.out.print("]");
	}
}
