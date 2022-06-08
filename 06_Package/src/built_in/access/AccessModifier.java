package built_in.access;

public class AccessModifier {

	public static void main(String[] args) {
		// 접근제한자
		// public : 모든 외부 클래스에게 오픈
		// private : 동일한 클래스의 내부 멤버변수, 멤버메서드, 내부 클래스에게만 오픈
		// 생략된 (default) : 같은 패키지에 소속된 클래스에게만 오픈
		// protected : extends(상속), implements(구현) 가 적용된 클래스에게만 오픈
		
		// public, private, default 는 범위접근제한
		// protected 는 지정접근제한
	}
}
