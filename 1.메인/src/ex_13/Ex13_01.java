package ex_13;
import javax.swing.JFrame;

public class Ex13_01 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GUI ¿¬½À");

			setSize(500, 500);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
