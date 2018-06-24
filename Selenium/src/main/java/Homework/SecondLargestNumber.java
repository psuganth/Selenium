package Homework;

public class SecondLargestNumber {
	

	public static void main(String[] args) {
		int a[] = {1,2,0,3,5,6,7};
		int n=a.length;
		int temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j]);
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
				}
			}
		}
		System.out.println(a[n-1]);

	}

}
