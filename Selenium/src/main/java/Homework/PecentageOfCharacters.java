package Homework;

import java.util.regex.Pattern;

public class PecentageOfCharacters {

	public static void main(String[] args) {
		
		String input = "TigerRuns@TheSpeedOf100km/hour.";
		char[] list1 = input.toCharArray();
		int len = list1.length;
		int up=0;
		int lo = 0;
		int di = 0;
		int oc=0;
		
		
		for(int i=0;i<=len-1;i++)
		{
			char c=list1[i];
			if(Character.isUpperCase(c))
					{
				    up++;
					}
			else if(Character.isLowerCase(c))
			{
				lo++;
			}
			else if(Character.isDigit(c))
			{
				di++;
			}
			else oc++;
		}
		
int pou = up*100/len;
System.out.println(pou);
int pol = lo*100/len;
System.out.println(pol);
int pod = up*100/len;
System.out.println(pod);
int poc = oc*100/len;
System.out.println(poc);
	}

}
