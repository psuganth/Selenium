package Homework;

import java.util.Scanner;

public class Factorial {
	

	int i;
	int n;
	int m=1;
	
	public int getnumber()
	{
		System.out.println("Please enter the number : ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.close();
		return n;	
	}
	
	public void calfac()
	{
		m=n * calfac(n-1);
		
		}
		System.out.println(m);
	
		

	public static void main(String[] args) {
		
		Factorial calcfac = new Factorial();
		calcfac.getnumber();
        calcfac.calfac();
        
	}

}
