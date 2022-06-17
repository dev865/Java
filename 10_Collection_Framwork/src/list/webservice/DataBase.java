package list.webservice;

import java.util.ArrayList;

public interface DataBase {
	boolean insert(Member member);
	boolean select(Member member);
	boolean update(Member member);
	boolean delete(String email);
	
	ArrayList<Member> selectList();
	Member select(String email);
}
