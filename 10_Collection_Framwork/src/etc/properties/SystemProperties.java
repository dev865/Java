package etc.properties;

import java.util.Properties;

public class SystemProperties {

	public static void main(String[] args) {
		Properties sysProps = System.getProperties();
		
		System.out.println("java version : " + sysProps.getProperty("java.version"));
		
		System.out.println("user language : " + sysProps.getProperty("user.language"));
		
		sysProps.list(System.out);
	}
}