package 기말고사1;

public class While {

	public static void main(String[] args) {
		
		
		int sum = 0; 
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합은 : " + sum + "입니다");
	}

}