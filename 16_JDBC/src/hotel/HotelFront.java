package hotel;

import java.util.Scanner;

public class HotelFront {
	boolean flag;
	Scanner sc;
	Service svc;

	public HotelFront() {
		flag = true;
		sc = new Scanner(System.in);
		service svc = new Service();
		printMenu();
	}
	private void printMenu() {
		while (flag) {
			System.out.println("--------------상품 관리 시스템-------------");
			System.out.println("1:객실현황 2:입실 3:퇴실 4:고객조회 5:객실상세조회 Etc:종료");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				roomCondition();
				break;
			case 2:
				checkIn();
				break;
			case 3:
				checkOut();
				break;
			case 4:
				search();
				break;
			case 5:
				viewRoom();
				break;
			default:
				flag = false;
				break;
			}
		}
	}
	private void viewRoom() {
		svc.selectList();
	}
	private void search() {
		
	}
	private void checkOut() {
	
	}
	private void checkIn() {
	
	}
	private void roomCondition() {
		
	}
}	
