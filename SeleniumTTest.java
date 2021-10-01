package CapGTest.CapGTestBatch2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumTTest extends BaseClass{
	
	@Test (groups="regression")
	@Parameters("URL")
	public void googleLinks(String url) throws InterruptedException
	{
	//	invokeBrowser();
		WebDriver driver = new HtmlUnitDriver(); //Headless browsr without GUI
		driver.get(url);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		WebElement txtField = driver.findElement(By.xpath("//input[@title='Search']"));
		System.out.println(txtField.getText()+"   "+txtField.getAttribute("name"));
				
		Thread.sleep(5000);
		driver.quit();
	//	closeBrowser();
	}
	
/*	@Test //(groups="smoke")
	public void GetExcelData() throws IOException
	{
		//This is to identify the excel file
		FileInputStream fis = new FileInputStream("E:\\Anand\\Automation\\AutomationData.xlsx");
		
		//Workbook to identify the excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis); //AutomationData.xlsx
		XSSFSheet seleniumSheet = workbook.getSheetAt(0);//Selenium
		//workbook.getSheet("Selenium");
		XSSFRow row = seleniumSheet.getRow(7);//6th record as index starts from 0
		XSSFCell cell = row.getCell(1);//6,0 cell value will be retrieved
		
		System.out.println("Cell value of 8,1 -> "+cell); //print the corresponding cell value
	
		
		//The total no of rows/records
		int records = seleniumSheet.getPhysicalNumberOfRows();
		System.out.println("Total no of records/rows "+records);
		
		int columns = seleniumSheet.getRow(0).getPhysicalNumberOfCells();//no of columns
		
		System.out.println(columns);
		//no of columns
		System.out.println("Last cell no "+seleniumSheet.getRow(0).getLastCellNum());
		
		
	}*/
}
