package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReuseCoding {
	XSSFWorkbook wb;
	XSSFSheet sh;

	public ReuseCoding(String path) {
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
			sh = wb.getSheetAt(0);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public String getData(int sheetNum, int row, int col) {

		String data = sh.getRow(row).getCell(col).getStringCellValue();
		return data;

	}

}
