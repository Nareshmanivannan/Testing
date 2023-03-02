package org.baseclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberBaseClass {
	
	   public static WebDriver driver;
	       
	       public static void browserLaunch() {
	    	   
	    	   WebDriverManager.chromedriver().setup();
			   driver=new ChromeDriver();
			   driver.manage().window().maximize();

		}
		public static void launchUrl(String url) {
			
	driver.get(url);
		}
		public static void passText(WebElement ele,String txt) {
	ele.sendKeys(txt);
		}
		public static void click(WebElement ele) {
	ele.click();
		}
		public static void getThePageTitle() {
			String title = driver.getTitle();
	System.out.println(title);
		}
		public static void getTheUrl() {
			String url = driver.getCurrentUrl();
			System.out.println(url);

		}
		public static void datadriven( int gettherow,int getthecell ) throws IOException {
			
			File f= new File("C:\\Users\\nares\\eclipse-workspace\\Day1\\excel sheet\\fb data.xlsx");
			FileInputStream fis =new FileInputStream(f);
			Workbook w=new XSSFWorkbook(fis);
			Sheet s = w.getSheet("Sheet1");
		    Row row = s.getRow(gettherow);
			Cell cell = row.getCell(getthecell);
			
			
		}
		//create excel file
		
		public static  void createExcelFile(int gettherow, int getthecell ) throws IOException {	
			File f= new File("C:\\Users\\nares\\eclipse-workspace\\Day1\\excel sheet\\new file.xlsx");
			Workbook wb=new XSSFWorkbook();
			Sheet newsheet = wb.createSheet();
				Row newrow = newsheet.createRow(gettherow);
				Cell newcell = newrow.createCell(getthecell);
				newcell.setCellValue("naresh");
				FileOutputStream fos =new FileOutputStream(f);
				wb.write(fos);
		}
			
	// create cell only 
		public static void createCellOnly(int gettherow,int createthecell,String data) throws IOException {

			
			File f= new File("C:\\Users\\nares\\eclipse-workspace\\Day1\\excel sheet\\new file.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb=new XSSFWorkbook();
			Sheet newsheet = wb.getSheet("data");
				Row newrow = newsheet.getRow(gettherow);
				Cell newcell = newrow.createCell(createthecell);
				newcell.setCellValue(data);
				FileOutputStream fos =new FileOutputStream(f);
				wb.write(fos);
				
		}
		//create row only
		
		public static void createRowOnly(int createtherow ,int getthecell,String data) throws IOException {
			File f= new File("C:\\Users\\nares\\eclipse-workspace\\Day1\\excel sheet\\new file.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb=new XSSFWorkbook();
			Sheet newsheet = wb.getSheet("data");
				Row newrow = newsheet.createRow(createtherow);
				Cell newcell = newrow.createCell(getthecell);
				newcell.setCellValue(data);
				FileOutputStream fos =new FileOutputStream(f);
				wb.write(fos);
		}

}
