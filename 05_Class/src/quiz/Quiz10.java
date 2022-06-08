package quiz;

import java.util.Scanner;

class Store {
	String[] items;
	void setItem(String[] items) {
		this.items = items;
	}
	void viewItem() {
		for (String item : items) {
			System.out.println("판매상품 : " + item);
		}
	}
	String getItem(int a) {
		return items[a];
	}
}

public class Quiz10 {
	//5. 아래의 조건을 참고 및 추리하여 코드를 작성해보세요.
	// a. 3개의 상점에는 각 3개의 아이템이 존재 
	// b. 상점별 객체 생성
	// c. 각 객체에 아이템은 String 배열로 초기화 
	// d. 메뉴-> 1:아이템 리스트, 2:아이템 구입 
	// e. 상점 선택 하여 switch문으로 전달
	// f. 아이템 구입시 아이템 인덱스 값 입력 받기
	// g. 아이템 클래스 생성 후 String[] item 선언
	// h. 아이템 클래스는 setItem(String[] items), viewItem(), String getItem(int a) 메서드로 구성 
	// i. 몇 번 물건을 구입했는지 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Store abcmart = new Store();
		Store olive= new Store();
		Store mcdonald = new Store();
		abcmart.setItem(new String[] {"조던","아디다스","컨버스"});
		olive.setItem(new String[] {"틴트","고데기","헤어핀"});
		mcdonald.setItem(new String[] {"햄버거","감자튀김","콜라"});
		while(true) {
			System.out.println("매장선택 : 1.abc , 2.olive, 3: mcdonald > ");
			int shop = sc.nextInt();
			
			System.out.println("메뉴 --> 1.상품리스트 2. 아이템 구입 > ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				switch (shop) {
				case 1:
					System.out.println("abc 상품");
					abcmart.viewItem();
					System.out.println();
					break;
				case 2:
					System.out.println("올리브 상품");
					olive.viewItem();
					System.out.println();
					break;
				case 3:
					System.out.println("맥도날드 상품");
					mcdonald.viewItem();
					System.out.println();
					break;
				}				
			} else if(menu == 2) {
				System.out.println("상품번호를 누르세요");
				int sel = sc.nextInt();
				switch (shop) {
				case 1:
					System.out.println(abcmart.getItem(sel-1));
					break;
				case 2:
					System.out.println(olive.getItem(sel-1));
					break;
				case 3:
					System.out.println(mcdonald.getItem(sel-1));
					break;
				}break;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}

