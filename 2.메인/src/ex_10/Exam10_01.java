package ex_10;
public class Exam10_01 {
	public static void main(String[] args) {
		
		int[] aa = new int[3];
		
		try {
			aa[2] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {		
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ�� ~~");
		} finally {
			System.out.println("����ũ��   "+ aa[2]);
		}
	}
}
