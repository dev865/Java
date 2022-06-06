package basic;

public class SortArray {

	public static void main(String[] args) {
		int[] intArr = new int[12];
		// intArr에 랜덤 정수를 넣고 순차정렬과 역정렬을 구현해 보세요
		// 순차정렬
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.floor(Math.random() * 100) + 1);
		}
		for (int i = 0; i < intArr.length - 1; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] > intArr[j]) {
					int empty = intArr[j];
					intArr[j] = intArr[i];
					intArr[i] = empty;
				}
			}
		}
		for (int i = 0; i < intArr.length - 1; i++) {
			System.out.println(intArr[i]);
		}
		System.out.println("----------역정렬----------");
		// 역정렬
		for (int i = 0; i < intArr.length - 1; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] < intArr[j]) {
					int empty = intArr[j];
					intArr[j] = intArr[i];
					intArr[i] = empty;
				}
			}
		}
		for (int i = 0; i < intArr.length - 1; i++) {
			System.out.println(intArr[i]);
		}
	}
// supported by 이상현
}
