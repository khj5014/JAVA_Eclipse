import java.util.Scanner;

public class Problem_11 {

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

		if (ch == '-')
			System.out.printf("%d - %d = %d �Դϴ�. \n", a, b, a - b);

		if (ch == '*')
			System.out.printf("%d * %d = %d �Դϴ�. \n", a, b, a * b);

		if (ch == '/')
			System.out.printf("%d / %d = %f �Դϴ�. \n", a, b, a / (float) b);

		if (ch == '%')
			System.out.printf("%d %% %d = %d �Դϴ�. \n", a, b, a % b);
		
		s.close();
	}
}
