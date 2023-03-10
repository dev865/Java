package manager;

import java.util.Date;

public class MemberVo {
	
	private int num;
	private String memberId;
	private String memberPw;
	private String nickName;
	private Date regdate; 	// java.util.Date
	public MemberVo(int num, String memberId, String memberPw, String nickName) {
		super();
		this.num = num;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.nickName = nickName;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "MemberVo [num=" + num + ", memberId=" + memberId + ", memberPw=" + memberPw + ", nickName=" + nickName
				+ ", regdate=" + regdate + "]";
	}
	
	
}
