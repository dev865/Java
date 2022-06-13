package webservice;

public class Member {
	
	private String id;
	private String pwd;
	private String nickname;
	private int grade;
	
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
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
	public Member(String id, String pwd, String nickname, int grade) {

		this.id = id;
		this.pwd = pwd;
		this.nickname = nickname;
		this.grade = grade;
	}
	public Member() {
		
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", nickname=" + nickname + ", grade=" + grade + "]";
	}
	
	
}
