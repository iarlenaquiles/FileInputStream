package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		int b;
		while((b = is.read()) != -1){
			System.out.print((char)b);
		}
		
		is.close();
	}

}
