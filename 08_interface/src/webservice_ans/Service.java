package webservice_ans;

public interface Service {
	void register(int dbms, Member member);
	void login(int dbms, Member member);
	void edit(int dbms, Member member);
	void resign(int dbms, String email);
	
	Member[] getList(int dbms);
	Member getMember(int dbms, String email);
}
