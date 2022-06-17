package 중간;
import java.util.Scanner;
public class Ex_p191_jungchup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("처리할 수를 입력하세요 : ");
		a = s.nextInt();
		
		if(0<=a) 
			{					
			if(0<a) 
				 System.out.printf("입력한수는 + 입니다.");
			else System.out.printf("0을 입력하셨습니다.");
			}
		else System.out.printf("입력한수는 -입니다."); 
	}

}