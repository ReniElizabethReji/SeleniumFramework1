package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import tests.GoogleSearchTestNGDemo;

public class PropertiesFile_Demo {
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		getProperties();
		setProperties();
	}
	public static void getProperties() {
		try {
			
			InputStream input =new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser =prop.getProperty("browser");
			System.out.println(browser);
			GoogleSearchTestNGDemo.browserName = browser;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void setProperties() throws IOException {
		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			prop.setProperty("result","Pass");
			prop.store(output, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
