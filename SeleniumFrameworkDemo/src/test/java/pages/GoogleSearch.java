package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By button_searchBy = By.name("btnK");
	
	public GoogleSearch(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void setTextInSearchbox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}

	public void clickSearchBtn() {
		driver.findElement(button_searchBy).sendKeys(Keys.RETURN);
	}
}
