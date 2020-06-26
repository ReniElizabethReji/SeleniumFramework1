package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


@SuppressWarnings("deprecation")
public class ExtentReportBasicDemo {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./reports/myFirstReport.html");
		htmlReporter.config().setDocumentTitle("Automation Testing");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("MyFirstGoogleSearchTest");
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    test.log(Status.INFO, "Starting Test case");
		driver.get("https://www.google.com/");
		test.pass("Navigated to Page");

		driver.findElement(By.name("q")).sendKeys("Automation");
		test.pass("Entered Search Keyword");
		
		driver.findElement(By.name("btnK")).sendKeys("keys.RETURN");
		test.pass("Clicked the search button");
		driver.close();
		driver.quit();
		test.pass("Closed the browser");
		test.info("Test case completed");
		
		extent.flush();

	}

}
