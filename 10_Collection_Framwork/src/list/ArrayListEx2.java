package list;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {

		ArrayList list2 = new ArrayList();
		list2.add("String");
		list2.add(new Integer(1));
		list2.add(new Double(1.1));
		list2.add(new Boolean(true));
		list2.add(new Object());
		list2.add(new String[] {"A","B"});
		for (Object object : list2) {
			System.out.println(object);
		}
		
		
	
	}
}