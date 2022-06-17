package etc.enums;

import java.util.Scanner;

public class SeoulToWhere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("목적지를 입력하세요 >");
		String dest = sc.next();
		System.out.println("목적지까지 거리를 입력하세요(숫자) > ");
		int km = sc.nextInt();
		
		System.out.println(dest + "까지의 BUS 요금은 : " + Fares.BUS.fare(km));
		System.out.println(dest + "까지의 BUS 요금은 : " + Fares.KTX.fare(km));
		System.out.println(dest + "까지의 BUS 요금은 : " + Fares.AIR.fare(km));
		
		System.out.println("bus의 요금 : " + Fares.BUS.getBaseFare());
	}
}
