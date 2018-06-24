package week2.day1;



import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		
		
		Set<String> allWin = new LinkedHashSet(driver.getWindowHandles());
		/*for(String eachwin : allWin)
		{
			System.out.println(eachwin);
		}*/
		
		/*List<String> listwindows = new ArrayList<String>();
		listwindows.addAll(allWin);
		
		driver.switchTo().window(listwindows.getTitle(1));*/
		
		
		
		
		

	}

}
