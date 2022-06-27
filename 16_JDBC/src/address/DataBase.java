package address;

import java.util.List;

public interface DataBase {
	boolean insert(Address info);
	List<Address> selectList();
	Address selectOne(String name);
	boolean update(Address info);
	boolean delete(String name);
}
