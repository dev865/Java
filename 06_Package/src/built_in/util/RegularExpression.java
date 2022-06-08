package built_in.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String[] strArr = {
				"bat", "baby", "bonus", "cA", "ca", "co", "c", "c0", "car", "combat", "count", "date", "disc"
		};
		Pattern pattern = Pattern.compile("c[a-z]*");
		for (String str : strArr) {
			Matcher matcher = pattern.matcher(str);
			if(matcher.matches()) {
				System.out.println(str+",");
			}
		}
	}
}
