import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyListener implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setText("버튼이 클릭 되었습니다");
	}
}