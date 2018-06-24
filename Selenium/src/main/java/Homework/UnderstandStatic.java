package Homework;

public class UnderstandStatic {
	
	
	
	static String a = "hello";
	String b = "world";
	
	public static void method1() {
		
		
		UnderstandStatic obj1 = new UnderstandStatic();
		String c = obj1.b;
		System.out.println(a +" "+c);
		
		
	}
	
	public void method2() {
		
		System.out.println(a +" "+b);
				
	}
	
	
	public static void main(String[] args) {
		
		UnderstandStatic obj = new UnderstandStatic();
		method1();
		obj.method2();
		
	}

}
