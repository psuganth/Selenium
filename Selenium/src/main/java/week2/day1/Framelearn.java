package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Framelearn {
	

	public static void main(String[] args) throws InterruptedException {
		String myInput = "Suganth";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys(myInput);
		driver.switchTo().alert().accept();
		//String inputText = driver.switchTo().alert().getText();
		String input1 = driver.findElementById("demo").getText();
		if(input1.contains(myInput));
		{
			System.out.println("Both the statements are same");
		}
		
		

	}

}
