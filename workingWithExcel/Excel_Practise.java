package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Practise {
	public static void main(String[] args) {
		// ReadPrintDataFromExcel() ;
		// GetDataIntoArray("F:\\JAVA1\\ClassWork\\config\\env\\ExcelSheet.xlsx");
		LoadDataIntoHashmap();

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

	public static void LoadDataIntoHashmap() {
		HashMap<String, String> allData = new HashMap<>();
		try {
			FileInputStream fis = new FileInputStream("F:\\JAVA1\\ClassWork\\config\\env\\ExcelSheet.xlsx");
			Properties props = new Properties();
			props.load(fis);
			Set<Object> allkeys = props.keySet();
			for (Object key : allkeys) {
				String value = props.getProperty(key.toString());
				System.out.println("value");
				allData.put(key.toString(), value);
				System.out.println(allData);
			}
			fis.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

}
