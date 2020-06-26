import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumTutorial\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

}
