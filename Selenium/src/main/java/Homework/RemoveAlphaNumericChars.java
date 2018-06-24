package Homework;

public class RemoveAlphaNumericChars {

	public static void main(String[] args) {
		String input = "TestLeaf: like, ... [ ]{ } this is a string";
		String output = input.replaceAll("[^a-zA-Z_0-9]", "");
		System.out.println(output);
	}

}
