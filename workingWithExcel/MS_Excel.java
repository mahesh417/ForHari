package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MS_Excel {

	public static String cellval;
	public static String write1;

	public static void main(String[] args) {
		// p1();
		// Get_Excel_Data_into_Array();
		// Geting_value();

	}

	public static void ReadPrintDataFromExcel() {

		try {
			FileInputStream f = new FileInputStream("F:\\JAVA1\\ClassWork\\config\\env\\ExcelSheet.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(f);
			XSSFSheet st = wb.getSheet("Chaithu1");
			int rows = st.getLastRowNum();
			for (int i = 0; i < rows; i++) {
				XSSFRow rw = st.getRow(i);
				int lastcells = rw.getPhysicalNumberOfCells();
				for (int j = 0; j < lastcells; j++) {
					XSSFCell xcell = rw.getCell(j);
					System.out.print(xcell + " : ");

				}
				System.out.println();
			}
			wb.close();
		} catch (IOException e) {
			System.out.println("IOE");
		}
	}

	public static void p2() {
		try {
			FileInputStream f = new FileInputStream("F:\\JAVA1\\ClassWork\\config\\env\\ExcelSheet.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(f);
			XSSFSheet st = wb.getSheet("Chaithu1");
			int rows = st.getLastRowNum();
			for (int i = 0; i < rows; i++) {
				XSSFRow rw = st.getRow(i);
				int lastcells = rw.getPhysicalNumberOfCells();
				for (int j = 0; j < lastcells; j++) {
					XSSFCell column_header = st.getRow(0).getCell(j);
					if (column_header != null) {
						XSSFCell xcell = rw.getCell(j);
						CellType celtyp = xcell.getCellTypeEnum();

						switch (celtyp) {
						case STRING:

							break;

						default:
							break;
						}
						System.out.print(xcell + " : ");
					}
				}
				System.out.println();
			}
			wb.close();
		} catch (IOException e) {
			System.out.println("IOE");
		}
	}

	public static String[][] GetDataIntoArray(String filepath) {
		String[][] data = null;
		File f = new File(filepath);
		try {
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet4");
			int totalRows = sheet.getLastRowNum();
			int totalcols = sheet.getRow(0).getLastCellNum();
			data = new String[totalRows + 1][totalcols];
			for (int i = 0; i <= totalRows; i++) {
				XSSFRow row = sheet.getRow(i);
				if (row != null) {
					for (int j = 0; j <= totalcols; j++) {
						XSSFCell ocell = row.getCell(j);
						if (ocell != null) {
							String cellval = ocell.getStringCellValue();
							data[i][j] = cellval;
							System.out.print(cellval + " : ");
						}
					}
					System.out.println();
				}
			}
			wb.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

		return data;
	}

	/*
	 * public static HashMap<String, String> loadexcel(String xlPath, String
	 * sheetname,String tcID) { HashMap<String, String>allvlaues= new HashMap<>();
	 * try { FileInputStream fis= new FileInputStream(xlPath); XSSFWorkbook wb= new
	 * XSSFWorkbook(fis); XSSFSheet sheet = wb.getSheet(sheetname); //int rowNum=
	 * Get_rownum_By_TestcaseID(sheetname,tcID);
	 * 
	 * 
	 * 
	 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
	 * e) { }return null; }
	 */
	/*
	 * public static void Geting_value() { try { XSSFWorkbook wbk = new
	 * XSSFWorkbook("F:\\JAVA1\\selenium1\\Libraries\\Test_Data\\Registration.xlsx")
	 * ; XSSFSheet sheet = wbk.getSheet("Chaithu_DB"); String TC_search="TC_ID_03";
	 * String columnName="USERNAME"; int rowNum=
	 * Get_rownum_By_TestcaseID(sheet,TC_search); if(rowNum==-1){
	 * System.out.println("Given testcase: "
	 * +TC_search+" not present in the given sheet"); }else{ String val =
	 * GetDataFromCell(sheet,rowNum,columnName); System.out.println(val); } }catch
	 * (IOException e) { e.printStackTrace(); } //Get_value_By_Col("Sheet4",
	 * "Chaithanya"); //readFromExcel_WO_Hardcoding();
	 * //createNewExcel("F:\\JAVA1\\selenium1\\Libraries\\New.xlsx","Rayapati"); }
	 */
	public static int Get_rownum_By_TestcaseID(XSSFSheet sheet, String TC_search) {
		int rowNumforTC = 0;
		try {
			int totalrows = sheet.getLastRowNum();
			for (int rowNum = 0; rowNum <= totalrows; rowNum++) {
				XSSFRow row = sheet.getRow(rowNum);
				if (row != null) {
					XSSFCell oCell = row.getCell(Get_value_By_Col(sheet, "FirstName"));
					String TCase_ID = oCell.getStringCellValue();
					if (TCase_ID.equalsIgnoreCase(TC_search)) {
						rowNumforTC = rowNum;
						break;
					}
				}
			}
			if (rowNumforTC == -1) {
				System.out.println("FAIL: Test Case ID :" + TC_search + " not present in any row");
			} else {
				System.out.println(
						"PASS: Test Case ID :" + TC_search + " present in the row number " + rowNumforTC + ".");
			}
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException");
		}
		return rowNumforTC;
	}

	public static int Get_value_By_Col(XSSFSheet sheet, String ColName) {
		int colNumTC = -1;
		XSSFRow row = sheet.getRow(0);
		int totalcols = row.getLastCellNum();
		for (int colNum = 0; colNum < totalcols; colNum++) {
			XSSFCell oCell = row.getCell(colNum);
			String Header = oCell.getStringCellValue(); // getting cell value
			if (Header.equalsIgnoreCase(ColName)) // comparing two values
			{
				colNumTC = colNum;
				break;
			}
		}
		if (colNumTC == -1) {
			System.out.println("Fail:Given name : " + ColName + " Not present in the columns");
		} else {
			System.out.println("PASS:Given name: " + ColName + " is present at position : " + colNumTC + " column");
		}
		return colNumTC;
	}

	public static void read_data() {
		try {
			XSSFWorkbook wbk = new XSSFWorkbook("Library\\Test_Data\\Friends.xlsx");
			XSSFSheet sheet = wbk.getSheet("Sheet4");
			String TC_ID = "TC_ID";
			String columnName = "FirstName";
			int rowNum = Get_rownum_By_TestcaseID(sheet, TC_ID);
			if (rowNum == 0) {
				System.out.println("Given test case id " + TC_ID + "is not found in the row");
			} else {
				XSSFRow row = sheet.getRow(rowNum);
				XSSFCell oCell = row.getCell(Get_value_By_Col(sheet, columnName));
				System.out.println(oCell);
			}
			wbk.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String GetDataFromCell(XSSFSheet Sheet, int rowNum, String columnName) {

		XSSFRow rw = Sheet.getRow(rowNum);
		if (rw != null) {
			XSSFCell oCell = rw.getCell(Get_value_By_Col(Sheet, columnName));
			CellType celltype = oCell.getCellTypeEnum();
			int usedrows = Sheet.getPhysicalNumberOfRows();
			System.out.println(usedrows);
			switch (celltype) {
			case STRING:
				cellval = oCell.getStringCellValue();
				System.out.println(cellval);
				break;
			case NUMERIC:
				cellval = String.valueOf((int) oCell.getNumericCellValue());
				System.out.println(cellval);
				break;
			case BOOLEAN:
				cellval = String.valueOf(oCell.getBooleanCellValue());
				System.out.println(cellval);
			default:
				break;
			}
		} else {
			System.out.println("given row doesn't exist");
		}
		System.out.println(cellval);
		return cellval;
	}

	//////////////////////////////////////////////////////////////////////////////////
	public static void createNewExcel(String xlFilePath, String SheetName) {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet1 = wb.getSheet("SheetName");
		XSSFRow row = sheet1.createRow(0);
		row.createCell(0).setCellValue("Cell-1");
		try {
			wb.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void creatrow() {
		try {
			XSSFWorkbook wbk = new XSSFWorkbook("F:\\JAVA1\\selenium1\\Libraries\\Test_Data\\Friends.xlsx");
			XSSFSheet sht = wbk.getSheet("Sheet4");
			XSSFRow row7 = sht.createRow(7);
			System.out.println(row7);
			// int usedrows=sht.getPhysicalNumberOfRows();
			// System.out.println(usedrows);
			wbk.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
