import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn;
	
	public MyFrame() {
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("버튼 이벤트 구현하기");
		setLayout(new FlowLayout());
		btn = new JButton("버튼을클릭하세요");
		btn.addActionListener((ActionListener)new MyListener());
		add(btn);
		setVisible(true);
	}
}