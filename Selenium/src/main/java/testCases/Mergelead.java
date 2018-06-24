package testCases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Mergelead extends SeMethods{

	@Test
	public void login() throws InterruptedException {		
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
		WebElement mergeLeads = locateElement("link", "Merge Leads");
		click(mergeLeads);
		WebElement fromLead = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
		click(fromLead);
		switchToWindow(1);
		WebElement leadID = locateElement("xpath", "//input[@name='id']");
		type(leadID, "10343");
		WebElement findFromLeads = locateElement("xpath", "(//button[@type='button'])[1]");
		click(findFromLeads);
		Thread.sleep(3000);
		WebElement searchResult = locateElement("link", "11866");
		click(searchResult);
		switchToWindow(0);
		WebElement toLead = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
		click(toLead);
		switchToWindow(1);
		WebElement leadID1 = locateElement("xpath", "//input[@name='id']");
		type(leadID1, "10343");
		WebElement findFromLeads1 = locateElement("xpath", "(//button[@type='button'])[1]");
		click(findFromLeads1);
		Thread.sleep(3000);
		WebElement searchResult1 = locateElement("link", "11861");
		click(searchResult1);
		switchToWindow(0);
		WebElement mergeButton = locateElement("class", "buttonDangerous");
		click(mergeButton);
		acceptAlert();
		WebElement findLeads = locateElement("link", "Find Leads");
		click(findLeads);
		WebElement leadID3 = locateElement("xpath", "//input[@name='id']");
		type(leadID3, "10344");
		WebElement findLeadsResult = locateElement("xpath", "(//button[@type='button'])[7]");
		click(findLeadsResult);
		Thread.sleep(3000);
		WebElement searchRecordResult = locateElement("xpath", "//div[text()='No records to display']");
		getText(searchRecordResult);
		closeBrowser();
	}
}
