package webservice_ans;

public class OpenService {

	public static void main(String[] args) {
		// 1. 데이터베이스에 10개의 Member 객체가 담길 수 있다
		// 2. Member 객체는 email(중복되지 않음), pwd, nickname, grade(숫자) 속성
		// 3. 각 데이터베이스의 메서드는 WebService의 요청에 따라 멤버객체를
		// 		저장, 조회, 수정, 삭제 한다
		// 4. 각 서비스의 실행은 요청 => 처리 => 완료보고의 메세지를 띄운다
		// 5. 프로그램이 종료가 될 때까지 메뉴는 계속해서 아래의 메세지를 실행
		// 	1. 데이터베이스 선택
		// 	1.회원가입, 2.로그인, 3.회원수정, 4.회원탈퇴
		// 6. 프로그램이 종료 될 때까지 저장한 정보는 사라지면 안됨
		
		new InitService();
	}

}
