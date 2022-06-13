package innerClass;

import java.awt.Button;
import java.awt.event.ActionEvent;

public class AnonymousClass {

	public static void main(String[] args) {
		Button btn = new Button("Start");
		// 안드로이드에서 많이 사용하는 구조
		// 인터페이스를 implementsg한 클래스를 익명으로 만들어 객체로 구현함
		btn.addActionListener(new ActionListner() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent Occured");
			}
		});
	}
}
