package quiz;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// Optional
		// 호텔 예약 프로그램
		//1. 메뉴 입실 퇴실 초기화
		//2. 방번호, 입실시간, 퇴실시간, 빈방인가?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇층입니까 >");
		int flrNum = sc.nextInt();
		System.out.println("방이 몇개입니까 >");
		int rNum = sc.nextInt();
		
		int[] floor = new int[flrNum];
		int[] room = new int[rNum];
		int[][] roomNum = new int[flrNum][rNum];
		int[] checkIn = new int[(flrNum*rNum)];
		int[] checkOut = new int[(flrNum*rNum)];
		int[] status = new int[(flrNum*rNum)];
		
		for(int i = 0; i < flrNum; i++) {
			for(int j = 0; j < rNum; j++) {
				roomNum[i][j] = ((i+1)*100)+(j+1);
				System.out.print(roomNum[i][j]+"\t");
			}System.out.println();
		}// 이게 메뉴 버튼을 누르면 찍히게 만들자
		
		for(int i = 0; i < flrNum; i++) {
			for(int j = 0; j < rNum; j++) {
				
			}
		}
		
		
		
		
		
	}

}
