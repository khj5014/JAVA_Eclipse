package �߰�;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int sd;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("16������ �Է��ϼ��� : ");
		a = s.next();
		sd = Integer.parseInt(a,16);
		System.out.printf("�Է��� 16������ 10������ %d�Դϴ�",sd);
	}

}