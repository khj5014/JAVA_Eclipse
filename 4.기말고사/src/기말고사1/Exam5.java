package 기말고사1;
public class Exam5 {
	public static void main(String[] args) {
		int[] Array1 = { 7,8,9,66,44};
		int[] Array2 = new int[5];
		System.arraycopy(Array1,0,Array2,0,5);
		for(int i=0; i<Array2.length; i++) {
			System.out.println("Array2" + "["+i+"]=" + Array2[i]); }
	}
}