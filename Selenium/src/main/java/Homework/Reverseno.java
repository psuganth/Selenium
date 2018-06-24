package Homework;

import java.util.Scanner;

public class Reverseno {
	
	int num;
	int temp;
	
	public void fetchno()
	{
		System.out.println("please provide your number : ");
		Scanner numberobj = new Scanner(System.in);
		num = numberobj.nextInt();
		numberobj.close();
	}
	public void invertno()
	{
		
		temp = num%10;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Reverseno callingobj = new Reverseno();
        callingobj.fetchno();
        callingobj.invertno();
        
	}

}
