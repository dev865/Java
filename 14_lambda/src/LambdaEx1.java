import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaEx1 {

	public static void main(String[] args) {
		// Java 8 부터 지원하는 표현식
		// 전체코드에서 적극적으로 활용되지는 않음
		// 일부 메서드 구현의 편리성을 위해 사용하는 편
		// 가독성이 낮은편이여서 아직 자바개발자들에게 큰 호응은 없는 편
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		for (Integer n : numbers) {
			System.out.println(n);
		}
		System.out.println("=====");
		
		numbers.forEach((n) -> {		// 이런식 에로우펑션 비슷
			System.out.println(n);
		});
		System.out.println("=========");
		Consumer<Integer> method = (n) -> {System.out.println(n);};		// 컨슈머를 이용하여 메서드화 
		numbers.forEach(method);
	}
}
