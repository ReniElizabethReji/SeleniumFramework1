package utils;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ExcelDataProvider {
	WebDriver driver = null;
	@BeforeTest	
	public void setUp(){

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTutorial\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test(dataProvider = "test1Data")
	public void test(String username , String password) {
		System.out.println(username +" | "+password);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@DataProvider(name = "test1Data")
	public Object[][] getData() throws IOException {
		String project_path = System.getProperty("user.dir");
		String excelPath = project_path+"/excel/Data.xlsx";
		String sheetName = "Sheet1";
		Object data[][] = getExcelData(excelPath, sheetName);
		return data;

	}
	public Object[][] getExcelData(String excelPath, String sheetName) throws IOException {


		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object data[][] = new Object[rowCount -1][colCount];

		for(int i =1;i <rowCount;i++) {
			for(int j =0;j<colCount;j++) {
				String cellData = excel.getCellDataString(i,j);
				System.out.println(excel.getCellDataString(i,j));
				data[i-1][j] =cellData;
			}
		}
		return data;


	}

}
