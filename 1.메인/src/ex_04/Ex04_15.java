package ex_04;

public class Ex04_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, result;
		int i;

		for (i = 1; i <= 5; i++) {
			result = a << i;
			System.out.printf("%d << %d = %d\n", a, i, result);
		}

		for (i = 1; i <= 5; i++) {
			result = a >> i;
			System.out.printf("%d >> %d = %d\n", a, i, result);
		}
	}

}
