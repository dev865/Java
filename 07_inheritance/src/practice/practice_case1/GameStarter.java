package practice.practice_case1;

import java.util.Scanner;

public class GameStarter {

	public static void main(String[] args) {
		// 2022 - 5 - 20 주말 과제
		// midaseye@naver.com > java_2nd_hw_이름_20220523
		// 2022-05-23 14:00 전까지
		
		Scanner sc = new Scanner(System.in);
		Inventory inven = new Inventory();
		PlayGame pg = null;
		
		while (true) {
			System.out.println("원하는 캐릭터를 선택하세요 >");
			System.out.println("1. 피카츄  2. 꼬북이 3. 이상해씨 4. 파이리 Etc.종료");
			int chNum = sc.nextInt();
			if(chNum > 4) {
				break;
			}
			Character ch = inven.choiceCharacter(chNum);
			
			if(ch == null) {
				System.out.println("게임종료!");
				return;
			} else {
				pg = new PlayGame(ch);
			}
			while(pg.isFlag()) {
				pg.printMenu(sc);
				if(pg.isFlag()) {
					System.out.println("게임 종료");
					break;				
				}
			}
		}
		
	}

}
