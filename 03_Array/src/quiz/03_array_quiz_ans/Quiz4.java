package quiz;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// Optional
		// 호텔 예약 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("호텔의 층 수를 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층 당 방 개수를 입력 > ");
		int roomCount = sc.nextInt();
		
		// 호텔 배열 만들기
		int[][] hotel = new int[floorCount][roomCount];
		int menu = 0;
		boolean flag = true;
		
		// 모든 방을 비어있는 방으로 만드는 초기화 작업 : 0으로 초기화
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				hotel[i][j] = 0;
			}
		}
		
		while (flag) {
			System.out.println("\n===============호텔 관리 메뉴================");
			System.out.println("1.객실 현황   2.입실   3.퇴실   Etc.종료");
			System.out.println(">>>>>>>>>>>>>>>> 메뉴 번호 입력 >>>>>>>>>>>>>>>");
			menu = sc.nextInt();
			
			String roomNum = ""; // 입실,퇴실 입력방번호
			int floor = 0, room = 0; // 호텔의 방번호의 배열 인덱스
			switch (menu) {
			case 1: // 방 리스트
				for (int i = 0; i < hotel.length; i++) {
					for (int j = 0; j < hotel[i].length; j++) {
						System.out.print((i+1)+(j < 9 ? "0" : "")+(j+1)+"호:");
						System.out.print(hotel[i][j]==0 ? "입실가능" : "사용중");
						System.out.print("\t");
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("입실할 방번호 입력 > ");
				roomNum = sc.next();
				if(roomNum.length() > 3) { // 호텔이 10층이상이면
					floor = Integer.parseInt(roomNum.substring(0, 2))-1;
					room = Integer.parseInt(roomNum.substring(2))-1;
				}else { // 호텔이 10층 미만이면
					floor = Integer.parseInt(roomNum.substring(0, 1))-1;
					room = Integer.parseInt(roomNum.substring(1))-1;
				}
				if(hotel[floor][room] == 0) {
					hotel[floor][room] = 1;
					System.out.println(roomNum + "호 입실완료");
				}else {
					System.out.println(roomNum + "호는 사용중 > 다른방을 선택하세요");
				}
				break;
			case 3:
				System.out.println("퇴실할 방번호 입력 > ");
				roomNum = sc.next();
				if(roomNum.length() > 3) { // 호텔이 10층이상이면
					floor = Integer.parseInt(roomNum.substring(0, 2))-1;
					room = Integer.parseInt(roomNum.substring(2))-1;
				}else { // 호텔이 10층 미만이면
					floor = Integer.parseInt(roomNum.substring(0, 1))-1;
					room = Integer.parseInt(roomNum.substring(1))-1;
				}
				if(hotel[floor][room] == 1) {
					hotel[floor][room] = 0;
					System.out.println(roomNum + "호 퇴실완료");
				}else {
					System.out.println(roomNum + "호는 빈 방 > 다른방을 선택하세요");
				}
				break;
			default:
				System.out.println("저희 호텔을 이용해 주셔서 감사합니다");
				flag = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
}