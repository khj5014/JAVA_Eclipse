package ex_10;
import java.io.FileInputStream;

public class Exam10_10 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/gmlwo/Desktop/data1.txt");
		int ch;
		byte[] bt = new byte[1024];

		int i = 0;
		while ((ch = fis.read()) != -1) {
			bt[i] = (byte) ch;
			i++;
		}

		System.out.print(new String(bt));
		fis.close();
	}
}