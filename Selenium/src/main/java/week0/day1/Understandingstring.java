package week0.day1;

public class Understandingstring {

	public static void main(String[] args) {
		
		String str1 = "TestLeaf Java";
		String str2 = "TestLeaf Java";
		String str3 = new String("TestLeaf Java");
		String str4 = new String("testleaf java");
		String str5 = new String("Java");
		WordComp(str1,str5);

	}

	public static String WordComp(String str1,String str2) {
		if(str1==str2)
		{
			System.out.println(str1+"\n"+str2+"They are same");
		}
		else
		{
			System.out.println(str1+"\n"+str2+"They are not same");
		}
		if(str1.equals(str2))
		{
			System.out.println(str1+"\n"+str2+"They are same");
		}
		else
		{
			System.out.println(str1+"\n"+str2+"They are not same");
		}
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println(str1+"\n"+str2+"They are same but not in same case");
		}
		else
		{
			System.out.println(str1+"\n"+str2+"They are not same");
		}
		if(str1.contains(str2))
		{
			System.out.println(str2+"\n"+"is part of"+"\t"+str1);
		}
		else
		{
			System.out.println("They are not related");
		}
		return null;
	}	
	
}



/*Create 5 String variables in your main method(as listed below). Pass them as an argument to a method. In the method, compare the four strings using str1==str2, str1.equals(str2), str1==str3, str1.equals(str3), str1.equalsIgnoreCase(str4) and str3.contains(str5) and bring up your observation. 
Additional - You can try other String operations/methods too and learn the purpose of them. Try compiling and executing the program from your command prompt console.*/