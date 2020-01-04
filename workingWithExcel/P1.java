package workingWithExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P1 {
	public static void main(String[] args) {

		
		try {
			FileInputStream fis= new FileInputStream("TestData/Book1.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);

			String tcId = "EMP_CREATE_001";

			int rowNum = getRowNum_By_TestCaseId(sheet, tcId);
			if (rowNum == -1) {
				System.out.println("Given test case :" + tcId + " Not found in the data sheet.");
			} else {
				//String val = getDataFromCell(sheet, rowNum, "FIRST_NAME");
				// System.out.println("Rownum:"+val);
			}
			wb.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	// ********************************************************************************************************************

	public static int getColNum_By_Header(XSSFSheet sheet, String columnName) {
		int colNum = -1;
		XSSFRow row = sheet.getRow(0);
		int totalCols = row.getLastCellNum();
		for (int cNum = 0; cNum < totalCols; cNum++) {
			XSSFCell column = row.getCell(cNum);
			if (column != null) {
				String colHeader = column.getStringCellValue();
				if (colHeader.equalsIgnoreCase(columnName)) {
					colNum = cNum;
					break;
				}
			}
		}
		return colNum;
	}
	// ****************************************************************************************************************

	public static int getRowNum_By_TestCaseId(XSSFSheet sheet, String tcId) {
		int rowNumforTc = -1;
		int totalRows = sheet.getLastRowNum();
		for (int rowNum = 1; rowNum <= totalRows; rowNum++) {
			XSSFRow row = sheet.getRow(rowNum);
			if (row != null) {
				XSSFCell ocell = row.getCell(getColNum_By_Header(sheet, "TC_ID"));
				String testCaseId = ocell.getStringCellValue();
				if (testCaseId.equalsIgnoreCase(tcId)) {
					rowNumforTc = rowNum;
					break;
				}
			}

		}
		return rowNumforTc;
	}

	// ****************************************************************************************************************
	public static String getDataFromCell(XSSFSheet sheet, int rowNum, String columnName) {
		String cellValue = "";
		XSSFRow row = sheet.getRow(rowNum);
		if (row != null) {
			XSSFCell ocell = row.getCell(getColNum_By_Header(sheet, columnName));
			System.out.print("RowNum:" + getColNum_By_Header(sheet, columnName) + " ");

			if (ocell != null) {
				CellType celltype=ocell.getCellTypeEnum();
				//CellType celltype = ocell.getCellType();

				switch (celltype) {

				case STRING:
					cellValue = ocell.getStringCellValue();
					break;
				case NUMERIC:
					cellValue = String.valueOf((int) ocell.getNumericCellValue());
					break;
				case BOOLEAN:
					cellValue = String.valueOf(ocell.getBooleanCellValue());
					break;
				default:
					cellValue = String.valueOf(ocell.getNumericCellValue());
					break;
				}

			}
			System.out.println(cellValue);

		}

		return cellValue;
	}
}