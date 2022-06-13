package webservice_ans;

public interface DataBase {
	boolean insert(Member member);
	boolean select(Member member);
	boolean update(Member member);
	boolean delete(String email);
	
	Member[] selectList();
	Member select(String email);
}
