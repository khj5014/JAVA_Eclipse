package ex_05;
import java.util.Scanner;

public class Ex05_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;

		System.out.printf("��������� �Է��ϼ��� : ");
		year = s.nextInt();
		
		if(year % 12 == 0)
			System.out.printf ("�����̶�\n");
		else if(year % 12 == 1)
			System.out.printf ("�߶�\n");
		else if(year % 12 == 2)
			System.out.printf ("����\n");
		else if(year % 12 == 3)
			System.out.printf ("������\n");
		else if(year % 12 == 4)
			System.out.printf ("���\n");
		else if(year % 12 == 5)
			System.out.printf ("�Ҷ�\n");
		else if(year % 12 == 6)
			System.out.printf ("ȣ���̶�\n");
		else if(year % 12 == 7)
			System.out.printf ("�䳢��\n");
		else if(year % 12 == 8)
			System.out.printf ("���\n");
		else if(year % 12 == 9)
			System.out.printf ("���\n");
		else if(year % 12 == 10)
			System.out.printf ("����\n");
		else if(year % 12 == 11)
			System.out.printf ("���\n"); 
		
		s.close();
	}
}
