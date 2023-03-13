package manager;

import java.util.List;

public class MemberService {
	private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	// 등록하기
	public boolean regist(MemberVo vo) {
		if(memberDao.selectMember(vo.getNum()) == null) {
			System.out.println("회원가입 가능합니다.");
			memberDao.insertMember(vo);
			return true;
		}
		System.out.println("중복된 회원이 존재합니다.");
		return false;
	}
	// 조회하기
	public MemberVo read(int num) {
		return memberDao.selectMember(num);
	}
	
	// 전체조회
	public List<MemberVo> listAll(){
		return memberDao.selectMemberAll();
	}
	
	// 수정
	public void edit(MemberVo vo) {
		MemberVo searchMember = memberDao.selectMember(vo.getNum());
		if(searchMember.getMemberPw().equals(vo.getMemberPw())) {
			memberDao.updateMember(searchMember);			
		}
	}
	// 탈퇴
	public void remove(int num) {
		memberDao.deleteMember(num);
	}
	
	public void truncate() {
		memberDao.deleteMemberAll();
	}
	
}
