package webservice_ans;

public class WebService implements Service{
	private MySQL mysql;
	private Oracle oracle;
	
	public WebService() {
		mysql = new MySQL();
		oracle = new Oracle();
	}

	@Override
	public void register(int dbms, Member info) {
		boolean isOk = dbms > 1 ?
				oracle.insert(info) : mysql.insert(info);
		System.out.println("회원가입 " + (isOk ? "완료" : "실패"));
	}

	@Override
	public void login(int dbms, Member info) {
		boolean isOk = dbms > 1 ?
				oracle.select(info) : mysql.select(info);
		System.out.println("로그인 " + (isOk ? "완료":"실패"));
	}

	@Override
	public void edit(int dbms, Member info) {
		boolean isOk = dbms > 1 ?
				oracle.update(info) : mysql.update(info);
		System.out.println("회원수정 " + (isOk ? "완료":"실패"));
	}

	@Override
	public void resign(int dbms, String email) {
		boolean isOk = dbms > 1 ? 
				oracle.delete(email) : mysql.delete(email);
		System.out.println("회원탈퇴 " + (isOk ? "완료" : "실패"));
	}

	@Override
	public Member[] getList(int dbms) {
		return dbms > 1 ?
				oracle.selectList() : mysql.selectList();
	}

	@Override
	public Member getMember(int dbms, String email) {		
		return dbms > 1 ? 
				oracle.select(email) : mysql.select(email);
	}
}
