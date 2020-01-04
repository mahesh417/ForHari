package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) {
		// singlecell();
		// singleCellStingCovert();
		// findingDataInExcel();
		// singleCellStingCovert2();
		// readDataSingleRow();
		// readTotalData();
		// readDataExcel1();// using SwitchCase

	}

	// ======================================================================================================================================================================================
	public static void singlecell() {

		File f = new File("Test_Data/Worksheet.xlsx");

		try {

			XSSFWorkbook wb = new XSSFWorkbook(f);
			XSSFSheet sh = wb.getSheetAt(0);
			XSSFRow row = sh.getRow(4);
			if (row != null) {
				XSSFCell cell = row.getCell(3);
				String CellVal = cell.getStringCellValue();
				System.out.println(CellVal);
			} else {
				System.out.println("given row num doesnot exist in excel");
			}
			wb.close();
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// ============================================================================================================================================================

	public static void singleCellStingCovert() {
		File f = new File("Test_Data/Worksheet.xlsx");
		String cvlaue = "";
		try {
			XSSFWorkbook xsf = new XSSFWorkbook(f);
			XSSFSheet sh = xsf.getSheetAt(0);
			XSSFRow ro = sh.getRow(2);
			XSSFCell cell = ro.getCell(2);
			CellType ct = cell.getCellTypeEnum();

			switch (ct) {
			case NUMERIC:
				cvlaue = String.valueOf((int) (cell.getNumericCellValue()));
				break;
			case BOOLEAN:
				cvlaue = String.valueOf(cell.getBooleanCellValue());
				break;
			case STRING:
				cvlaue = cell.getStringCellValue();
				break;

			default:
				break;

			}
			xsf.close();
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block

			System.out.println("nkjnkn");
		}
		System.out.println(cvlaue);

	}

	// ======================================================================================================================================================================================================================
	public static void findingDataInExcel() {

		int rowNo = -1;
		int colNo = -1;
		XSSFWorkbook xs;
		XSSFSheet sh;
		String data = "df";
		try {
			xs = new XSSFWorkbook("Test_Data/Worksheet.xlsx");
			sh = xs.getSheetAt(0);
			int totalrow = sh.getLastRowNum();
			for (int i = 0; i < totalrow; i++) {
				XSSFRow row = sh.getRow(i);
				// System.out.println("totalrow:" + totalrow);
				// System.out.println(i);
				int totalcell = row.getLastCellNum();
				for (int j = 0; j < totalcell; j++) {

					XSSFCell cell = row.getCell(j);
					String s2 = cell.getStringCellValue();
					if (s2.equalsIgnoreCase(data)) {
						rowNo = i;
						colNo = j;
						System.out.println(s2);
						System.out.println("Rown Number is: " + rowNo + " :  Column NUber is: " + colNo);

					}
					// System.out.print(cell + " ");
				}
				// System.out.println(" ");
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	// ===================================================================================================

	public static void singleCellStingCovert2() {
		File f = new File("Test_Data/Worksheet.xlsx");

		XSSFWorkbook xsf;
		try {
			xsf = new XSSFWorkbook(f);
			XSSFSheet sh = xsf.getSheetAt(0);
			XSSFRow r = sh.getRow(0);

			for (int i = 0; i < sh.getLastRowNum(); i++) {
				for (int j = 0; j < r.getLastCellNum(); j++) {
					XSSFCell cell = sh.getRow(i).getCell(j);
					System.out.println(cell);

				}
			}

		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readDataSingleRow() {

		String path = "Test_Data/PIM.xlsx";
		try {

			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook xs = new XSSFWorkbook(fis);
			XSSFSheet sh = xs.getSheetAt(0);
			XSSFRow row = sh.getRow(0);
			XSSFCell col = row.getCell(0);
			System.out.println(col);
			xs.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ==============================================================================================================================

	public static void readTotalData() {

		String path = "Test_Data/PIM.xlsx";
		try {
			XSSFWorkbook wb = new XSSFWorkbook(path);
			XSSFSheet sh = wb.getSheetAt(0);

			int lastrow = sh.getLastRowNum();
			for (int i = 0; i <= lastrow; i++) {
				XSSFRow row = sh.getRow(i);

				int lastcell = row.getLastCellNum();
				for (int j = 0; j <= lastcell; j++) {
					XSSFCell col = row.getCell(j);

					System.out.print(col + " ");
				}
				System.out.println("");
			}
			wb.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// =========================================================================================================================================================

	public static void readDataExcel1() {
		String filpath = "Test_Data/PIM.xlsx";
		XSSFWorkbook xf;
		String cellVal = "";
		try {
			xf = new XSSFWorkbook(filpath);
			XSSFSheet sh = xf.getSheetAt(0);

			XSSFRow row = sh.getRow(0);
			if (row != null) {
				XSSFCell col = row.getCell(0);
				if (col != null) {
					// String CellType=col.getStringCellValue();
					// System.out.println(CellType);
					CellType ct = col.getCellTypeEnum();
					switch (ct) {
					case STRING:
						cellVal = col.getStringCellValue();
						break;
					case NUMERIC:
						cellVal = String.valueOf((int) col.getNumericCellValue());

					default:
						break;

					}
					System.out.println(cellVal);

				} else {
					System.out.println("fail");
				}

			} else {
				System.out.println("fail");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}