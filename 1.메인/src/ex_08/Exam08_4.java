package ex_08;
import java.util.Scanner;

public class Exam08_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] scores = new double[5];
		int a;
		double hap = 0;
		

		for (a = 0; a < scores.length; a++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", a + 1);
			scores[a] = s.nextDouble();
		}
		for (a = 0; a < scores.length; a++)
			hap = hap + scores[a];
 
		
		System.out.printf("�հ� ==> %.0f \n��� ==> %.0f", hap, hap/scores.length);
		
		s.close();
	}
}