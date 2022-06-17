package list;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		// 제네릭을 사용하여 데이터 타입을 지정
		ArrayList<String> list = new ArrayList();
		list.add("A");
		list.add("B");
//		list.add(new Integer(100));	// 제네릭을 통한 타입제한
		list.add("C");
		list.add(1, "A-1"); 	// 1번 인덱스에 추가이므로 기존 1번 데이터는 뒤로 밀려남
		System.out.println(list.size());
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		// ArrayList에 데이터가 존재하지 않는다는 표현 : null 이 아님
		// list.size() == 0(권장), list.toString == "[]";
	}
}
