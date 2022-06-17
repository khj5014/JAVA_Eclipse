package 중간5;

import java.util.Scanner;

public class 중간5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int inputdata;	
		
		inputdata = scan.nextInt();
		
		if(inputdata>=90){
			System.out.println("A");
		}
		else if(inputdata>=80){
			System.out.println("B");
		}
		else if(inputdata>=80){
			System.out.println("C");
		}
		else if(inputdata>=80){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	
	}

}
