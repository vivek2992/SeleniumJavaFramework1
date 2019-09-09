package utils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectpath; 
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelUtils(String excelPath, String sheetName) 
	{
		try {
				workbook = new XSSFWorkbook(excelPath);
				sheet = workbook.getSheet(sheetName);
			}
		catch(Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
	}
	public static void main(String[] args)
	{
		GetRowCount();
		GetCellDataString(0, 0);
		GetCellDataNumber(1, 1);
	}
	public static int GetRowCount()
	{
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowcount);
			return rowcount;
	}
	public static int GetColCount()
	{
			int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of cols : "+colcount);
			return colcount;
	}
	public static String GetCellDataString(int rownum, int colnum)
	{
			String celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			//System.out.println(celldata);
			return celldata;
	}
	public static void GetCellDataNumber(int rownum, int colnum)
	{
			double celldata = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			System.out.println(celldata);
	}
}
