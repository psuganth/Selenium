package testCases;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportGeneration {
	
	@Test

	public void learnreport (String[] args) throws IOException {
		
		ExtentHtmlReporter html = new ExtentHtmlReporter(new File("./data/reports/htmlreports.html"));
		
		html.setAppendExisting(true);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		
		ExtentTest test = extent.createTest("TC001", "Create Lead");
		
		
		test.assignAuthor("suganth");
		test.assignCategory("Smoke Test");
		
		test.pass("Demo Sales manager entered successfully" + test.addScreenCaptureFromPath("./Screenshots/Snap1.jpeg"));
		test.pass("password entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./Screenshots/Snap2.jpeg").build());
		

	}

}
