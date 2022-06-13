package webservice;

public interface DataBase {

	boolean insert(String id, String pwd, String nick, int grade);
	Member select(String id, String pwd);
	void update(Member member);
	void delete(String id, String pwd);
	void makememberList();

}
