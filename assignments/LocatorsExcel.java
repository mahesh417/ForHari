package assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LocatorsExcel {
	
	public static void main(String[] args) {
		readingFromExcel();
	}
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static XSSFRow row;
	static XSSFCell col;

	public static void readingFromExcel() {
		String s = "Test_Data/Locators.xlsx";
		try {
			FileInputStream fis = new FileInputStream(s);
			wb=new XSSFWorkbook(fis);
			sh=wb.getSheet("MAHI");
			row=sh.getRow(0);
			col=row.getCell(0);
			String colV=col.getStringCellValue();
			System.out.println(colV);

		} catch (IOException e) {
		}

	}
	
}