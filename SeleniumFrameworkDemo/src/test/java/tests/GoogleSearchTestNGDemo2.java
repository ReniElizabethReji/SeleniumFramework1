package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GoogleSearchTestNGDemo2 {
WebDriver driver = null;
@BeforeTest	
public void setUp(){
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();	
}
@Test	
public void googleSearch2() {

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		//driver.findElement(By.name("btnK")).sendKeys("keys.RETURN");

		
	}
@Test	
public void googleSearch3() {

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		//driver.findElement(By.name("btnK")).sendKeys("keys.RETURN");

		
	}
@AfterTest	
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
	


}
