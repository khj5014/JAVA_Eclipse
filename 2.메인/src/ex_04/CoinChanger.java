package ex_04;
import java.util.Scanner;
public class CoinChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int money, coin500, coin100, coin50, coin10;

		System.out.printf(" 교환하실 돈을 입력해주세요 : ");
		money = s.nextInt();

		coin500 = money / 500;
		money = money % 500;

		coin100 = money / 100;
		money = money % 100;

		coin50 = money / 50;
		money = money % 50;

		coin10 = money / 10;
		money = money % 10;

		System.out.printf("\n 500원짜리 ==> %d 개 \n", coin500);
		System.out.printf(" 100원짜리   ==> %d 개 \n", coin100);
		System.out.printf(" 50원짜리 ==> %d 개 \n", coin50);
		System.out.printf(" 10원짜리   ==> %d 개 \n", coin10);
		System.out.printf(" 1원 잔돈 ==> %d 원 \n", money);
		
		s.close();
	}

}
