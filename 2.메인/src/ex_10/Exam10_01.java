package ex_10;
public class Exam10_01 {
	public static void main(String[] args) {
		
		int[] aa = new int[3];
		
		try {
			aa[2] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {		
			System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
		} finally {
			System.out.println("정상크기   "+ aa[2]);
		}
	}
}
