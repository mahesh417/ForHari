package bufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferPgm {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First value");
		String str=br.readLine();
		String str2;
		while((str2=str)!=null) {
			System.out.println(str2);
		}
		
		
		
	}

}
