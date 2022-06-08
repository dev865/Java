package quiz.baseballGame;

import java.util.Scanner;

public class StartGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Computer myMac = new Computer();
		User user = new User(3);
		Archive hardDisk = new Archive();
		boolean flag = true;
		while(flag) {
			myMac.menu(user);			
		}

	}
}
