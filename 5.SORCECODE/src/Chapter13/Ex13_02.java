import java.awt.*;
import javax.swing.*;

public class Ex13_02 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout ����");

			this.setLayout(new FlowLayout());

			JButton btn1 = new JButton("��ư1");
			this.add(btn1);

			JButton btn2 = new JButton("��ư2");
			this.add(btn2);

			JButton btn3 = new JButton("��ư3");
			this.add(btn3);

			JButton btn4 = new JButton("��ư4");
			this.add(btn4);

			JButton btn5 = new JButton("��ư5");
			this.add(btn5);

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
