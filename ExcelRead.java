package Batch5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

public static void main(String[] args) throws IOException {
		
		// To identify the excel file
		FileInputStream fis = new FileInputStream("E:/Anand/Automation/AutomationData.xlsx");
		
		//To identify the excel file and handle the sheets
		XSSFWorkbook workbook = new XSSFWorkbook(fis);//AutomationData.xlsx file reference
		XSSFSheet seleniumsheet = workbook.getSheetAt(0);//Selenium sheet which is 1st sheet in the work book
		
		//get the row and column
		int rowcount = seleniumsheet.getPhysicalNumberOfRows();
		int columncount = seleniumsheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rowcount);
		System.out.println(columncount);
		
		XSSFRow row = seleniumsheet.getRow(4);
		XSSFCell cell = row.getCell(1); //cell refer to 5,1
			
		System.out.println(cell);
		
		cell.setCellValue("Batch-5 Oct 2021");		
		FileOutputStream fos = new FileOutputStream("E:/Anand/Automation/AutomationData.xlsx");
		workbook.write(fos);
		
	}


}
