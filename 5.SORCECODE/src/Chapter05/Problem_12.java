import java.util.Scanner;

public class Problem_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;

		System.out.printf("ù��° ���� �Է��ϼ��� : ");
		a = s.nextInt();

		System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
		ch = s.next().charAt(0);

		System.out.printf("�ι�° ���� �Է��ϼ��� : ");
		b = s.nextInt();

		if (ch == '+')
			System.out.printf("%d + %d = %d �Դϴ�. \n", a, b, a + b);
		else if (ch == '-')
			System.out.printf("%d - %d = %d �Դϴ�. \n", a, b, a - b);
		else if (ch == '*')
			System.out.printf("%d * %d = %d �Դϴ�. \n", a, b, a * b);
		else if (ch == '/')
			System.out.printf("%d / %d = %f �Դϴ�. \n", a, b, a / (float) b);
		else if (ch == '%')
			System.out.printf("%d %% %d = %d �Դϴ�. \n", a, b, a % b);
		else
			System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�. \n");
		
		s.close();
	}
}
