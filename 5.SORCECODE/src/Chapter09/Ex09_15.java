public class Ex09_15 {
	static int a = 100;

	static void func1() {
		int a = 200;
		System.out.printf("func1()���� a�� ��==> %d\n", a);
	}

	public static void main(String[] args) {
		func1();
		System.out.printf("main() ���� a�� ��==> %d\n", a);
	}
}
