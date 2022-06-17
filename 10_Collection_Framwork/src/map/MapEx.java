package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		
		map.put("Lee", "1234");
		map.put("Kim", "1234");
		map.put("Gyu", "1234");
		map.put("Kii", "1234");
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw를 입력하세요");
			System.out.println("id를 입력하세요 >");
			String id = sc.next();
			System.out.println("pw를 입력하세요 >");
			String pw = sc.next();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인");
				} else {
					System.out.println("비밀번호 다름");
				}
			} else {
				System.out.println("아이디 없음");
				break;
			}
		}
	}
}
