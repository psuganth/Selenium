package Homework;

import java.util.Scanner;

public class basicoperations {
	
     int a,b;
     int output;
     String operation;
     
	 int add()
	{
		output = a+b;
		System.out.println(output);
		return output;
	}
	 void sub()
		{
			output = a-b;
			System.out.println(output);
		}
	 void mul()
		{
			output = a*b;
			System.out.println(output);
		}
	 void div()
		{
			output = a/b;
			System.out.println(output);
		}
	 
	 void fetchoperation()
	 {
		 Scanner sc = new Scanner(System.in);
			System.out.println("please enter the operation:");
		    operation = sc.nextLine();
			
			
	 }
	
	

	public static void main(String[] args) {
		basicoperations bo = new basicoperations();
		bo.fetchoperation();
		
		 Scanner sc = new Scanner(System.in);
		System.out.println("please enter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String operation;
	    
		switch(operation)
		
		{
		
		case "addition":
		{			
			bo.add();
			break;
		}
		case "subtraction":
		{			
			bo.sub();
			break;
		}
		case "multiplication":
		{	
			bo.mul();
			break;
		}
		case "division":
		{			
			bo.div();
			break;
		}
		}
		

	}

}
