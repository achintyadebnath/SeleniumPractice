package com.google;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Selenium1 {

	public static void main(String[] args) throws Exception {
		try {
			XSSFWorkbook wb = new XSSFWorkbook("E:/Selenium/MyWorkbook.xlsx");
			XSSFSheet s1 = wb.getSheet("Input");
			
			System.out.println(s1.getRow(0).getCell(0).getStringCellValue());
			wb.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}