package ex_10;
import java.io.FileReader;

public class Exam10_09 {
	public static void main(String[] args) throws Exception {
		FileReader filereader=new FileReader("c:/temp/sample.txt");

		int ch;

		while ((ch = filereader.read()) != -1)
			System.out.print((char) ch);

		filereader.close();

	}
}