package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void particular_cell_Data() throws IOException {
		
		File f = new File("C:\\Users\\dzbha\\eclipse-workspace\\Maven_New\\target\\UserData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(0);
		
		CellType type = c.getCellType();
		
		//CellType celltyp = type != null? type.STRING:type.NUMERIC; 
		
		if (type.equals(CellType.STRING)) {
			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			
			int ival = (int) numericCellValue; //narrowing type casting
			System.out.println(ival);
			
		}
		wb.close();
		
	}
	
    public static void all_Data() throws IOException{
	       
    	File f = new File ("C:\\Users\\dzbha\\Desktop\\UserData.xlsx"); 
    	FileInputStream fis = new FileInputStream(f);
    	Workbook wb = new XSSFWorkbook(fis);
    	Sheet s = wb.getSheetAt(0);
    	
    	int Allrows = s.getPhysicalNumberOfRows();
    	
    	for (int i = 0; i < Allrows; i++) {
			 
    		Row r = s.getRow(i); //i represents row index
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			
			Cell c = r.getCell(j); //j represents column index
			
		       CellType Type = c.getCellType();
			  if(Type.equals(CellType.STRING)) {
				  String sval = c.getStringCellValue();
				  System.out.println(sval);
			  }
			  else if(Type.equals(CellType.NUMERIC)){
				  double nval = c.getNumericCellValue();
				  int ival = (int) nval;
				  String sval = Integer.toString(ival);
				  System.out.println(sval);
				  
			  }
		}
		}
    	
    	wb.close();
    	}
    public static void particular_Row_Data() throws IOException {
    	System.out.println("particular_Row_Data");
    	File f = new File ("C:\\Users\\dzbha\\Desktop\\UserData.xlsx");
    	FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(1);
		for(int i=0; i<r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
			CellType type = c.getCellType();
			if(type.equals(CellType.STRING)) {
				String sval = c.getStringCellValue();
				System.out.println(sval);
			}
			else if(type.equals(CellType.NUMERIC)) {
				double nval = c.getNumericCellValue();
				int ival = (int) nval;
				String sval = Integer.toString(ival);
				System.out.println(sval);
				}
		}
		wb.close();
		System.out.println("---------------------");
		}
    public static void particular_Column_Data() throws IOException {
    	System.out.println("particular_Column_Data");
    	File f = new File ("C:\\Users\\dzbha\\Desktop\\UserData.xlsx");
    	FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		for(int i=0; i<s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		Cell c = r.getCell(1);
		CellType type = c.getCellType();
		if(type.equals(CellType.STRING)) {
			String sval = c.getStringCellValue();
			System.out.println(sval);
		}
		else if(type.equals(CellType.NUMERIC)) {
			double nval = c.getNumericCellValue();
			int ival = (int) nval;
			String sval = Integer.toString(ival);
			System.out.println(sval);
			}
		}
		wb.close();
		System.out.println("---------------------");
		 }
	public static void main(String[] args) throws IOException {
		particular_cell_Data();
		all_Data();
	    particular_Row_Data();
		particular_Column_Data();
	}

}

