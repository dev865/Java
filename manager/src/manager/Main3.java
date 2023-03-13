package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// DAO
public class Main3 {
	public static void main(String[] args) {
		MemberService memberService = new MemberService(new MemberDao());
		
		// C(insert)
		System.out.println("C");
		MemberVo vo1 = new MemberVo(1, "test1", "1234", "nick1");
		vo1.setRegdate(new Date());
		MemberVo vo2 = new MemberVo(2, "test2", "1234", "nick2");
		vo2.setRegdate(new Date());
		MemberVo vo3 = new MemberVo(3, "test3", "1234", "nick3");
		vo3.setRegdate(new Date());
		
		System.out.println("기본 멤버 생성 1,2,3");
		memberService.regist(vo1);
		memberService.regist(vo2);
		memberService.regist(vo3);
		System.out.println("저장 완료!");
		
		// R(select)
		System.out.println("");
		System.out.println("R");
		
		// select all
		System.out.println("전체조회시작");
		
		// 전체 멤버 조회용 빈 memberVo list
		List<MemberVo> ls = memberService.listAll();
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		
		System.out.println("전체조회완료");
		
		// select one
		System.out.println("1번 멤버 조회 시작");
		MemberVo vo = null;
		vo = memberService.read(1);
		System.out.println(vo);
		
		System.out.println("4번 멤버 조회 시작");
		vo = memberService.read(4);
		System.out.println(vo);
		System.out.println("조회완료");
		
		// U(update)
		System.out.println("");
		System.out.println("U");
		System.out.println("1번 멤버 수정 전 정보");
		vo = memberService.read(1);
		System.out.println(vo);
		
		if(vo != null) {
			vo.setMemberPw("4321");
			vo.setNickName("1nick");
			memberService.edit(vo);
			System.out.println("1번 멤버 수정 완료");
		}
		System.out.println("1번 멤버 수정정보 확인 시작");
		vo = memberService.read(1);
		System.out.println(vo);
		System.out.println("수정완료");
		
		// D(delete)
		System.out.println("");
		System.out.println("D");
		System.out.println("2번 멤버 삭제 시작");
		memberService.remove(2);
		ls = memberService.listAll();
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("삭제후 전체조회 완료");
		
		System.out.println("전체 삭제 시작");
		memberService.truncate();
		ls = memberService.listAll();
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전체 삭제 후 전체조회완료");
		// git study - second commit practice
	}
}	
