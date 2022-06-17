package ex_10;
import java.io.File;
import java.util.Scanner;

public class Exam10_12 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:/Users/gmlwo/Desktop/test/data2.txt"));
		int hap = 0;

		while (sc.hasNextLine())
			hap += sc.nextInt();

		System.out.println("гу╟Х : " + hap);
		sc.close();
	}
}