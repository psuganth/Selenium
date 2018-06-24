package testCases;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {

	public void LeaftapLogin() {
		startApp("chrome", "http://leaftaps.com/opentaps");

		WebElement Username = locateElement("username");
		type(Username, "DemoSalesManager");
		WebElement Password = locateElement("password");
		type(Password, "crmsfa");
		WebElement Submit = locateElement("class", "decorativeSubmit");
		click(Submit);

		WebElement CRMLink = locateElement("link", "CRM/SFA");
		click(CRMLink);	
		WebElement leadLink = locateElement("link","Leads");
		click(leadLink);
		
		
		

	}

}
