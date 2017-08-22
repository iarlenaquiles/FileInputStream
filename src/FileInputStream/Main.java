package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		int b = is.read();
		System.out.println(is);
		System.out.println(b);
	}

}
