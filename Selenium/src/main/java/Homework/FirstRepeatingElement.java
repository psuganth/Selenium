package Homework;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		
		int a[] = {54,65,98,54,35,84,98};
		
		int n = a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
				
			}
			break;
		}

	}

}
