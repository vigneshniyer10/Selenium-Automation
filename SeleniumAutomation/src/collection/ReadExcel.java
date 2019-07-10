package collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\Admin\\Desktop\\Selenium Training\\Username&Passwords.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(0);
		System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh1.getRow(1).getCell(2).getStringCellValue());
		System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		System.out.println(sh1.getRow(2).getCell(2).getStringCellValue());
		System.out.println(sh1.getRow(3).getCell(1).getStringCellValue());
		System.out.println(sh1.getRow(3).getCell(2).getStringCellValue());	
		wb.close();
	}

}
