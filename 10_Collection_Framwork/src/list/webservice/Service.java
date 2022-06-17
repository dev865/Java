package list.webservice;

import java.util.ArrayList;

public interface Service {
	void register(int dbms, Member member);
	void login(int dbms, Member member);
	void edit(int dbms, Member member);
	void resign(int dbms, String email);
	
	ArrayList<Member> getList(int dbms);
	Member getMember(int dbms, String email);
}
