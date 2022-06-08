package quiz.hotel;

import java.util.Scanner;

public class HotelMgr {
	// 과제 - 호텔예약 프로그램 만들기
	// 제출처 : miaseye@naver.com
	// 제출기한 : 2022-05-16 14:00 이전
	// 제출파일명 : java_1st_work_이름_20220516.zip

//		룸{방번호,사용자,빈방유무,체크인,체크아웃}
//		유저{이름,나이,성별}
//		호텔{방Arr, 객실현황,체크인,체크아웃.객실상세조회.투숙객조회}
	
//		룸 안에 유저를 넣자
//		호텔클래스 에서 룸클래스를 부르면 부족한것 없는듯
	
	
	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		
		Room room = new Room("1호실", null, true, null, null)
		
		
		hotel.goFrontDesk();
	}
	
	
}
