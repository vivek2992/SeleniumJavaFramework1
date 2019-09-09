package utils;

public class ExcelUtilsDemo {
	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectpath+"/excel/data.xlsx","Sheet1");
		
		excel.GetRowCount();
		excel.GetColCount();
		excel.GetCellDataString(0,0);
		excel.GetCellDataNumber(1,1);
	}
}
