package constructor;

class Instance1{

	int i;
	String s;
	boolean flag;
	
	// 생성자란 ...
	//	특정 클래스의 이름과 같아야되는 이유: 목표 객체를 명확하게 하기 위함
	//	메서드의 형태를 갖어야되는이유 : 객체를 생성하는 동적인 역할을 하기 때문
	//	리턴 타입이 없는 이유 : 객체를 생성하는 역할이 이미 주어져 있으므로 다른 역할을 할 수 없음
	//	오버로딩을 사용하는 이유 : 객체 생성 시점에 특정 기능을 부여하기 위함( 예: 캐릭터 생성시 장비 장착 상태로 로딩)
	
	public Instance1() {
		// 디폴트 생성자는 생략되어 있다
		// super()는 생략해도 된다
	}

	// 생성자 오버로딩 : 객체나 인스턴스 생성시점에 역할을 부여할 수 있음
	public Instance1(int i, String s, boolean flag) {
		this.i = i;
		this.s = s;
		this.flag = flag;
		// super()는 생략해도 된다
	}
	
}

public class Cons {

	public static void main(String[] args) {
		Instance1 i1 = new Instance1();
	}
}
