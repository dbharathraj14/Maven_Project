package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class2 {

	public static WebDriver driver; 
	public static String value;
	
	public static WebDriver BrowserConfig(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dzbha\\eclipse-workspace\\Selenium_New\\New_Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\New_Driver\\chromedriver.exe"); 
			 driver = new ChromeDriver();                                  // C:\Users\dzbha\eclipse-workspace\Maven_New\New_Driver\chromedriver.exe
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void ClickOnElement(WebElement element ) {
		element.click();
		}
	public static void inputValueElement(WebElement element , String input) {
		element.sendKeys(input);
	}
	public static void Dropdown(String type, WebElement element, String Value) {
		Select s = new Select(element);
		if(type.equalsIgnoreCase("Days")) {
			s.selectByValue(Value);
		}
		else if(type.equalsIgnoreCase("Months")) {
			s.selectByValue(Value);
			
		}
		else if(type.equalsIgnoreCase("Year")) {
			s.selectByValue(Value);
		}
		
		}
	public static void Screenshot(String path) throws IOException {
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File scr = sc.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		FileUtils.copyFile(scr, dst);
		
	}
	public static void ScrollupandDown(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	public static void getUrl(String Url) {
		driver.get(Url);
		
	}
	public static void Wait_Time(int unit, TimeUnit value) {
		driver.manage().timeouts().implicitlyWait(unit, value);
	}
	
	public static void Switch2DefaultContent() {
		driver.switchTo().defaultContent();
	}
	public static void Browser_Close() {
		driver.close();
	}
    public static void Switch2Frame(WebElement element) {
    	driver.switchTo().frame(element);
    	
    }
    public static String get_Particular_CellData(String path, int index, int row, int column ) throws IOException {
    	File f = new File(path);
    	FileInputStream fis = new FileInputStream(f);
    	Workbook wb = new XSSFWorkbook(fis);
    	Sheet s = wb.getSheetAt(index);
    	Row r = s.getRow(row);
    	Cell c = r.getCell(column);
    	CellType type = c.getCellType();
    	if(type.equals(CellType.STRING)) {
    	    value = c.getStringCellValue();
    	}
    	else if(type.equals(CellType.NUMERIC)) {
    		double dval = c.getNumericCellValue();
    		int ival = (int) dval;
    		value = String.valueOf(ival);
    		}
    	wb.close();
    	return value;
    	
    }
    

}
