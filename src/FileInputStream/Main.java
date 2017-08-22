package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		char b = (char) is.read();
		System.out.println(b);
		b = (char) is.read();
		System.out.println(b);
	}

}
