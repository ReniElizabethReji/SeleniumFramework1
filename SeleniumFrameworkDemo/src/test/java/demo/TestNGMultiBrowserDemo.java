package demo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	WebDriver driver = null;
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser name is : "+browserName);
		System.out.println("Thread Id is "+ Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\SeleniumTutorial\\drivers\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
		
	}
	@Test
	public void test1() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
		
	}

}
