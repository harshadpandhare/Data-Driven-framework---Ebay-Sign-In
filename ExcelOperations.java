package com.datadriven.test;

import com.excel.utility.Xls_Reader1;

public class ExcelOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader1 reader = new Xls_Reader1("C:\\Users\\Harshad\\eclipse-workspace\\Data driven framework\\src\\com\\testdata\\HalfEbayTestData.xlsx");
		
		//reader.isSheetExist("HomePage");
		if(!reader.isSheetExist("HomePage")) {
			reader.addSheet("HomePage");
		}
		int colCount = reader.getColumnCount("RegTestData");
			System.out.println("total col present in RegTestData is : " +colCount);
			System.out.println(reader.getCellRowNum("RegTestData", "firstname", "Harshad"));
	}

}
