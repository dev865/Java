package tryCatch;

public class ArrayException {
	private static void continueMethod() {
		System.out.println("예외가 발생했으니.....여기로 온건");
	}
	public static void main(String[] args) {
		int[] arr =new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i+1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			continueMethod();
		}
		
	}
}
