import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		System.out.println(list);
		
		list.removeIf(x -> x%2 == 0 || x%3 == 0);
		System.out.println(list);
		
		list.replaceAll(y -> y*5);
		System.out.println(list);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.forEach((k,v) -> System.out.println(k + " : " + v));
	}
}
