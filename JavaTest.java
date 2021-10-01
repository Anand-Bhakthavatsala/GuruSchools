package Batch5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaTest {
	
	static WebDriver driver=null;
	static String browser;
	static Properties prop;
	static FileInputStream fis;
	static String baseurl;
	
	public static void propertyfile() throws IOException
	{
		fis=new FileInputStream("E:\\eclipse-workspace\\Batch5\\data\\data.properties");
		prop = new Properties();
		prop.load(fis);
		baseurl = prop.getProperty("url");
		browser=prop.getProperty("browser");
	}
	
	public static void main(String[] args) throws IOException {
		
		propertyfile();
	/*	JavaTest jt = new JavaTest();
		jt.propertyfile();*/
		
		if(browser.equalsIgnoreCase("chrome")) //if(true)
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();//upcasting	
			driver.manage().window().maximize();
		}	
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}	
		else
			System.out.println("No browser invoked");
		
		driver.navigate().to(baseurl);
		
		
	}

}
