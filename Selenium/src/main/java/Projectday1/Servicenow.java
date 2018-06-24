package Projectday1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Servicenow extends SeMethods {
	@Test
	public void servicenowAutomation() throws InterruptedException
	{
		
	
	startApp("chrome","https://dev39457.service-now.com/");
	WebElement framelogin = locateElement("gsft_main");
	
	switchToFrame(framelogin);
	WebElement Username = locateElement("user_name");
	type(Username, "admin");
	WebElement Password = locateElement("user_password");
	type(Password, "KiranBedi123$");
	WebElement submit = locateElement("sysverb_login");
	click(submit);
	WebElement filter = locateElement("filter");
	type(filter, "incident");
	

	Thread.sleep(2000);
	
	WebElement clickincident = locateElement("xpath", "//div[text()='Create New'][1]");
	click(clickincident);

	Thread.sleep(2000);	
	
	WebElement frameincpage = locateElement("gsft_main");	
	switchToFrame(frameincpage);

	WebElement getinc = locateElement("id","incident.number");
	
	String incnumber = getinc.getAttribute("value");
	
	System.out.println(incnumber);
    	WebElement browsebutton = locateElement("xpath", "//span[@class='icon icon-search']");
	click(browsebutton);
	//click(browsebutton);
	
	//switchToWindow(1);
	
	
	
	
	
	
	
	}	
		
		
}
