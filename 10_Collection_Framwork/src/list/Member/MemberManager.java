package list.Member;

import java.util.ArrayList;

public class MemberManager {

	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>(); 	// java 1.8이상
		MemberController mc = new MemberController();
		mc.processor(list);
	}
}
