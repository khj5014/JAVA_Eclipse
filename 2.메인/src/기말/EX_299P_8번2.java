package �⸻;

public class EX_299P_8��2 {

	public static void main(String[] args) {
		
		int[][] aa = new int[3][4]; 
		
		int i,k;
		int val = 1;
		
		
		for(i=0;i<3;i++)
		{	
			for (k=0;k<4;k++) 
			{				
				aa[i][k] = val;
				System.out.printf(" %d ���\n",aa[i][k]);
				val++;								
			}
	
		}
	}
}