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
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExcelRead extends BaseClass{
	
	@Test 
	public void readData() throws IOException
	{
		//This is to identify the excel file
		FileInputStream fis = new FileInputStream("E:\\Anand\\Automation\\AutomationData.xlsx");
		
		//Workbook to identify the excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis); //AutomationData.xlsx
		XSSFSheet seleniumSheet = workbook.getSheetAt(0);//Selenium
				
		//get row and column count
		int rowcount = seleniumSheet.getPhysicalNumberOfRows();//6th record as index starts from 0
		int columncount = seleniumSheet.getRow(0).getPhysicalNumberOfCells();//no of columns
		
		for(int i=0;i<rowcount;i++) //row 
		{
			for(int j=0;j<columncount;j++) //column
			{
				String data = seleniumSheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
	}
}
