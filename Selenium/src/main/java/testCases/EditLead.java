package testCases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditLead extends ProjectMethods {
	@Test
	public void leadEdit() throws InterruptedException
	{
		LeaftapLogin();
		WebElement findleadlink = locateElement("link","Find Leads");
		click(findleadlink);
		
		//click(locateElement("link","Find Leads"));
		
		WebElement leadname = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(leadname, "Dontuse");
		WebElement clickfindlead = locateElement("xpath", "//button[text()='Find Leads']");
		click(clickfindlead);
		Thread.sleep(3000);
		WebElement clickleadid = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(clickleadid);
		verifyTitle("opentaps CRM");
		WebElement clickedit = locateElement("link","Edit");
		click(clickedit);
	    WebElement edittext= locateElement("updateLeadForm_companyName");
	    type(edittext,"syntel1");
	    WebElement clickupdate= locateElement("name", "submitButton");
	    click(clickupdate);
	   
	    WebElement conformtext= locateElement("viewLead_companyName_sp");
	    verifyPartialText(conformtext, "syntel1");
	    closeBrowser();
	    
		
	}

}
