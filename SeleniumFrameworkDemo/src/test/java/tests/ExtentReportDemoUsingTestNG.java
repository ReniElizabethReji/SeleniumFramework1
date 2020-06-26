package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

@SuppressWarnings("deprecation")
public class ExtentReportDemoUsingTestNG {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public WebDriver driver = null;
	
	@BeforeTest
	public void setUp() {
	    htmlReporter = new ExtentHtmlReporter("./mySecondReport.html");
		htmlReporter.config().setDocumentTitle("Automation Testing Results Two");
		htmlReporter.config().setReportName("Functional Report Two");
		htmlReporter.config().setTheme(Theme.STANDARD);
	    extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	
	@BeforeTest	
	public void browserSetUp(){
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();	
	}
	@Test
	public void tests() {
		ExtentTest test2 = extent.createTest("MySecondGoogleSearchTest");
	    test2.log(Status.INFO, "Starting Test case");
		driver.get("https://www.google.com/");
		test2.pass("Navigated to Page");

		driver.findElement(By.name("q")).sendKeys("Automation");
		test2.pass("Entered Search Keyword");
		
		driver.findElement(By.name("btnK")).sendKeys("keys.RETURN");
		test2.pass("Clicked the search button");
		
	}
	@AfterTest	
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}

}
