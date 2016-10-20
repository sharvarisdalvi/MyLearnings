package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class ExcelTogetAllData {



	public static Sheet sh=null;
	//To get the workbook
	public static Workbook getWorkbook(String filepath) throws Exception, IOException
	{
		Workbook workbook = null;
		if (filepath.endsWith("xlsx")) {
			workbook = new XSSFWorkbook(new FileInputStream(new File(filepath)));
		} else if (filepath.endsWith("xls")) {
			workbook = new HSSFWorkbook(new FileInputStream(new File(filepath)));
		} else {
			throw new IllegalArgumentException("The specified file is not Excel file");
		}


		return workbook;
	}

	public static int rowNumber(String filepath) throws IOException, Exception

	{
		int rowNum=0;
		Workbook wb=getWorkbook(filepath);
		sh=wb.getSheetAt(0);
		rowNum=	sh.getLastRowNum()+1;

		return rowNum;

	}

	public static int columnNumber(String filepath) throws IOException, Exception

	{
		int columNum=0;
		Workbook wb=getWorkbook(filepath);
		sh=wb.getSheetAt(0);
		columNum=	sh.getLastRowNum()+1;

		return columNum;

	}

	public static int getIndexByGivenParamenter(String textToBeSearch,String filepath) throws IOException, Exception
	{
		int index=0;
		Workbook wb=getWorkbook(filepath);
		sh=wb.getSheetAt(0);
		int rowNum=rowNumber(filepath);
		for(int i=1;i<rowNum;i++)
		{
			Cell cell=sh.getRow(i).getCell(0);
			System.out.println("vaule=="+cell);
			if(cell.getCellType() == Cell.CELL_TYPE_STRING)
			{
												
				if(cell.getStringCellValue().trim().equalsIgnoreCase(textToBeSearch.trim())){
					System.out.println("actual texct  "+cell.toString()+"  expected  "+textToBeSearch);
					return i;
				}


			}
		}


		return 0;



	}

	public static void SetValueInCell(String textToBeSearch,String textToBeEnter,String filepath) throws Exception, Exception
	{
		int index=getIndexByGivenParamenter(textToBeSearch, filepath);
		if(index==0)
		{
			System.out.println("element is not avialbale is sheet");
		}
		else{
		Workbook wb=getWorkbook(filepath);
		sh=wb.getSheetAt(0);
		
	Cell cell=	sh.getRow(index).createCell(2);
		cell.setCellValue(textToBeEnter);
		//wb.close();
		FileOutputStream outputStream = new FileOutputStream(new File(filepath));
		wb.write(outputStream);
		outputStream.close();
		((FileInputStream) wb).close();
		}

	}


	public static String[][] getExcelData(String filePath) throws Exception {
		String[][] userDetais = null;

		Workbook wb=	getWorkbook(filePath);


		Sheet sh = wb.getSheetAt(0);
		int totalRowCount = sh.getLastRowNum() + 1;
		int coumNumber = sh.getRow(1).getLastCellNum();

		userDetais = new String[totalRowCount - 1][coumNumber];

		for (int i = 1; i < totalRowCount; i++)

		{

			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {

				Cell cell = sh.getRow(i).getCell(j);


				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					if(cell.getHyperlink()!=null)
						System.out.println(cell.getHyperlink().getLabel());

					userDetais[i - 1][j] = cell.getStringCellValue();
					System.out.println(userDetais[i - 1][j]);
				} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					String temp = "" + cell.getNumericCellValue();
					temp = temp.substring(0, temp.indexOf("."));

					userDetais[i - 1][j] = temp;
					System.out.println(userDetais[i - 1][j]);



				}

			}
		}
		//	wb.close();
		return userDetais;

	}
	
	

}
/*
 * while(itr.hasNext()) { Row row= itr.next();
 * Iterator<Cell>cellItr=row.cellIterator(); { while(cellItr.hasNext()) { Cell
 * cell=cellItr.next(); switch(cell.getCellType()) { case Cell.CELL_TYPE_STRING:
 * System.out.println(cell.getStringCellValue()); break; case
 * Cell.CELL_TYPE_NUMERIC: System.out.println(cell.getNumericCellValue());
 * break; case Cell.CELL_TYPE_BOOLEAN:
 * System.out.println(cell.getBooleanCellValue()); break;
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 * } }
 * 
 * }
 * 
 * 
 * 
 * }
 */