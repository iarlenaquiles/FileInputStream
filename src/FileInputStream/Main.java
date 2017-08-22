package FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		OutputStream os = new FileOutputStream("arquivo2.txt");
		int b;
		while((b = is.read()) != -1){
			os.write(b);
			System.out.print((char)b);
		}
		
		is.close();
	}

}
