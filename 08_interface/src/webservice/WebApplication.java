package webservice;

import java.util.Scanner;
// 이 곳에 웹서비스에 사용할 데이터베이스를 선택하는 메뉴를 만들고
// 데이터베이스의 선택에 따라 MySQL, Oracle 이 연결되어 작동하는 구조(연결된 디비 이름 띄우고~)
// DataBase의 인터페이스에 정의된 insert메서드의 return type을 
// boolean으로 변경 후 register("아이디값[3자이상]")으로 전달되면 정삭작동후
// true 리턴, 아니면 false 리턴을 하여 웹어플리케이션이 작동하도록 만들기


public class WebApplication {

	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true; 
		WebService svc = new WebService();
		svc.getDbms1().makememberList();
		svc.getDbms2().makememberList();
		
		while(flag) {

			System.out.println("데이터베이스 선택");
			System.out.println("1: mySQL 2: Oracle");
			int db = sc.nextInt();
			System.out.println("1: 회원가입 2: 로그인 3: 회원수정 4: 회원탈퇴 0: 프로그램 종료");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("id를 입력하세요");
				String id = sc.next();
				System.out.println("pwd를 입력하세요");
				String pwd = sc.next();
				System.out.println("nickname을 입력하세요");
				String nick = sc.next();
				System.out.println("grade를 입력하세요");
				int grade = sc.nextInt();
				svc.register(db,id, pwd, nick, grade);
				break;
			case 2:
				System.out.println("id를 입력하세요");
				String id2 = sc.next();
				System.out.println("pwd를 입력하세요");
				String pwd2 = sc.next();
				svc.login(db ,id2, pwd2);
				break;
			case 3:
				System.out.println("id를 입력하세요");
				String id3 = sc.next();
				System.out.println("pwd를 입력하세요");
				String pwd3 = sc.next();
				svc.edit(db, id3, pwd3);
				break;
			case 4:
				System.out.println("id를 입력하세요");
				String id4 = sc.next();
				System.out.println("pwd를 입력하세요");
				String pwd4 = sc.next();
				svc.resign(db, id4, pwd4);
				break;
			case 0:
				System.out.println("프로그램 종료");
				flag = false;
				break;
			default:
				break;
			}
		}
	}
}
