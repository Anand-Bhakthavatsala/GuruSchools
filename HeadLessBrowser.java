package Batch5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://book.spicejet.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
