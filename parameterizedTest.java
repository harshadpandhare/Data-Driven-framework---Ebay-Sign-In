package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader1;

public class parameterizedTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome","C:\\Users\\Harshad\\Desktop\\selenium");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&UsingSSL=1&co_partnerId=2&errmsg=&src=&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fsignin.ebay.com%3A443%2Fws%2FeBayISAPI.dll%3FSignIn%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F&rv4=1");
		
		Xls_Reader1 reader = new Xls_Reader1("C:\\Users\\Harshad\\eclipse-workspace\\Data driven framework\\src\\com\\testdata\\HalfEbayTestData.xlsx");
		
		int rowCount = reader.getRowCount("RegTestData");
		
		for(int rowNum = 2; rowNum<=rowCount ; rowNum++) {
			
			System.out.println("============");
			String firstname = reader.getCellData("RegTestData","firstname" ,rowNum);
			System.out.println(firstname);
			
			String lastname = reader.getCellData("RegTestData","lastname", rowNum);
			System.out.println(lastname);
			
			String email = reader.getCellData("RegTestData","email", rowNum);
			System.out.println(email);
			
			
			driver.findElement(By.xpath("//*[@id='firstname']")).clear();
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
			
			driver.findElement(By.xpath("//*[@id='lastname']")).clear();
			driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastname);
			
			driver.findElement(By.xpath("//*[@id='email']")).clear();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
		
		}
	}
}
