package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String project_path = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		// TODO Auto-generated constructor stub
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//getRowCount();
		//getCellDataString();
		//getCellDataNumber();
	}

	public static int getRowCount() throws IOException {
		int rowCount =0;
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows:"+ rowCount);
		return rowCount;
		
	}
	public static int getColCount() throws IOException {
		int colCount = 0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of Col:"+ colCount);
		return colCount;
		
	}
	
	
	public static String getCellDataString(int rowNum,int colNum) throws IOException {
		String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("cellData "+ cellData);
		return cellData;
	    
	}
	public static double getCellDataNumber(int rowNum, int colNum) throws IOException {
		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println("cellData "+ cellData);
		return cellData;
	    
	}
}
