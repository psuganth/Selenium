package Homework;
import java.util.Scanner;

public class StringUpperCase 

{
	



	public static void main(String[] args) 
	{
		int i, ch=0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String input = scan.nextLine();
		scan.close();
		System.out.println("The Output is:");

		for( i=0; i<input.length(); i++) 
		{
			ch = input.charAt(i);
			//converting to uppercase
			if(ch>96 && ch<123) 
			{
				ch = ch-32;
				System.out.print((char)ch);
			}
			//converting to lowercase
			else if(ch>64 && ch<90) 
			{
				ch = ch+32;
				System.out.print((char)ch);
			}


		}

	}

}