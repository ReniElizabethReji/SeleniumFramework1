package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearch;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    GoogleSearch obj = new GoogleSearch(driver);
	    driver.get("https://www.google.com");
	    obj.setTextInSearchbox("Automation Step");
	    obj.clickSearchBtn();
	   // driver.close();
	}
}
