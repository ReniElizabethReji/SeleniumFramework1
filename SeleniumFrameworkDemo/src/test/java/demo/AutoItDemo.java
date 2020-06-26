package demo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoItDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		test();
	}
public static void test() throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");;
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.tinyupload.com");
    WebElement element = driver.findElement(By.name("uploaded_file"));
    element.click();
   // Runtime.getRuntime().exec("C:\\Users\\Jancy Jose\\Documents\\FileUploadScript.exe");
    
    Thread.sleep(3000);
}
}
