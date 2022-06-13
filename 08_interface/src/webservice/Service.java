package webservice;

public interface Service {
	
	void register(int db, String id, String pwd, String nick, int grade);
	void login(int db, String id, String pwd);
	void edit(int db, String id, String pwd);
	void resign(int db, String id, String pwd);

}
