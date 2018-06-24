package Homework;

import java.util.Scanner;

public class FizzBuzzpgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your inputs:");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    
	    if(a<b)
	    {
	    	for (int i=a;i<=b;i++)
	    	{
	    		if(i%3==0)
	    			System.out.println("FIZZ");
	    		else if(i%5==0)
	    			System.out.println("BUZZ");
	    		else if(i%3==0 && i%5==0)
	    			System.out.println("FIZZ BUZZ");
	    		else
	    			System.out.println(i);
	    	}
	    	
	    }
	}

}
