package object;

class Pet {
	String name;
	int age;
	String breeds;
	
	public void sound(String bark) {
		System.out.println("소리 : " + bark);
	}
	public int getOlder() {
		age++;
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreeds() {
		return breeds;
	}
	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}
	
}
public class Quiz7 {

	public static void main(String[] args) {
//		아래의 조건을 참고 및 추리하여 코드를 작성해보세요.
//		a. 클래스 Pet 생성하기
//		b. Pet에 age, name, breeds 멤버 변수 초기화
//		c. Pet에 void sound() 메서드 생성
//		d. Pet에 getOlder() 메서드 생성, age 1씩 증가 후 리턴 d. 각 변수 값과 age의 증가를 출력
		
		Pet mydog = new Pet();
		mydog.setAge(11);
		mydog.setName("waffle");
		mydog.setBreeds("spitz");
		mydog.sound("왈왈");
	}
}
