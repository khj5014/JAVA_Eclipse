package ex_04;
import java.util.Scanner;
public class CoinChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int money, coin500, coin100, coin50, coin10;

		System.out.printf(" ��ȯ�Ͻ� ���� �Է����ּ��� : ");
		money = s.nextInt();

		coin500 = money / 500;
		money = money % 500;

		coin100 = money / 100;
		money = money % 100;

		coin50 = money / 50;
		money = money % 50;

		coin10 = money / 10;
		money = money % 10;

		System.out.printf("\n 500��¥�� ==> %d �� \n", coin500);
		System.out.printf(" 100��¥��   ==> %d �� \n", coin100);
		System.out.printf(" 50��¥�� ==> %d �� \n", coin50);
		System.out.printf(" 10��¥��   ==> %d �� \n", coin10);
		System.out.printf(" 1�� �ܵ� ==> %d �� \n", money);
		
		s.close();
	}

}
