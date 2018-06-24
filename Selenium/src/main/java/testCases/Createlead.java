package testCases;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Createlead extends SeMethods {

	@Test(dataProvider="fetchData")
	public void createLead(String username,String Password) throws InterruptedException {

		try {
			
			
			startApp("chrome", "http://leaftaps.com/opentaps");

			WebElement Username = locateElement("username");
			type(Username, "DemoSalesManager");
			WebElement Password1 = locateElement("password");
			type(Password1, "crmsfa");
			Thread.sleep(5000);
			
			WebElement Submit = locateElement("class", "decorativeSubmit");
			click(Submit);
			click(locateElement("class", "decorativeSubmit"));

			WebElement CRMLink = locateElement("link", "CRM/SFA");
			click(CRMLink);
			WebElement CreatLead = locateElement("link", "Create Lead");
			click(CreatLead);
			WebElement Companyname = locateElement("createLeadForm_companyName");
			type(Companyname, "ABC Pvt Ltd");
			WebElement Firstname = locateElement("createLeadForm_firstName");
			type(Firstname, "Suganth");
			WebElement Lastname = locateElement("createLeadForm_lastName");
			type(Lastname, "P");
			WebElement Source = locateElement("createLeadForm_dataSourceId");
			selectDropDownUsingText(Source, "Conference");
			WebElement LocalFirstname = locateElement("createLeadForm_firstNameLocal");
			type(LocalFirstname, "Bala");
			WebElement Salutation = locateElement("createLeadForm_personalTitle");
			type(Salutation, "Ms");
			WebElement ProfileTittle = locateElement("createLeadForm_generalProfTitle");
			type(ProfileTittle, "Application Packaging");
			WebElement AnnualRevenue = locateElement("createLeadForm_annualRevenue");
			type(AnnualRevenue, "100");
			WebElement IndustryEnumId = locateElement("createLeadForm_industryEnumId");
			selectDropDownUsingText(IndustryEnumId, "Computer Software");
			WebElement OwnershipEnumId = locateElement("createLeadForm_ownershipEnumId");
			selectDropDownUsingText(OwnershipEnumId, "Corporation");

			WebElement MarketingCampaignId = locateElement("createLeadForm_marketingCampaignId");
			selectDropDownUsingIndex(MarketingCampaignId, 1);
			WebElement Locallastname = locateElement("createLeadForm_lastNameLocal");
			type(Locallastname, "T1");
			WebElement DOB = locateElement("createLeadForm_birthDate");
			type(DOB, "11/16/93");
			WebElement DepartmentName = locateElement("createLeadForm_departmentName");
			type(DepartmentName, "Testing");

			
			WebElement Submitbutton = locateElement("name", "submitButton");
			click(Submitbutton);
			closeBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}}
	
		
		@DataProvider(name ="fetchData")
		public Object[][] getData(){
			
			Object[][] data= new Object[2][3];
			data[0][0]="Babu";
			data[0][1]="Babu2";
			data[0][2]="Babu3";
			
			
			
			data[0][0]="Babu56";
			data[0][1]="Babu57";
			data[0][2]="Babu58";
			
			return data;
			
		}
		
		
	
	
		
		
			
	




	

}