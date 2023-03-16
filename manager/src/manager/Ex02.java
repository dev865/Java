package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex02 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
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
			
			// 3. 쿼리 수행을 위한 prepareStatement 객체 생성 + SQL 쿼리 작성
			// 주의사항
			//  - JDBC에서 쿼리를 작성할 때는 세미콜론(;)을 빼고 작성한다.
			pstmt = conn.prepareStatement("SELECT NUM, MEMBERID, NICKNAME FROM MEMBER WHERE NUM = ?");
			
			// 4. prepareStatement 객체에 파라미터값 대입 
			// setInt(1, 1) = 첫번째 파라미터에 4을 대입
			pstmt.setInt(1, 4);
			
			// 5. 쿼리 수행
			// 레코드들은 ResultSet 객체에 추가된다.
			rs = pstmt.executeQuery();
			
			// 6.실행결과 출력하기
			// rs.next는 다음 레코드로 커서를 옮기는것
			while(rs.next()) {
				// rs.getString(컬럼순서) 를 써서 컬럼 순서에 맞는 데이터를 보여준다
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
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();					
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
