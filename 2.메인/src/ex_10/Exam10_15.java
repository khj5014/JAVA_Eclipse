package ex_10;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam10_15 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/Windows/win.ini");
		FileOutputStream fos = new FileOutputStream("C:/Users/gmlwo/Desktop/test/data5.txt");
		int ch;

		while ((ch = fis.read()) != -1)
			fos.write((byte) ch);

		System.out.println("���� �Ϸ�");
		fis.close();
		fos.close();
	}
}