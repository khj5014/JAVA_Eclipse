package 기말고사1;

public class Exam4 {

	public static void main(String[] args) {
		
		int scores [][]= {{3,4,5},{7,8,9}};
		for(int i=0;i<scores.length; i++) {
			for(int k=0; k<scores[i].length; k++) {
			System.out.println("scores["+i+"]["+k+"]=" + scores[i][k]);
		}
			
	}
}

}