package demo;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class FluentWaitDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		fluentWait();
	}

	public static void fluentWait() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");	
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.linkText("ABC Alphabet Songs for Children | 3D ABCD Songs ..."));
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.linkText("Learn ABCD with Balls | A for Apple | Letters for Toddlers ..."));
			     }
			   });
			   element.click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
