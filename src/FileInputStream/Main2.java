package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		int b;
		while((b = isr.read()) != -1){
			System.out.print((char)b);
		}
		
		isr.close();
	}

}
