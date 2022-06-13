package webservice;

import java.util.Scanner;

public class Oracle implements DataBase {
	private Member[] member = new Member[10];
	private int count = 0;
	Scanner sc = new Scanner(System.in);
	boolean flag = true; 
	@Override
	public boolean insert(String id,String pwd, String nick,int grade) {
		for (int i = 0; i < member.length; i++) {
			if(id.equals(member[i].getID())== true) {
				System.out.println("중복된 id 입니다.");
			 	 return false;
			}
		}
		System.out.println("중복된 id가 없습니다.");
		if(count < 10) {
			System.out.println("데이터베이스에 회원 정보를 입력하였습니다");
			member[count] = new Member(id,pwd,nick,grade);
			count++;
			return true;
		} else {
			System.out.println("이미 회원이 꽉 찾습니다");
			return false;
		}
	}
	@Override
	public Member select(String id, String pwd) {
		System.out.println("데이터베이스에서 회원 정보를 조회하였습니다");
		for (int i = 0; i < member.length; i++) {
			if(id.equals(member[i].getID())== true && pwd.equals(member[i].getPwd())) {
				System.out.println("안녕하세요" + member[i].getID() + "님");
				return member[i];
			}
		}
		System.out.println("id 혹은 pwd를 확인해보세요");
		return null;
	}
	@Override
	public void update(Member member) {
		System.out.println("데이터베이스에서 회원 정보 수정 시작합니다");
		while(flag) {
			System.out.println("변경하고싶으신 데이터는 >");
			System.out.println("1: id 2: pwd 3: nick 4: grade 0:종료");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("변경하시려는 id를 입력하세요");
				String newId = sc.next();
				member.setID(newId);
				break;
			case 2:
				System.out.println("변경하시려는 pwd를 입력하세요");
				String newPwd = sc.next();
				member.setPwd(newPwd);
				break;
			case 3:
				System.out.println("변경하시려는 nickname를 입력하세요");
				String newNick = sc.next();
				member.setNickname(newNick);
				break;
			case 4:
				System.out.println("변경하시려는 id를 입력하세요");
				int newGrade = sc.nextInt();
				member.setGrade(newGrade);
				break;
			case 0:
				System.out.println("회원정보수정 while문 종료");
			default:
				break;
			}
			System.out.println("데이터베이스에서 회원 정보를 수정하였습니다");
		}
	}

	@Override
	public void delete(String id, String pwd) {
		for (int i = 0; i < member.length; i++) {
			if(id.equals(member[i].getID())== true && pwd.equals(member[i].getPwd())) {
				System.out.println("회원정보 확인하였습니다" + member[i].getID() + "님");
				member[i] = new Member(null,null, null, 0);
				count--;
				System.out.println("데이터베이스에 회원 정보를 삭제하였습니다");
			}
		}
	}
	@Override
	public void makememberList() {
		for(int i = 0; i < 10; i++) {
			member[i] = new Member(null,null,null,0);
		}
	}

	public Member[] getMember() {
		return member;
	}

	
}
