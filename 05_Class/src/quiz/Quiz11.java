package quiz;

public class Quiz11 {
//	6. 메서드 overloading을 이용하여 다음을 완성하시오 
//	(1) 클래스명 : Ex06
//		1 필드명 : PI:double(초기값:3.141593, final) 
//		2 메소드 : area(a:int):double
//		=> 원의넓이=반지름*반지름*PI 
//		area(a:int, b:int):double 
//		=>사각형의넓이=가로*세로
//		area(a:int, b:int, c:int):double
//		=>사다리꼴의 넓이=(밑변 + 윗변 )*높이/2 
//	(2)조건
//		1)각각의 area(3),area(4,5),area(3,4,7) 메서드를 만들어 결과값을 구한다
//	[결과화면]
//	원의넓이 : 28.274337 사각형의넓이 : 20.0 사다리꼴의넓이 : 24.5
	public static void main(String[] args) {
		Ex06 ex = new Ex06();
		System.out.print(ex.area(3));
		System.out.print(ex.area(4,5));
		System.out.print(ex.area(3,4,7));
	}
}
class Ex06{
	final double PI = 3.141593;
	
	double area(int a) {
		System.out.print("원의넓이 : ");
		return (a*a*PI);
	}
	double area(int a, int b) {
		System.out.print(" 사각형의넓이 : ");
		return a*b;
	}
	double area(int a , int b , int c) {
		System.out.print(" 사다리꼴의넓이 : ");
		return (((a+b)*c)*0.5);
	}
}
