package week0.day1;

public class Printingarrays {
	
	

	public static void main(String[] args) {
		int arrays[][] = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0; i<arrays.length; i++)
		{
			for(int j=0; j<arrays.length;j++)
				System.out.print(arrays[i][j]+ " ");
			 System.out.println("");
		}
       
	}

}
