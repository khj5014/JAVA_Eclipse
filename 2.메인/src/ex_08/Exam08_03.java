package ex_08;
import java.util.Scanner;

public class Exam08_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] scores = new double[35];
		int i;
		double hap = 0;
		

		for (i = 0; i < scores.length; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", i + 1);
			scores[i] = s.nextDouble();
		}
		for (i = 0; i < scores.length; i++)
			hap = hap + scores[i];
 
		System.out.printf(" �հ� ==> %f \n", hap);
		System.out.printf(" ��� ==> %f \n", hap/scores.length);
		
		s.close();
	}
}