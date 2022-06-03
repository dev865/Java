package dataType;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello Java World";
		
		// 길이
		System.out.println(str.length());
		
		// 인덱스
		System.out.println(str.indexOf('W')); 	// 단일 문자 값의 인덱스 (char)
		System.out.println(str.indexOf("ll"));	// 일치하는 문자열의 시작 인덱스(String)
		System.out.println(str.indexOf("J"));	// 지정한 인덱스로부터 찾기
		System.out.println(str.lastIndexOf('l')); //마지막으로 나타나는 문자값 인덱스
		System.out.println(str.lastIndexOf("Wo")); //마지막으로 나타나는 문자열의 시작 인덱스
		System.out.println(str.lastIndexOf('l', 7)); // 지정한 인덱스로부터 찾기(char, String 모두 가능)
		
		// 특정 인덱스에 해당하는 char 리턴
		System.out.println(str.charAt(7));
		
		// 특정 문자값 존재여부
		System.out.println(str.contains("Java"));
		
		// 특정 문자값과 동일여부 [중요 : 문자값 비교할 때 반드시 equals()를 사용할 ]
		// String은 참조자료형이기 때문에 서로다른 주소값을 갖고 있음
		// 비교연산자는 값만 비교하기 때문에 참조자료형을 비교연산하게 되면 false를 리턴함
		System.out.println(str.equals("Hello Java World"));
		System.out.println(str.equalsIgnoreCase("hello java world"));
		
		// 대소문자 변환
		System.out.println(str.toLowerCase());
		System.out.println("hello java world".toUpperCase());
		
		// 비어있는 값인지 판단
		System.out.println(str.isEmpty());
		
		// 문자값 대체
		System.out.println(str.replace("W", "w"));
		
		// 문자열 분리 후  배열 리턴
		String[] strArr = str.split(""); // 구분자를 파라미터로 받는다: ""이면 한글자씩 자르기
		System.out.println(strArr[0]);
		System.out.println(strArr[strArr.length-1]);
		
		// 문자열 자르기
		System.out.println(str.substring(4)); // 4번 인덱스부터 끝까지
		System.out.println(str.substring(1, 4)); // 1번 인덱스부터 3번까지
		
		// 양쪽 공백 제
		System.out.println(str.trim());
		
		// 문자값으로 변환
		System.out.println(String.valueOf(1234578));
		
		// 문자값 비교 return => 비교하는 문자값의 아스키 코드 차이 => int return
		// 문자값 비교 각 자리를 순회하는 방식으로 비교 (최초의 다른 값을 찾아 그 차이 (아스키코드)값 리턴)
		System.out.println(str.compareTo("Hello World"));
		System.out.println(str.compareToIgnoreCase("Hello World"));
	}
}
