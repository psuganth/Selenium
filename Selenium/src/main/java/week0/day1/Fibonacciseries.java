package week0.day1;

public class Fibonacciseries {


	static void fibonacci()

	{
 
		int a[] = {0,1};
		


		for(int i=1;i<100;i++)
		{
			int c = a[0]+a[1];
			a[0]=a[1];
			a[1]=a[2];

			if(a[i+1]>=100)
			{
				break;
			}
			
			System.out.println(a[i+1]);

		}
	}




	public static void main(String[] args) {

		/*System.out.println(a[i]);
		System.out.println(a[i+1]);*/
		fibonacci();
		

	}


}

