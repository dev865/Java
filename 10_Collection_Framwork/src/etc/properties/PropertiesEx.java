package etc.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 외부의 리소스와 연계를 위해
		// 자바가 Key, Value 구조를 갖은 데이터를 만들어 내거나
		// 다른 종류의 리소스, 예를 들어 텍스트, xml, tuple 등 에서
		// Key, Value의 형태로 데이터를 가져오기 위해 사용하는 클래스
		
		Properties prop = new Properties();
		prop.setProperty("driver-class", "jdbc.mysql.jdbcapi.DrivaerSpy");
		prop.setProperty("jdbcUrl", "jdbc:mysql://localhost:3306/java");
		prop.setProperty("username", "javauser");
		prop.setProperty("password", "mysql");
		
		prop.store(new FileOutputStream("database.txt"), "Database Props Text");
		prop.storeToXML(new FileOutputStream("database.xml"), "Database Props XML");
		
	}
}
