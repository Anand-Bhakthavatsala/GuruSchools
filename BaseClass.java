package CapGTest.CapGTestBatch2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	static String browser="chrome";
	static WebDriver driver=null;
	
	public static void invokeBrowser()
	{
		
		if(browser.equalsIgnoreCase("chrome")) //Condition
		{
			//Invoke the Chrome browser
			//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_93\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();//maximize the window 
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//Firefox Browser
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();//maximize the window 
			
		}
	}
	
	static void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		System.out.println("Browser is closed");
	}

}
