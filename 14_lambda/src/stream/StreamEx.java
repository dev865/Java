package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		System.out.println(list);
		list.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		// Java8 이상부터
		System.out.println("============");
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::print);
		
		
		System.out.println();
		System.out.println("============");
		String[] names = new String[] {"k","l","c", "p", "a"};
		Stream<String> stream2 = Arrays.stream(names);
		stream2.forEach(elem -> System.out.print(elem + ", "));
		System.out.println();
		System.out.println("============");
		Stream<String> stream3 = Arrays.stream(names, 1, 4);
		stream3.forEach(elem -> System.out.print(elem + "\t"));
		
		
		
		
	}
}
