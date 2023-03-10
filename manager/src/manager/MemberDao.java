package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberDao {
	// db역할
	private Map<Integer, MemberVo> db = new HashMap<>();
	
	// C
	public void insertMember(MemberVo vo) {
		vo.setRegdate(new Date());
		db.put(vo.getNum(), vo);
	}
	
	// R
	public MemberVo selectMember(int num) {
		return db.get(num);
	}
	
	public List<MemberVo> selectMemberAll(){
		return new ArrayList<MemberVo>(db.values());
	}
	
	// U
	public void updateMember(MemberVo vo) {
		db.put(vo.getNum(), vo);
	}
	
	// D
	public void deleteMember(int num) {
		db.remove(num);
	}
	
	public void deleteMemberAll() {
		db.clear();
	}
}
