package �⸻;
import java.awt.*;
import javax.swing.*;

public class Ex13_04 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�������� 13-4");

			this.setLayout(new GridLayout(3, 5));

			JCheckBox[] btn = new JCheckBox[15];

			for (int i = 0; i < 15; i++) {
				btn[i] = new JCheckBox("üũ�ڽ�" + (i + 1));
				this.add(btn[i]);
			}

			setSize(600, 300);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}