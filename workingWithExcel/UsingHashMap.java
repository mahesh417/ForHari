package workingWithExcel;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UsingHashMap {

	public static void main(String[] args) {
		
		m1();
	}
	public static void m1() {

		HashMap<String, String> allvalues = new HashMap<>();
		String cellval="";

		try {
			XSSFWorkbook wb = new XSSFWorkbook("Test_Data/Worksheet.xlsx");
			XSSFSheet sh = wb.getSheetAt(0);

			int totalrow = sh.getLastRowNum();
			// System.out.println("totalrow is:" + totalrow);
			for (int i = 0; i <= totalrow; i++) {

				XSSFRow r = sh.getRow(i);
				int totalcol = r.getLastCellNum();
				for (int j = 0; j < totalcol; j++) {
					XSSFCell colHead=sh.getRow(0).getCell(j);
					if(colHead!=null) {
						String colh=colHead.getStringCellValue();
						XSSFCell c = r.getCell(j);
						
						CellType ct = c.getCellTypeEnum();
						switch (ct) {
						case NUMERIC:
							cellval = String.valueOf((int) (c.getNumericCellValue()));
							break;
						case BOOLEAN:
							cellval = String.valueOf(c.getBooleanCellValue());
							break;
						case STRING:
							cellval = c.getStringCellValue();
							break;
						default:
							break;
						}
						allvalues.put(colh, cellval);

					//System.out.print(cellval + " ");
					if(sh.getRow(i).equals("third")){
						System.out.println(allvalues.get("Fname"));
						
					}
					
					}
				}
				System.out.println(" ");
			}
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(allvalues.get("Lname")+" Chaithu");
		
	}
}