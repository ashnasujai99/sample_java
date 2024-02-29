package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample {
static FileInputStream f;//for file
static XSSFWorkbook w;
static XSSFSheet sh;

public static String readStringData(int row,int coloumn) throws IOException {
	f=new FileInputStream("C:\\Users\\91889\\Desktop\\java_excel.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	 XSSFRow r=sh.getRow(row);
	 XSSFCell c=r.getCell(coloumn);
	 return c.getStringCellValue();
}

public static String readIntegerData(int row,int coloumn) throws IOException {
	f=new FileInputStream("C:\\Users\\91889\\Desktop\\java_excel.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	 XSSFRow r=sh.getRow(row);
	 XSSFCell c=r.getCell(coloumn);
	 int val=(int) c.getNumericCellValue();
	 return String.valueOf(val);
}
}
