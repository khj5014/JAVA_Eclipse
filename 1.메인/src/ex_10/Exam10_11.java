package ex_10;
import java.io.BufferedReader;
import java.io.FileReader;

public class Exam10_11 {
	public static void main(String[] args) throws Exception {
		FileReader fReader = new FileReader("c:/Windows/win.ini");
		BufferedReader bReader = new BufferedReader(fReader);

		String str = null;

		while ((str = bReader.readLine()) != null) {
			System.out.println(str);
		}

		bReader.close();
		fReader.close();
	}
}