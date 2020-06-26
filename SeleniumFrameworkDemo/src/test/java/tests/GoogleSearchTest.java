package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();

	}
	
	public static void googleSearch() {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSearchPage.search_textbox(driver).sendKeys("Automation");
		GoogleSearchPage.search_button(driver).click();
		driver.close();
		
	}
	
	


}
