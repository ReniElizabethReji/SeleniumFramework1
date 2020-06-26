package listeners;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGListenerDemo {
	 WebDriver driver =null;
	@Test
	public void test1(){
		System.out.println("I am inside test1");
	}
	@Test
	public void test2(){
		System.out.println("I am inside test2");
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("abc")).sendKeys("Automation");
		driver.close();
		
	    
	}
	@Test
	public void test3(){
		System.out.println("I am inside test3");
	
	}

}
