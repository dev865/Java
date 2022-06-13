package webservice_ans;

public class Oracle implements DataBase {
	private Member[] members;
	
	public Oracle() {
		members = new Member[10];
	}

	@Override
	public boolean insert(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean select(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Member[] selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member select(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
