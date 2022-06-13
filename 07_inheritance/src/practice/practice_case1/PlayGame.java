package practice.practice_case1;

import java.util.Scanner;

public class PlayGame {
	private Character character;
	private int menu;
	private boolean flag = true;
	
	public boolean isFlag() {
		return flag;
	}
	public PlayGame(Character ch) {
		this.character = ch;
		
	}
	public void printMenu(Scanner sc) {
		System.out.println("1.EAT 2.SLEEP 3.PLAY 4.TRAIN 0.EXIT");
		menu = sc.nextInt();
		playCharacter();
	}
	private void playCharacter() {
		switch (menu) {
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			character.play();
			break;
		case 4:
			character.train();
			break;
		default:
			flag = false;
			break;
		}
		character.printStatus();
	}

	
	

}
