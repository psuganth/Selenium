package Homework;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windowslogin {

	//private static final TimeUnit SECONDS = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3,SECONDS);
		driver.get("https://outlook.live.com/owa/");
		driver.findElementByClassName("buttonLargeBlue").click();
		driver.findElementByName("loginfmt").sendKeys("psuganth@outlook.com");
		driver.findElementById("idSIButton9").click();
		driver.findElementByName("passwd").sendKeys("olpzl93212");
		driver.findElementById("idSIButton9").click();
		//driver.findElementByXPath("//*[@title(contains,'Write a new message']");
		
		

	}

}
