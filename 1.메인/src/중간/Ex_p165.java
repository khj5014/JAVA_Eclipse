package �߰�;

import java.util.Scanner;

public class Ex_p165 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s = new Scanner(System.in);

			int sec, si, bun, cho;

			System.out.printf("## ����� �ʴ� ? ");
			sec = s.nextInt();
			
			si = sec/3600;
			sec %= 3600;
			bun = sec/60; 
			cho = sec%60; 
			
			System.out.printf(" �ð��� -> %d�ð� \n", si);
			System.out.printf(" ����   -> %d�� \n", bun);
			System.out.printf(" �ʴ� -> %d�� \n", cho);

			
			s.close();
		}

	}
