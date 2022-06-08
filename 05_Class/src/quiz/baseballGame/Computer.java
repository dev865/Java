package quiz.baseballGame;

import java.util.Scanner;

public class Computer {
	private int[] comNums = new int[3];
	private int strike;
	private int ball;
	private int count;
	
	
	public void menu(User user) {
	Scanner sc = new Scanner(System.in);
	System.out.println("--------------------------");
	System.out.println("메뉴 1: 게임 시작 2: 기록 보기");
	int menu = sc.nextInt();
	switch (menu) {
	case 1:
		randNum();
		boolean flag = true;
		while(flag) {
			user.inputThreeNums();
			compare(comNums,user.getinputNums());
			if(strike == 3) {
				flag = false;
			}
		}
		
		break;

	default:
		break;
	}
	
}
	public int[] randNum() {
		
		for(int i =0; i < comNums.length; i++) {
			comNums[i] = (int)(Math.random()*9)+1;
			if(i !=0 && comNums[i] == comNums[i-1]) {
				i--;
			}
		}
		System.out.println("컴숫자 :" + comNums[0]+ comNums[1] + comNums[2]);
		return comNums;
	}
	public void compare(int[] com, int[] human) {
		strike = 0;
		ball = 0;
		for(int i = 0; i < com.length; i++) {
			for(int j = 0; j < com.length; j++) {
				if(com[i] == human[j]) {
					if(i == j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		if(strike == 3) {
			System.out.println("축하드립니다 3스트라이크!");
		} else {
			if(strike == 0 && ball == 0) {
				System.out.println("out !"); 
			} else {
				 System.out.println("strike :" + strike + "\nball :" + ball);
			}
		}
		count++;
		System.out.println("시도횟수 : " + count);
	}
}
