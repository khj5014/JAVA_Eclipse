package �⸻;

public class EX_299P_8�� {

	public static void main(String[] args) {
		
		int[][] aa = new int[3][4]; 
		
		int i,k;
		int val = 1;
		i=0;
		
		while(i<3)
		{	
			k=0;		
			while (k<4) 
			{				
				aa[i][k] = val;
				System.out.printf(" %d ���\n",aa[i][k]);
				val++;
				k++;				
			}
			i++;
		}
	}

}