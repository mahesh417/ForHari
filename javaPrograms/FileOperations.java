package javaPrograms;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class FileOperations {

	public static void main(String[] args) {
		// createFile();
		// creatingDitectory();
		// getPath();
		// fileExist();
		// fileRead();
		// fileWriter();
		   printStream();
	}

	// =======================================================================================================================================================
	public static void createFile() {
		File f = new File("F:\\Study\\Manual Testing\\Bgl Institute\\Selenium_Java\\File\\File\\xyz.text");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// ============================================================================================================================================================
	public static void creatingDitectory() {
		File dir = new File("FILE");
		dir.mkdir();

	}

	// ========================================================================================================================================================
	public static void getPath() {
		File f = new File("xyz.text");
		// File f=new File("NonStaticAndStatic.java");
		System.out.println("RelativePath is:" + f.getPath());
		System.out.println("AbsolutePath is :" + f.getAbsolutePath());
	}

	// ===============================================================================================================================================================
	public static void fileExist() {

		File f = new File("xyz.txt");
		File folder = new File("File");
		if (f.exists()) {
			System.out.println("File Avilable in:" + f.getAbsolutePath());
		} else {
			System.out.println("file doesn't exist:" + f.getAbsolutePath());
		}
		if (folder.exists()) {
			System.out.println("Folder avilable in:" + folder.getAbsolutePath());
		} else {
			System.out.println("Folder not avialbel in:" + folder.getPath());
		}
	}

	// =================================================================================================================================================================
	public static void fileRead() {

		File f = new File("xyz.txt");
		try {
			FileReader fir = new FileReader(f);
			long len = f.length();
			for (int i = 0; i <= len; i++) {
				System.out.print((char) fir.read());
			}
			fir.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		}

	}

	// ===================================================================================================================================================================
	public static void fileWriter() {
		File f = new File("F:\\Study\\Manual Testing\\Bgl Institute\\Selenium_Java\\File\\amk.txt");
		try {

			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			fw.write("Boss Is Back");
			fw.append("kjhjhj");
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	// ==========================================================================================================================================================================

	public static void printStream() {

		PrintStream p;
		try {
			p = new PrintStream(new FileOutputStream("amk.txt"));
			p.println("hi");
			p.println("hfghfh");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	//=============================================================================================================================================================================
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
