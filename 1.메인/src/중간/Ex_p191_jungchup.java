package �߰�;
import java.util.Scanner;
public class Ex_p191_jungchup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("ó���� ���� �Է��ϼ��� : ");
		a = s.nextInt();
		
		if(0<=a) 
			{					
			if(0<a) 
				 System.out.printf("�Է��Ѽ��� + �Դϴ�.");
			else System.out.printf("0�� �Է��ϼ̽��ϴ�.");
			}
		else System.out.printf("�Է��Ѽ��� -�Դϴ�."); 
	}

}