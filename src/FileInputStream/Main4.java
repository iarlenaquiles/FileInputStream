package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner sc = new Scanner(is);
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}

}
