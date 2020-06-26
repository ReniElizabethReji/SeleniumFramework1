package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		test();
	}
	
	public static void test() {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1366,768");
	    WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.google.com");
	    System.out.println( driver.getTitle());
	   
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("completed");
	    
	}

}
