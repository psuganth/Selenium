package testCases;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void login() throws InterruptedException {		
		startApp("chrome", "http://leaftaps.com/opentaps");
		Thread.sleep(5000);
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		WebElement password = locateElement("password");		
		type(password, "crmsfa");
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);
		WebElement element = locateElement("link","CRM/SFA");
		click(element);
		WebElement createlead = locateElement("link","Create Lead");
		click(createlead);
		WebElement cmpyname = locateElement("id","createLeadForm_companyName");
		type(cmpyname,"IBM");
		WebElement firstname = locateElement("id","createLeadForm_firstName");
		type(firstname,"Suriya");
		WebElement lastname = locateElement("id","createLeadForm_lastName");
		type(lastname,"Ravi");
		WebElement seldropdown = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(seldropdown,"LEAD_EMPLOYEE");
		WebElement lastsubmit = locateElement("class","smallSubmit");
		click(lastsubmit);
		
	}

}
