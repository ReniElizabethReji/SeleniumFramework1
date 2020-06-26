package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile_Demo;


public class GoogleSearchTestNGDemo {
WebDriver driver = null;
public static String browserName =null;
@BeforeTest	
public void setUp(){
	System.out.println("browserName"+browserName);
	PropertiesFile_Demo.getProperties();
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
public void googleSearch() {

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		//driver.findElement(By.name("btnK")).sendKeys("keys.RETURN");

		
	}
@AfterTest	
	public void closeBrowser() throws IOException {
		driver.close();
		//driver.quit();
		PropertiesFile_Demo.setProperties();
	}
	
	


}
