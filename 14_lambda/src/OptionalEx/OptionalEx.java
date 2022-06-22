package OptionalEx;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// java 8이상
		// 데이터를 변수에 저장할 때나 연산의 결과를 리턴 받을 때
		// null 여부를 판단하여 NullPointException 발생을 사전에 필터링 함
		
		Optional<String> option = Optional.ofNullable("빈 값이 아니에요");
		System.out.println(option);
		System.out.println(option.get());
		System.out.println(option.isPresent());
		//System.out.println(option.isEmpty()); 	isEmpty() 11버전부터
		
		Optional<String> option2 = Optional.empty();	// null 만들기
		System.out.println(option2.orElse("빈 객체이므로 이 문자를 세팅함"));
		System.out.println(option2.orElseGet(String::new));
	}
}
