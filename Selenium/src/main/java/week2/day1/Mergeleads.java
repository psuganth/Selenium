package week2.day1;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.util.*;

	public class Mergeleads {

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> eachitem = driver.getWindowHandles();
		for(String eachwin:eachitem)
		{
			System.out.println(eachwin);
		}
		List<String> list = new ArrayList<String>();
		list.addAll(eachitem);
		driver.switchTo().window(list.get(1));
		driver.findElementByXPath("(//input[@type = 'text'])[1]").sendKeys("10265");
		Thread.sleep(3000);
		driver.findElementByXPath("(//button[@class = 'x-btn-text'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("10265").click();
		driver.switchTo().window(list.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> eachitem1 = driver.getWindowHandles();
		
		List<String> list1 = new ArrayList<String>();
		list1.addAll(eachitem1);
		driver.switchTo().window(list1.get(1));
		driver.findElementByXPath("//input[@name = 'id']").sendKeys("10254");
		driver.findElementByXPath("(//button[@type = 'button'])[1]").click();
		Thread.sleep(5000);
		driver.findElementByLinkText("10254").click();
		driver.switchTo().window(list.get(0));
		driver.findElementByLinkText("Merge").click();;
		
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();;
		driver.findElementByXPath("//input[@name='id']").sendKeys("10265");
		driver.findElementByXPath("(//button[@type='button'])[7]").click();
		Thread.sleep(5000);
		WebElement result = driver.findElementByXPath("//div[text()='No records to display']");
		System.out.println(result.getText());
		driver.close();
		}

	}

