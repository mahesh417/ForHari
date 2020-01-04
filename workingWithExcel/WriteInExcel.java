package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {
	public static void main(String[] args) {
		 m1();
		//m2();

	}

	public static void m1() {

		try {
			File f = new File("Test_Data/Excel.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook xs = new XSSFWorkbook(fis);
			XSSFSheet sh = xs.getSheetAt(0);

			sh.getRow(0).createCell(4).setCellValue("AMARAMAHESH");
			sh.getRow(1).createCell(2).setCellValue("BOSS IS BACK");
			sh.getRow(5).createCell(5).setCellValue("PK");
			sh.getRow(0).removeCell(sh.getRow(0).getCell(3));

			FileOutputStream fo = new FileOutputStream(f);
			xs.write(fo);
			xs.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void m2() {

		File f = new File("Test_Data/amk.xlsx");
		try {
			
			FileInputStream fis = new FileInputStream(f);

			
			XSSFWorkbook xs = new XSSFWorkbook(fis);
			XSSFSheet sh = xs.getSheetAt(0);

			sh.getRow(0).createCell(7).setCellValue("Conditiono");
			sh.getRow(1).createCell(7).setCellValue("Pass");

			FileOutputStream fo = new FileOutputStream(f);
			xs.write(fo);
			xs.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
