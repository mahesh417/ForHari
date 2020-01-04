package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Two_Dimensional_Array {
	public static void main(String[] args) {

		String[][] Array1 = null;
		File f = new File("TestData//Book1.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			/*
			 * int sheetindex = wb.getSheetIndex("Sheet1"); if (sheetindex >= 0) {
			 */ XSSFSheet sh = wb.getSheetAt(0);
			int totalrow = sh.getLastRowNum();
			Array1 = new String[totalrow + 1][];
			for (int i = 1; i < totalrow; i++) {
				XSSFRow rowN = sh.getRow(i);
				int totalCol = rowN.getLastCellNum();
				Array1[i] = new String[totalCol];
				for (int j = 0; j < totalCol; j++) {
					XSSFCell colN = rowN.getCell(j);
					Array1[i][j] = colN.getStringCellValue();
					System.out.print(Array1[i][j]);
					System.out.print(" ");
				}
				System.out.println(" ");
			}
			/*
			 * else { System.out.println("Sheet Does not Exit"); }
			 */
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}