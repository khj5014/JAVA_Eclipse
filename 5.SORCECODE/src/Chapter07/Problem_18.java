import java.util.Scanner;

public class Problem_18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int upper_cnt = 0, lower_cnt = 0, digit_cnt = 0;
		int i;

		System.out.printf("���ڿ��� �Է� : ");
		str = s.nextLine();

		i = 0;
		do {
			ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z')
				upper_cnt++;
			if (ch >= 'a' && ch <= 'z')
				lower_cnt++;
			if (ch >= '0' && ch <= '9')
				digit_cnt++;

			i++;
		} while (i < str.length());

		System.out.printf("�빮�� %d��, �ҹ��� %d��, ���� %d��\n", upper_cnt, lower_cnt, digit_cnt);
		
		s.close();
	}
}
