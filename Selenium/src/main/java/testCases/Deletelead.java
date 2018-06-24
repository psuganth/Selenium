package testCases;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Deletelead extends ProjectMethods{
	@Test
	public void leadDelete() throws InterruptedException

	{
	
	LeaftapLogin();
	WebElement findleadlink = locateElement("link","Find Leads");
	click(findleadlink);
	WebElement clickphone = locateElement("xpath", "(//span[@class='x-tab-strip-text '])[2]");
	click(clickphone);
	WebElement phonenumberenter = locateElement("xpath", "//input[@name='phoneNumber']");
	type(phonenumberenter,"2244");
	WebElement clickfindlead = locateElement("xpath", "//button[text()='Find Leads']");
	click(clickfindlead);	
	Thread.sleep(3000);
	WebElement clickleadid = locateElement("xpath","(//a[@class='linktext'])[4]");
	String leadid = getText(clickleadid);
	click(clickleadid);
	WebElement clickdelete = locateElement("link","Delete");
	click(clickdelete);
	WebElement finddeleted = locateElement("link","Find Leads");
	click(finddeleted);
	WebElement leadidenter = locateElement("xpath", "//input[@name='id']");
	type(leadidenter,leadid);
	WebElement newfindlead = locateElement("xpath", "//button[text()='Find Leads']");
	click(newfindlead);
	WebElement errormessage = locateElement("xpath", "//div[text()='No records to display']");	
	 verifyPartialText( errormessage,"No records to display");
	 closeBrowser();
	
	}

}
