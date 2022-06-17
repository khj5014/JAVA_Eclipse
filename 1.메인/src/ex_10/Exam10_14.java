package ex_10;
import java.io.FileWriter;
import java.util.Scanner;

public class Exam10_14 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:/Users/gmlwo/Desktop/test/data4.txt");
		String str;

		while (!(str = sc.nextLine()).equals(""))
			fw.write(str + "\r\n");

		fw.close();
		
		sc.close();
	}
}