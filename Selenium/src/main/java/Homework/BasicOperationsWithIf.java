package Homework;

import java.util.Scanner;

public class BasicOperationsWithIf {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the operation:");
		String operation = sc.nextLine();
		System.out.println("please enter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int output = 0;

		if(operation=="addition")
		{
			output = a+b;
			System.out.println(output);

		}
		else if(operation=="subtraction")
		{
			output = a-b;
			System.out.println(output);
		}
		else if(operation=="multiplication")
		{
			output = a*b;
			System.out.println(output);
		}
		else if(operation=="division")
		{
			output = a/b;
			System.out.println(output);
		}


	}
}
