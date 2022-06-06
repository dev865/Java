package basic;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// 다차원 배열
		// 배열안에 다시 배열, 안쪽의 배열 안의 또 배열....
		// intArr => [[[1],[2],[3]],[[4],[5],[6]]] => 3차원 배열
		// intArr의 1차원 배열 길이는? 2 => intArr.length
		// intArr의 2차원 배열 길이는? 3 => intArr[i].length
		// intArr의 3차원 배열 길이는? 1 => intArr[i][j].length

		// 2차원 배열의 선언 및 초기화
		int[][] intArr2D = new int[2][3];
		// 3차원 배열의 선언 및 초기화
		int[][][] intArr3D = new int[2][3][1];
		// 2차원 배열의 선언 및 초기화 with value
		String[][] strArr = {
					{"a", "b", "c"},
					{"D", "E", "F"}
				};

		// 2차원 배열인 intArr2D에 랜덤 정수를 넣어보자
		System.out.print("[");
		for (int i = 0; i < intArr2D.length; i++) {
			System.out.print("[");
			for (int j = 0; j < intArr2D[i].length; j++) {
				intArr2D[i][j] = (int) (Math.floor(Math.random() * 100) + 1);
				System.out.print(intArr2D[i][j] + " ");
			}
			System.out.print("],");
		}
		System.out.print("]");
	}
}