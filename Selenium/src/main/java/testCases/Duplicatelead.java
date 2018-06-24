package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import wdMethods.SeMethods;

public class Duplicatelead extends SeMethods{

	@Test
	public void dupliacteLead() throws InterruptedException {		
		try {
			startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement userName = locateElement("username");
			type(userName, "DemoSalesManager");
			WebElement password = locateElement("password");
			type(password, "crmsfa");
			WebElement submit = locateElement("class", "decorativeSubmit");
			click(submit);
			WebElement crmsfalink = locateElement("link","CRM/SFA");
			click(crmsfalink);
			WebElement leadLink = locateElement("link","Leads");
			click(leadLink);
			WebElement findLeads = locateElement("link", "Find Leads");
			click(findLeads);
			WebElement email = locateElement("xpath", "//span[text()='Email']");
			click(email);
			WebElement emailText = locateElement("xpath", "//input[@name='emailAddress']");
			type(emailText, "somu@xyz.com");
			WebElement findLeadsSubmit = locateElement("xpath", "//button[text()= 'Find Leads']");
			click(findLeadsSubmit);
			Thread.sleep(5000);
			WebElement emailSearchResult = locateElement("xpath", "(//a[@class='linktext'])[4]");
			click(emailSearchResult);
			WebElement textContent = locateElement("xpath", "//span[text()= 'Orange']");
			String textValues = getText(textContent);
			System.out.println(textValues); 
			WebElement duplicateLeads = locateElement("link", "Duplicate Lead");
			click(duplicateLeads);
			verifyTitle("Duplicate Lead | opentaps CRM");
			WebElement createLead = locateElement("xpath", "//input[@value= 'Create Lead']");
			click(createLead);
			WebElement textContent2 = locateElement("xpath", "//span[text()= 'Orange']");
			String textValues2 = getText(textContent2);
			System.out.println(textValues2);
			if(textValues.equals(textValues2))
			{
				System.out.println("the duplicated lead name is same as captured name");
				
			}
			else
			{
				System.out.println("the duplicated lead name is not same as captured name");
			}
			closeBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}