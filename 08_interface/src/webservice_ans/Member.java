package webservice_ans;

public class Member {
	private String email;
	private String pwd;
	private String nickname;
	private int grade;
	
	public Member() {}

	public Member(String email, String pwd) {
		this.email = email;
		this.pwd = pwd;
	}
	
	public Member(String email, String pwd, String nickname, int grade) {
		this(email, pwd);
		this.nickname = nickname;
		this.grade = grade;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
