package com.ta.planetfashion.DataMgnt;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException; 

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import com.ta.planetfashion.base.Base;


public class DataManagement extends Base {

	public static String TESTDATA_SHEET_PATH = "C:/Users/Admin/eclipse-workspace/PlanetShop/src/main/java/com/ta/planetfashion/DataMgnt/PlanetFashion_TestData.xlsx";
	
	//sheet and workbook are interfaces in java
	static Workbook book;
	static Sheet sheet;
	
		
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			// to open the test data sheet
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
	
}
