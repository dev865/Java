package object;


public class Quiz1 {

	public static void main(String[] args) {
		output(10, "#");
	}
	private static void output(int a, String message) {
		for (int i = 0; i < a; i++) {
			System.out.print(message);			
		}
	}
}
