package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Iterator;

public class ExcelUtilsUpdated {
	public static InputStream XlsxFileToRead = null;
	public static XSSFWorkbook workbook = null;
	public static XSSFSheet sheet;
    public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public int getRowCount(String sheetName){
		int index = workbook.getSheetIndex(sheetName);
		
		if(index==-1)
			return 0;
		else{
		sheet = workbook.getSheetAt(index);
		XSSFSheet	sheet1=workbook.getSheet(sheetName);
		int number=sheet.getLastRowNum()+1;
		return number;
		}
		
	}
	
	
}
