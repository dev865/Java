package set;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		int count  = 0;
		for (int i = 0; set.size() < 10; i++) {
			int rNum = (int)(Math.random()*10)+1;
			set.add(rNum);
			count++;
		}
		System.out.println(count +":" + set);
	}
}
