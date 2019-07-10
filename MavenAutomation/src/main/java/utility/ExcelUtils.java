package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
private static XSSFSheet Sh;
private static XSSFWorkbook Wb;
private static XSSFCell Cell;
//private static XSSFRow Row;

public static void setExclFile(String FilePath, String SheetName)
{
try
{
FileInputStream ExcelFile = new FileInputStream(FilePath);
   // Access the required test data sheet
   Wb = new XSSFWorkbook(ExcelFile);
   Sh = Wb.getSheet(SheetName);
}
catch (FileNotFoundException e){
System.out.println("Could not read the Excel sheet");
e.printStackTrace();
}
catch (IOException e){
System.out.println("Could not read the Excel sheet");
e.printStackTrace();
}}
public static Object[][] getExcelData() 
{   
   String[][] excelData = null;
    
   int startRow = 1;
   int startCol = 1;
   int ci,cj;
   int totalRows = Sh.getLastRowNum();
   // you can write a function as well to get Column count
   int totalCols = 2;
   excelData=new String[totalRows][totalCols];
   ci=0;
   for (int i=startRow;i<=totalRows;i++, ci++)
   {               
  cj=0;
   for (int j=startCol;j<=totalCols;j++, cj++)
   {
   excelData[ci][cj]=getCellData(i,j);
   System.out.println(excelData[ci][cj]);
   
}
}
 
 
return(excelData);
}
public static String getCellData(int RowNum, int ColNum) 
{
   try{    
   Cell = Sh.getRow(RowNum).getCell(ColNum);
    String CellData = Cell.getStringCellValue();
    return CellData;
   }
   catch (Exception e)
   {
return"";
}
}
}


