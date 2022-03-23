package com.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\dzbha\\Desktop\\Write_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
//		Sheet s = wb.createSheet("Emp_Details");
//		Row r = s.createRow(0);
//		Cell c = r.createCell(0);
//		c.setCellValue("Employee");
//		String sval = c.getStringCellValue();
//		System.out.println(sval);
		
		wb.createSheet("Emp_Details").createRow(0).createCell(0).setCellValue("Employee name");
		wb.getSheet("Emp_Details").getRow(0).createCell(1).setCellValue("Employee salary");
		wb.getSheet("Emp_Details").createRow(1).createCell(0).setCellValue("Bharath");
		wb.getSheet("Emp_Details").getRow(1).createCell(1).setCellValue("200000");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Write Successful");
		wb.close();

	}

}
