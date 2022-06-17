package ex_10;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_28 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:/Users/gmlwo/Desktop/test/in.txt"));
		PrintWriter pw = new PrintWriter("C:/Users/gmlwo/Desktop/test/out.txt");

		String str1, str2 = "";

		while (sc.hasNextLine()) {
			str1 = sc.nextLine();
			int size = str1.length();
			for (int i = size - 1; i >= 0; i--)
				str2 += str1.charAt(i);

			pw.println(str2);
			str2 = "";
		}

		sc.close();
		pw.close();
	}
}