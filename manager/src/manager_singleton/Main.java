package manager_singleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// db 역할의 map
		Map<Integer, MemberVo> db = new HashMap<>();
		
		// C(insert)
		MemberVo vo1 = new MemberVo(1, "test1", "1234", "nick1");
		vo1.setRegdate(new Date());
		MemberVo vo2 = new MemberVo(2, "test2", "1234", "nick2");
		vo2.setRegdate(new Date());
		MemberVo vo3 = new MemberVo(3, "test3", "1234", "nick3");
		vo3.setRegdate(new Date());
		
		System.out.println("기본 멤버 생성 1,2,3");
		db.put(1, vo1);
		db.put(2, vo2);
		db.put(3, vo3);
		// R(select)
		
		// select all
		System.out.println("전체조회시작");
		
		// 전체 멤버 조회용 빈 memberVo list
		List<MemberVo> ls = new ArrayList<>(db.values());
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전체조회완료");
		
		// select one
		System.out.println("1번 멤버 조회 시작");
		MemberVo vo = null;
		vo = db.get(1);
		System.out.println(vo);
		
		System.out.println("4번 멤버 조회 시작");
		vo = db.get(4);
		System.out.println(vo);
		System.out.println("조회완료");
		
		// U(update)
		System.out.println("1번 멤버 수정 전 정보");
		vo = db.get(1);
		System.out.println(vo);
		
		if(vo != null) {
			vo.setMemberPw("4321");
			vo.setNickName("1nick");
			db.put(vo.getNum(), vo);
			System.out.println("1번 멤버 수정 완료");
		}
		System.out.println("1번 멤버 수정정보 확인 시작");
		vo = db.get(1);
		System.out.println(vo);
		System.out.println("수정완료");
		
		// D(delete)
		System.out.println("2번 멤버 삭제 시");
		db.remove(2);
		ls = new ArrayList<>(db.values());
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("삭제후 전체조회 완료");
		
		System.out.println("전체 삭제 시작");
		db.clear();
		ls = new ArrayList<>(db.values());
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전체 삭제 후 전체조회완료");
		// git study - second commit practice
	}
}	
