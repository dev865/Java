package quiz.hotel;

import java.util.Iterator;
import java.util.Scanner;

public class Hotel {
	private Room[][] rooms;	
	Scanner sc = new Scanner(System.in);
	
	
	public Hotel() {
		buildHotel();
	}
	private void buildHotel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("호텔의 층 수 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층 당 방 수 입력 >");
		int roomCountPerFloor = sc.nextInt();
		rooms = new Room[floorCount][roomCountPerFloor];
		initializeRooms();
	}
	private void initializeRooms() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = new Room(makeRoomNumber(i, j),null,true,null,null);
			}
		}
	}
	
	private String makeRoomNumber(int f, int r) {
		return String.valueOf(f+1) + (r < 9 ? "0" : "" ) + String.valueOf(r+1);
	}
	public void goFrontDesk() {
		int menu = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.println("\n====================== 호텔 관리 메뉴 =====================");
			System.out.println("1:객실현황 2:입실 3:퇴실 4:객실상세조회 5:투숙객리스트 6:투숙객조회 Etc:종료");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> 메뉴 선택 >>>>>>>>>>>>>>>>>>>>>>>>>>");
			menu = sc.nextInt();
			
			flag = choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
		
	}

	private boolean choiceMenu(int menu) {
		Scanner sc = new Scanner(System.in);
		String roomNum = "";
		switch (menu) {
		case 1:
			viewRoomsStatus();
			break;
		case 2:
			System.out.println("입실할 방번호 입력 >");
			roomNum = sc.next();
			roomCheckIn(roomNum);
			break;
		case 3:
			System.out.println("입실할 방번호 입력 >");
			roomNum = sc.next();
			roomCheckOut(roomNum);
			break;
		case 4:
			System.out.println("조회할 방 번호 입력 > ");
			roomNum = sc.next();
			getRoomDetail(roomNum);
			
			break;
		case 5:
			getUserList();
			
			break;
		case 6:
			String name = sc.next();
			searchUser(name);
			break;
		default:
			break;
		}
		return true;
	}
	private void searchUser(String name) {
		for (Room[] roomsArr : rooms) {
			for (Room room : roomsArr) {
				if(room.getUser() != null) {
					if(name.equals(room.getUser().getName()))
						System.out.println(room);					
				}
			}
		}
	}
	private void getUserList() {
		for (Room[] roomsArr : rooms) {
			for (Room room : roomsArr) {
				System.out.print(room.getRoomNum()+ ":");
				System.out.println(room.getUser());
			}
		}
	}
	private void getRoomDetail(String roomNum) {
		int[] fr = getIndexOfFloorAndRoom(roomNum);
		int floor = fr[0];
		int room = fr[1]; 
		if(rooms[floor][room].isEmpty()) {
			System.out.println("빈방입니다");
		} else {
			System.out.println(rooms[floor][room]);
			System.out.println(rooms[floor][room].getUser());
		}
	}
	private void roomCheckOut(String roomNum) {
		int[] fr = getIndexOfFloorAndRoom(roomNum);
		int floor = fr[0];
		int room = fr[1]; 
		if(!rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(true);
			rooms[floor][room].setUser(null);
			rooms[floor][room].setCheckInTime(null);
			rooms[floor][room].setCheckOutTime("???");
			System.out.println(roomNum + "호 퇴실완료");
		} else {
			System.out.println(roomNum + "호는 현재 빈방 > 다른방을 선택하세요");
		}
	}
	private int[] getIndexOfFloorAndRoom(String roomNum) {
		int room = 0;
		int floor = Integer.parseInt(roomNum.substring(0,1))-1;
		if(roomNum.charAt(1) == '0') {
			room = Integer.parseInt(roomNum.substring(roomNum.length() -1))-1;
		}else {
			room = Integer.parseInt(roomNum.substring(roomNum.length() -2))-1;
		}
		return new int[] {floor, room};
		
	}
	private void roomCheckIn(String roomNum) {
		int[] fr = getIndexOfFloorAndRoom(roomNum);
		int floor = fr[0];
		int room = fr[1];
		if(rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(false);
			User user = getUserInfo();
			rooms[floor][room].setUser(user);
			rooms[floor][room].setCheckInTime("???");
			rooms[floor][room].setCheckInTime(null);
			
			System.out.println(roomNum + "호 입실완료");
		} else {
			System.out.println(roomNum + "호는 현재 사용중 > 다른방을 선택하세요");
		}
	}
	private User getUserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("투숙객 정보 입력");
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("성별 > ");
		char gen = sc.next().charAt(0);
		return new User(name, age, gen);
	}
	private void viewRoomsStatus() {
		/// 000호 : 입실가능 or 사용중
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j].getRoomNum() + "호:");
				System.out.print(rooms[i][j].isEmpty() ? "입실가능" : "사용중" );
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}

















