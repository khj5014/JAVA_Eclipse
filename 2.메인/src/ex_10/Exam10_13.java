package ex_10;
import java.io.FileOutputStream;

public class Exam10_13 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Users/gmlwo/Desktop/test/data3.txt");
		int ch;

		while ((ch = System.in.read()) != 13)
			fos.write((byte) ch);

		fos.close();
	}
}