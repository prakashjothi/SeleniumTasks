package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelTest {
	
	@Test
	private void readExcel() throws IOException {
			
		File f = new File("C:\\Users\\jprne\\eclipse-workspace\\prakash\\SeleniumTasks\\src\\test\\resources\\Excel\\Login details.xlsx");
		FileInputStream st = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(st);
		Sheet s = w.getSheet("Sheet1");
		String value = "";
		
		Row row = s.getRow(1);
		Cell cc = row.getCell(0);
		
		int cellType = cc.getCellType();
		
		if(cellType==1) {
			value = cc.getStringCellValue();
		}
		else {
			if(DateUtil.isCellInternalDateFormatted(cc)) {
				Date date = cc.getDateCellValue();
				SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
				value = sf.format(date);
			}
			else {
				double num = cc.getNumericCellValue();
				long ln = (long)num;
				value = String.valueOf(ln);
			}
			
				
		}
		System.out.println(value);
					
		
	}
	

}
