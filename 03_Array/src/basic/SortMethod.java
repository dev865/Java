package basic;

import java.util.Arrays;
import java.util.Collections;

public class SortMethod {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[12];
//		int[] intArr = new int[12];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = new Integer((int) (Math.floor(Math.random() * 100) + 1));
//			intArr[i] = (int) (Math.floor(Math.random() * 100) + 1);
		}
		// 순차정렬
		// 기존의 배열 자체를 바꾼다
		Arrays.sort(intArr);
		
		for (int i : intArr) {
			System.out.println("i : " + i);
		}
		System.out.println("----역정렬----");
		
		// 역정렬
		// 배열의 요소 데이터 타입이 object 여야함
		Arrays.sort(intArr, Collections.reverseOrder());
		
		for (Integer i : intArr) {
			System.out.println("i : " + i);
		}
	}
}
