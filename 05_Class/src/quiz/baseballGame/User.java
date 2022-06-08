
package quiz.baseballGame;

import java.util.Arrays;
import java.util.Scanner;

public class User {
	private int[] inputNums;
	
	
	public User() {
		
	}
	public User(int a) {
		this.inputNums = new int[3];
	}
	public int[] inputThreeNums() {
		Scanner sc = new Scanner(System.in);
		System.out.println("세숫자를 적으세요");
		String myNums = sc.next();
		int first = Integer.parseInt(myNums.substring(0,1));
		int second = Integer.parseInt(myNums.substring(1,2));
		int third = Integer.parseInt(myNums.substring(2,3));
		inputNums[0] = first;
		inputNums[1] = second;
		inputNums[2] = third;
		return inputNums;
	}
	public int[] getinputNums() {
		return inputNums;
	}
}
