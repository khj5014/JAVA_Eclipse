package 중간;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int sd;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("16진수를 입력하세요 : ");
		a = s.next();
		sd = Integer.parseInt(a,16);
		System.out.printf("입력한 16진수는 10진수로 %d입니다",sd);
	}

}