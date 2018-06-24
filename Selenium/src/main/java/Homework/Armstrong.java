package Homework;

public class Armstrong {

	public static void main(String[] args) {
		
		int arm=0;
		int rem=0;
		int n;
		
		for(int i=100;i<=1000;i++)
		{
			
			n=i;
			while(n>0)
			{
			rem=n%10;
			arm = arm+(rem*rem*rem);
			n=n/10;
			}
			if(arm==i)
			{
			System.out.println(i);
			}
			arm=0;
		}

	}

}
