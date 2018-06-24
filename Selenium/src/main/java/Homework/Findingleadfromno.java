package Homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Findingleadfromno {

	public static void main(String[] args) throws InterruptedException {




				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps");		
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByPartialLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Find Leads").click();
                driver.findElementByXPath("(//span[contains(@class,'x-tab-strip-text ')])[2]").click();
                //driver.findElementByXPath("(//input[@name='phoneAreaCode'])").sendKeys("91");
                driver.findElementByXPath("(//input[@name='phoneNumber'])").sendKeys("7401373598");
                driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
                Thread.sleep(2000);
                driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
                
                
		}
	}

