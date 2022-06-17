package ex_05;
import java.util.Scanner;

public class Ex05_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;

		System.out.printf("Ãâ»ý¿¬µµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		year = s.nextInt();
		
		if(year % 12 == 0)
			System.out.printf ("¿ø¼þÀÌ¶ì\n");
		else if(year % 12 == 1)
			System.out.printf ("´ß¶ì\n");
		else if(year % 12 == 2)
			System.out.printf ("°³¶ì\n");
		else if(year % 12 == 3)
			System.out.printf ("µÅÁö¶ì\n");
		else if(year % 12 == 4)
			System.out.printf ("Áã¶ì\n");
		else if(year % 12 == 5)
			System.out.printf ("¼Ò¶ì\n");
		else if(year % 12 == 6)
			System.out.printf ("È£¶ûÀÌ¶ì\n");
		else if(year % 12 == 7)
			System.out.printf ("Åä³¢¶ì\n");
		else if(year % 12 == 8)
			System.out.printf ("¿ë¶ì\n");
		else if(year % 12 == 9)
			System.out.printf ("¹ì¶ì\n");
		else if(year % 12 == 10)
			System.out.printf ("¸»¶ì\n");
		else if(year % 12 == 11)
			System.out.printf ("¾ç¶ì\n"); 
		
		s.close();
	}
}
