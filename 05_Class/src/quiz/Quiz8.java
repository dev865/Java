package quiz;
//	3. 아래의 조건을 참고 및 추리하여 코드를 작성해보세요.
//	a. 클래스명 : Ex03
//	-필드명 : base : double (초기값:5.0)
//	height : double (초기값:3.5) 
//	-메서드명: getArea() : double
//	getHypotenuse() : double 
//	getPerimeter() : double
//	-공 식:
//	-삼각형의넓이=(밑변*높이)/2 
//	-빗변길이 = Math.sqrt(밑변*밑변+높이*높이) 
//	-둘레길이 = 밑변 + 높이 + 빗변길이 
//	-Ex03로 객체 ob를 생성
//	-getArea()는 삼각형의 넓이를 리턴 -getHypotenuse() 빗변의 길이를 리턴 -getPerimeter()는 둘레길이를 리턴

public class Quiz8 {

	//	b. 출력 예)
	//	삼각형의넓이 : 8.75
	//	빗변길이 : 6.10 둘레길이 : 14.60
	
	public static void main(String[] args) {
		Ex03 mine = new Ex03();
		mine.base = 3.3;
		mine.height = 6.6;
		double area = mine.getArea();
		double hypo = mine.getHypotenuse();
		double peri = mine.getPerimeter(mine.getHypotenuse());
		
		System.out.println("삼각형의 넓이 : " + area);
		System.out.println("빗변길이 : " + hypo);
		System.out.println("둘레길이 : " + peri);
	}
}

class Ex03 {
	double base = 5.0;
	double height = 3.5;
	
	public double getArea(){
		//getArea()는 삼각형의 넓이를 리턴
		return (base * height * 0.5); 
	}
	public double getHypotenuse() {
		//getHypotenuse() 빗변의 길이를 리턴
		return Math.sqrt(base*base*height*height);
	}
	public double getPerimeter(double hyp){
		//getPerimeter()는 둘레길이를 리턴
		 return (base + height + hyp);
	}
}
