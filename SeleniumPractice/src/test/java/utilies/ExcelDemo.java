package utilies;

public class ExcelDemo {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+"/ExcelData/Data.xlsx";
		ExcelUtilies excelUtilies = new ExcelUtilies(path, "Sheet1");
		excelUtilies.getRowCount();
		excelUtilies.getNumericCellData(1, 1);
		excelUtilies.getStringCellData(0, 1);
	}

}
