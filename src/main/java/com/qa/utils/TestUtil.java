	package com.qa.utils;
	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import com.crm.qa.base.TestBase;
	
	
	
	public class TestUtil extends TestBase{
		static Workbook book;
		static Sheet sheet;
		
		public TestUtil() throws IOException {
			
		}
	
		//public static Duration PageLoad_Duration_of_TIMEOUT = 50;
		//public static Duration  Duration_of_TIMEOUT_IMPLICIT_WAIT = 50;
		
		public void frame(String frame) {
			driver.switchTo().frame(frame);
		}
		public static Object [][] getTestData(String sheetName){
			FileInputStream fis=null;
			
			try 
			{
				String  Path="C:\\Users\\Dell\\eclipse-workspace\\FreeCRM.com\\src\\main\\java\\com\\crm\\qa\\testdata\\newdeal.xlsx";
				fis =new FileInputStream(Path);					
			} catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			try {
				book=WorkbookFactory.create(fis);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			sheet=book.getSheet(sheetName);
			Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) 
				{
					data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				}
			}
			return data;
		}
	}