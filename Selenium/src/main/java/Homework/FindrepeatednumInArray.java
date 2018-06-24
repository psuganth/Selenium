package Homework;

public class FindrepeatednumInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,2,5,3,9,6};
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j = i+1;j<n;i++)
			{
				if((a[i]==a[j])&&(i!=j))
				{
					System.out.println(a[j]);
				}
			}
		}

	}

}
