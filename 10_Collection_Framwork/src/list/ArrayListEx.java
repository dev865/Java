package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// List 인터페이스를 구현한 객체
		// 인덱스 0번부터 시작하는 시퀀스 데이터 타입
		// 배열과 비슷하지만 자료형은 객체타입을 저장하게 되어있음
		// 배열과 다른점은 크기를 유동적으로 변경할 수 있는 동적배열 형태
		// 스택구조이므로 요소들 사이에 빈 자리를 만들 수 없다
		// 브라켓([])으로 관리하지 않고 전용메서드를 사용한다
		// 자바기반으로 만들어진 모든 애플리케이션에서 데이터 저장타입으로 가장 많이 사용함
		
		List list = new ArrayList();
		list.add("Park");
		list.add("kim");
		list.add("Lee");
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		System.out.println(list);
		
		System.out.println(list.contains("Park"));
	}

}
