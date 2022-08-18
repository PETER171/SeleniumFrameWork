package utilies;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilies {
	
	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtilies(String path,String sheetname) {


		try {
			
			workbook = new XSSFWorkbook(path);
			sheet = workbook.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void getRowCount(){
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("We have the following rows "+rowCount);
		int last = sheet.getLastRowNum();

	}
	
	public static void getStringCellData(int row,int cell) {
		String value = sheet.getRow(row).getCell(cell).getStringCellValue();
		System.out.println("This is the value: "+value);
	}
	
	public static void getNumericCellData(int row,int cell) {
		double value = sheet.getRow(row).getCell(cell).getNumericCellValue();
		System.out.println("This is the value: "+value);


	}
	
	
}
