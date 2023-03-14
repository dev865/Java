package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버로딩
			// Class.forName("driver") 를 하게되면 DriverManager에 등록되게 된다.
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("클래스 로딩 완료!");
			
			// 2. 연결하기(접속하기)
			// DriverManager.getConnection("url", "user", "password")
			String url = "jdbc:mysql://localhost/java review db";
			conn = DriverManager.getConnection(url, "javauser", "mysql");
			
			// 3. 쿼리 수행을 위한 Statement 객체 생성
			stmt = conn.createStatement();
			
			// 4. SQL 쿼리 작성
            // 주의사항
            //  - JDBC에서 쿼리를 작성할 때는 세미콜론(;)을 빼고 작성한다.
			String sql = "SELECT NUM, MEMBERID, NICKNAME FROM MEMBER";
			
			// 5. 쿼리 수행
			// 레코드들은 ResultSet 객체에 추가된다.
			rs = stmt.executeQuery(sql);
			
			// 6,실행결과 출력하기
			// rs.next는 다음 레코드로 커서를 옮기는것
			while(rs.next()) {
				// 레코드의 칼럼은 배열과 달리 0부터 시작하지않고 1부터 시작한다.
				// 가져오는 데이터의 형태에 맞게 getString, getInt 등 사용
				int num = rs.getInt(1);
				String memberId = rs.getString(2);
				String nickName = rs.getString(3);
				
				System.out.println("NUM : "+ num + " MEMBERID : " + memberId + " NICKNAME : "+ nickName);
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}
		catch(SQLException e) {
			System.out.println("에러 : " + e);
		}
		finally {
			if(rs != null) {
				try {
					rs.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
