package com.fb.account.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fb.account.base.SetupBase;

public class TestDataProvider extends SetupBase{

	public static String TestExcel = "C:\\Users\\Naveen\\Downloads\\Programs\\WorkBench\\"
			+ "SetUpAccount\\src\\main\\java\\com\\fb\\account\\setupData\\UserDetailsData.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	static DataFormatter df=new DataFormatter();
	
	
	
	public static Object[][] getData(String sheetName)
	{
		FileInputStream file=null;
		
		try {
			file=new FileInputStream(TestExcel);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet=book.getSheet(sheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				String str=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				data[i][j]=str;
			}
		}
		
		return data;
	}
}
