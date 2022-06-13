package webservice;

import java.util.Scanner;

public class WebService implements Service {
	
	private DataBase dbms1;
	private DataBase dbms2;
	Scanner sc = new Scanner(System.in);
	
	public WebService() {
		dbms1 = new MySQL();
		dbms2 = new Oracle(); 
	}
	@Override
	public void register(int db, String id,String pwd, String nick,int grade)  {
		System.out.println("회원가입 서비스 요청");
		System.out.println("회원가입" + (dbChoose(db).insert(id, pwd, nick, grade) ? "완료!" : "실패..."));
	}
	@Override
	public void login(int db, String id, String pwd) {
		System.out.println("회원로그인 서비스 요청");
		Member member = dbChoose(db).select(id, pwd);
		if(member == null) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("닉네임 " + member.getNickname() + "님 반갑습니다");
			System.out.println("로그인 완료");			
		}
	}
	@Override
	public void edit(int db, String id, String pwd) {
		System.out.println("회원 정보 수정 서비스 요청");
		Member member = dbChoose(db).select(id, pwd);
		if(member == null) {
			System.out.println("수정 실패");
		} else {
			dbChoose(db).update(member);
			System.out.println("수정 완료");			
		}
	}
	@Override
	public void resign(int db, String id, String pwd) {
		System.out.println("회원 탈퇴 서비스 요청");
		dbChoose(db).delete(id, pwd);
		System.out.println("탈퇴 완료");

	}
	public DataBase dbChoose(int db) {
		if(db > 1) {
			return dbms2;
		} else {
			return dbms1;
		}
	}
	public DataBase getDbms1() {
		return dbms1;
	}
	public DataBase getDbms2() {
		return dbms2;
	}
}
