package testCases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	public static void main(String[] args) throws IOException  {
		
	

	 
	{

		//open the workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/TC001.xlsx");
		//go to the sheet
		XSSFSheet sheet = wBook.getSheet("wBook");

		//find the row count
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);

		//find the column count
		XSSFRow headerrow = sheet.getRow(0);
		
		short columncount = headerrow.getLastCellNum();
 
	


		for(int i=1; i<rowcount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columncount;j++)
			{
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				
			}
		}

		//printing the content
		
		
		wBook.close();
	}

	}


}


