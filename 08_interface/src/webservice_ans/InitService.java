package webservice_ans;

import java.util.Scanner;

public class InitService {
	private Scanner sc;
	private boolean flag;
	private WebService websvc;

	public InitService() {
		sc = new Scanner(System.in);
		flag = true;
		websvc = new WebService();
		menuService();
	}

	private void menuService() {
		while (flag) {
			System.out.println("데이터베이스를 선택하세요");
			System.out.println("1.MySQL 2.Oracle Etc.종료");
			int db = sc.nextInt();

			if (db == 1 || db == 2) {
				boolean flag2 = true;

				while (flag2) {
					System.out.println("서비스를 선택하세요");
					System.out.println("1.회원가입 2.로그인 3.회원수정 4.회원탈퇴" + " 5.회원리스트 6.회원조회 Etc.DB변경");
					int svc = sc.nextInt();

					switch (svc) {
					case 1:
						websvc.register(db, getRegInfo());
						break;
					case 2:
						websvc.login(db, getLoginInfo());
						break;
					case 3:
						websvc.edit(db, getEditInfo());
						break;
					case 4:
						websvc.resign(db, getEmailInfo(true));
						break;
					case 5:
						Member[] list = websvc.getList(db);
						printList(list);
						break;
					case 6:
						Member member = websvc.getMember(db, getEmailInfo(false));
						printMember(member);
						break;
					default:
						flag2 = false;
						break;
					}
				}

			} else {
				flag = false;
				System.out.println("프로그램 종료");
			}
		}
	}

	private void printMember(Member member) {
		if (member != null) {
			System.out.println("Email : " + member.getEmail());
			System.out.println("PWD : " + member.getPwd());
			System.out.println("Nickname : " + member.getNickname());
			System.out.println("Grade : " + member.getGrade());
		} else {
			System.out.println("검색한 회원이 존재하지 않습니다");
		}

	}

	private void printList(Member[] list) {
		if (list != null) {
			System.out.println("Email\t PWD\t Nickname\t Grade");
			for (Member member : list) {
				if (member != null) {
					System.out.print(member.getEmail() + "\t");
					System.out.print(member.getPwd() + "\t");
					System.out.print(member.getNickname() + "\t");
					System.out.println(member.getGrade());
				}
			}
		} else {
			System.out.println("회원 목록이 존재하지 않습니다");
		}
	}

	private String getEmailInfo(boolean sign) {
		System.out.println("회원" + (sign ? "탈퇴" : "조회") + "를 시작합니다");
		System.out.println("Email 입력 > ");
		String email = sc.next();
		return email;
	}

	private Member getEditInfo() {
		System.out.println("회원수정을 시작합니다");
		System.out.println("Email 입력 > ");
		String email = sc.next();
		System.out.println("PWD 입력 > ");
		String pwd = sc.next();
		System.out.println("NickName 입력 > ");
		String nick = sc.next();
		System.out.println("GRADE 입력 > ");
		int grade = sc.nextInt();
		return new Member(email, pwd, nick, grade);
	}

	private Member getLoginInfo() {
		System.out.println("로그인을 시작합니다");
		System.out.println("Email 입력 > ");
		String email = sc.next();
		System.out.println("PWD 입력 > ");
		String pwd = sc.next();
		return new Member(email, pwd);
	}

	private Member getRegInfo() {
		System.out.println("회원가입을 시작합니다");
		System.out.println("Email 입력 > ");
		String email = sc.next();
		System.out.println("PWD 입력 > ");
		String pwd = sc.next();
		System.out.println("NickName 입력 > ");
		String nick = sc.next();
		return new Member(email, pwd, nick, 0);
	}
}
