package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		// Q3. 아래와 같은 출력문을 만들어보세요
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// ABCDEFGHIJKLMNOPQRSTUVWXY
		// ABCDEFGHIJKLMNOPQRSTUVWX
		// ABCDEFGHIJKLMNOPQRSTUVW
		// ABCDEFGHIJKLMNOPQRSTUV
		// ABCDEFGHIJKLMNOPQRSTU
		// ABCDEFGHIJKLMNOPQRST
		// ......
		// ....
		// ...
		// AB
		// A

		// supported by 박창수
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(0, str.length() - i));
		}

		// supported by 김성우
		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = str2.length(); i > 0; i--) {
			System.out.println(str2.substring(0, i));
		}

		// supported by 이슬기
		for (char i = 'Z'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		// supported by 채정임 
		for (int j = 0; j < 26; j++) {
			for (int i = 65; i < (91 - j); i++) {
				System.out.print((char)i);
			}
			System.out.println();
		}
		
		// supported by 김세민
		for (int i = 26; i > 0; i--) {
			for (int j = 65; j < i+65; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
