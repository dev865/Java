package list.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	private Scanner sc = new Scanner(System.in);
	private final String MENU_STR = "1.회원가입 2.로그인 3.종료";
	private boolean flag = true;
	
	public void processor(ArrayList<Member> list) {
		while (flag) {
			System.out.println(MENU_STR);
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				String id = checkDuple(list, true);
				if(id != null) {
					System.out.println("비밀번호 입력 >");
					String pw = sc.next();
					list.add(new Member(id, pw));
				}
				break;
			case 2:
				String lgid = checkDuple(list, false);
				if(lgid != null) {
					System.out.println();
					System.out.println("비밀번호 입력 >");
					String pw = sc.next();
					memberLogin(list, lgid, pw);
				}
				break;
			default:
				flag = false;
				break;
			}
		}
	}

	private void memberLogin(ArrayList<Member> list, String lgid, String pw) {
		for (Member member : list) {
			if(lgid.equals(member.getId())) {
				if(pw.equals(member.getPw())) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
				}break;
			}
		}
	}

	private String checkDuple(ArrayList<Member> list, boolean sign) {
		System.out.println("아이디를 입력 >");
		String id = sc.next();
		if(list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if(id.equals(list.get(i).getId())) {
					return sign ? null : id;
				}
			}
			return sign ? id : null;
		} else {
			return sign ? id : null;
		}
	}
}
