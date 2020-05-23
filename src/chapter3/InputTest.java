package chapter3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) throws IOException {
		int c;
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\javaTestFiles\\test.txt")));
		while ((c = in.read()) >= 0) {
			System.out.print((char) c);
		}
		in.close();
	}

}
