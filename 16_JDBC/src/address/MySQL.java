package address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQL implements DataBase {
	private Connection conn;
	private PreparedStatement pst;
	private String query ="";
	
	public MySQL() {
		DatabaseConnector dbc = DatabaseConnector.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public boolean insert(Address info) {
		query = "insert into address values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, info.getName());
			pst.setString(2, info.getTel());
			pst.setInt(3, info.getAge());
			return pst.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Address> selectList() {
		query = "select * from address";
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			List<Address> list = new ArrayList<>();
			while(rs.next()) {
				list.add(new Address(rs.getString("name"), rs.getString("tel"), rs.getInt("age")));
			}
			return list;
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Address selectOne(String name) {
		query = "select * from address where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new Address(
						rs.getString("name"),
						rs.getString("tel"),
						rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(Address info) {
		query = "update address set tel=?, age=? where name=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, info.getName());
			pst.setString(2, info.getTel());
			pst.setInt(3, info.getAge());
			return pst.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(String name) {
		boolean isOk;
		query = "delete from address where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			return pst.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
