package sort;

public class SelectionSort {

	public static void main(String[] args) {
		// 선택정렬
		// 전체 값중에 특정한 목적값을 선택하여 정렬하는 기법
		// 동일한 값일 경우는 교환하지 않는다
		int[] intArr = new int[10];
		for(int i = 0; i <intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random()*100)+1);
		}
		for (int i = 0; i < intArr.length; i++) {
			int minIdx = i;
			int minVal = intArr[minIdx];
			for (int j = i; j < intArr.length; j++) {
				if(intArr[j] < minVal) {
					minVal = intArr[j];
					minIdx = j;
				}
			}
			int temp = intArr[i];
			intArr[i] = intArr[minIdx];
			intArr[minIdx] = temp;
		}
		for (int i : intArr) {
			System.out.println("i : " + i);
		}
	}
}