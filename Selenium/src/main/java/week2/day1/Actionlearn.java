package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Actionlearn {
	@Test
public void runAction() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		  WebElement source = driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[1]");
	 int destination = driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[4]").getLocation().getY();
	Actions a=new Actions(driver);
	a.dragAndDropBy(source, 0, destination).perform();

	
	}

	

}
