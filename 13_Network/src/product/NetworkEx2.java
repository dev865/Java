package product;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class NetworkEx2 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		URL url = new URL("https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=105");
		// URL : Uniformed Resource Location : 정형화된 자원 위치
		
		System.out.println("1 : " + url.getAuthority());
		System.out.println("2 : " + url.getContent());
		System.out.println("3 : " + url.getPort());
		System.out.println("4 : " + url.getProtocol());
		System.out.println("===============================");		// 가장 1순위로 알아야될것
		System.out.println("5 : " + url.getHost());
		System.out.println("6 : " + url.getPath());
		System.out.println("7 : " + url.getQuery());
		System.out.println("===============================");
		System.out.println("8 : " + url.getRef());
		System.out.println("9 : " + url.getUserInfo());
		System.out.println("10 : "+ url.toURI());
	}
}