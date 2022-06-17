package 중간;

import java.util.Scanner;

public class Ex_p165 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s = new Scanner(System.in);

			int sec, si, bun, cho;

			System.out.printf("## 계산할 초는 ? ");
			sec = s.nextInt();
			
			si = sec/3600;
			sec %= 3600;
			bun = sec/60; 
			cho = sec%60; 
			
			System.out.printf(" 시간은 -> %d시간 \n", si);
			System.out.printf(" 분은   -> %d분 \n", bun);
			System.out.printf(" 초는 -> %d초 \n", cho);

			
			s.close();
		}

	}
