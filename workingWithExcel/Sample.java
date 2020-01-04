package workingWithExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) {

		readSingleline();
	}

	// =============================================================================================================================================
	public static void readSingleline() {
		String path = "Test_Data/Worksheet.xlsx";
		XSSFWorkbook xs;
		try {
			xs = new XSSFWorkbook(path);
			XSSFSheet sh = xs.getSheetAt(0);
			// XSSFRow row=sh.getRow(0);
			// XSSFCell col=row.getCell(0);
			int totalrow = sh.getLastRowNum();

			for (int i = 0; i <= totalrow; i++) {

				String data = sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println(data + " ");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
