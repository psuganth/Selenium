package week0.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver login = new ChromeDriver();
		login.manage().window().maximize();
		login.get("http://leaftaps.com/opentaps");
		// TODO Auto-generated method stub"
				login.findElementById("username").sendKeys("DemoSalesManager");
				login.findElementById("password").sendKeys("crmsfa");
				login.findElementByClassName("decorativeSubmit").click();
			login.findElementByPartialLinkText("CRM/SFA").click();
				login.findElementByLinkText("Leads").click();
				login.findElementByLinkText("Create Lead").click();
				login.findElementById("createLeadForm_companyName").sendKeys("syntel");
				login.findElementById("createLeadForm_firstName").sendKeys("sanjana");
				login.findElementById("createLeadForm_lastName").sendKeys("babu");
		        login.findElementByClassName("smallSubmit").click();	
		       /* login.findElementByLinkText("Find Leads").click();
		        login.findElementByXPath(//div[@ClassName='x-tab-strip-wrap'];
*/		        
				
	}

}
