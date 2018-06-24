package Homework;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {

	public static void main(String[] args) {
		
		
		String pattern = "\\b[\\w]+@gmail.com";
		String input = "Sairam123@gmail.com";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		
		System.out.println(m.group());
		
		

	}

}
