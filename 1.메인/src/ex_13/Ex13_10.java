package ex_13;
import java.awt.*;
import javax.swing.*;

public class Ex13_10 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습 4");

			this.setLayout(new FlowLayout());

			String[] pet = {"!", "@", "#", "$", "%"};
			
			JList list = new JList(pet);
			this.add(list);

			JComboBox combo = new JComboBox(pet);
			this.add(combo);
			
			setSize(300, 300);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}