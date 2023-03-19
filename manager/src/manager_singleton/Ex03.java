package manager_singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex03 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		JdbcConnectionUtil util = JdbcConnectionUtil.getInstance();
		
		try {
			// 1. 드라이버로딩
			// Class.forName("driver") 를 하게되면 DriverManager에 등록되게 된다.
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("클래스 로딩 완료!");
			
			// 2. 연결하기(접속하기)
			// DriverManager.getConnection("url", "user", "password")
			conn = util.getConnection();
			System.out.println("접속 성공");
			
			// 3. StringBuffer 또는 String으로 쿼리문을 만든다.
			StringBuffer query = new StringBuffer();
			query.append("insert into MEMBER ");
			query.append("(MEMBERID, MEMBERPW, NICKNAME) ");
			query.append("values (?,?,?)");
			System.out.println(query.toString());
			
			// 4. connection에 prepareStatement()를 사용하여 준비한 쿼리문을 넣어준다.
			pstmt = conn.prepareStatement(query.toString());
			
			// 5. prepareStatement 객체에 파라미터값 대입 
			// setInt(1, 1) = 첫번째 파라미터에 4을 대입
			pstmt.setString(1, "tester7");
			pstmt.setString(2, "test7");
			pstmt.setString(3, "testNick7");
			
			// 6. 쿼리 수행
			// excuteUpdate는 숫자를 반환한다.
			result = pstmt.executeUpdate();
			System.out.println(result + "행이 삽입되었습니다");
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}
		catch(SQLException e) {
			System.out.println("에러 : " + e);
		}
		finally {
			util.close(rs);
			util.close(conn);
			util.close(pstmt);
		}
	}
}
