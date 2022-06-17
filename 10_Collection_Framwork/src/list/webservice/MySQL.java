package list.webservice;

import java.util.ArrayList;

public class MySQL implements DataBase {
	private ArrayList<Member> members;

	public MySQL() {
		members = new ArrayList<Member>();
	}

	private boolean hasEmail(String email) {
		for (Member member : members) {
			if (member.getEmail().equals(email)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean insert(Member info) {

		if (hasEmail(info.getEmail())) {
			members.add(info);
			return true;
		} else {
			System.out.println("중복된 이메일이 존재합니다");
		}
		return false;
	}

	@Override
	public boolean select(Member info) {
		for (Member member : members) {
			if (member != null) {
				if (info.getEmail().equals(member.getEmail())) {
					if (info.getPwd().equals(member.getPwd())) {
						return true;
					} else {
						// 실무에서는 상세 정보 출력 하지 않음
						System.out.println("패스워드가 일치하지 않거나");
					}
				}
			}
		}
		System.out.println("이메일이 존재하지 않습니다.");
		return false;
	}

	@Override
	public boolean update(Member info) {
		for (int i = 0; i < members.size(); i++) {
			if (info.getEmail().equals(members.get(i).getEmail())) {
				members.set(i, info);
				return true;
			}
		}
		System.out.println("이메일이 존재하지 않습니다.");
		return false;
	}

	@Override
	public boolean delete(String email) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i) != null) {
				if (email.equals(members.get(i).getEmail())) {
					members.set(i, null);
					return true;
				}
			}
		}
		System.out.println("이메일이 존재하지 않습니다.");
		return false;
	}

	@Override
	public ArrayList<Member> selectList() {
		return hasMember() ? getMembers() : null;
	}

	private boolean hasMember() {
		for (Member member : members) {
			if (member != null) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	@Override
	public Member select(String email) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i) != null) {
				if (email.equals(members.get(i).getEmail())) {
					return members.get(i);
				}
			}
		}
		System.out.println("이메일이 존재하지 않습니다.");
		return null;
	}
}
