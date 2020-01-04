package workingWithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Number_To_Text_Converter {

	
	public static void main(String[] args) {
		readDataFromExcel();
	}
	public static void readDataFromExcel() {

		try {
			FileInputStream fis=new FileInputStream("Test_Data/InputData.xlsx");
			XSSFWorkbook xs=new XSSFWorkbook(fis);
			XSSFSheet sh=xs.getSheet("Row_multiple_Cells");
			/*XSSFRow ro=sh.getRow(3);
			XSSFCell col=ro.getCell(1);
			String val=col.getStringCellValue();
			System.out.println(val);
*/			
			double d=sh.getRow(3).getCell(1).getNumericCellValue();
			String mnum=NumberToTextConverter.toText(d);
			System.out.println(mnum);
			xs.close();
		} catch (IOException e) {
			}
		
		
		
	}

}
