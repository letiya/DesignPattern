package chapter3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Extends FilterInputStream, the abstract decorator for all InputStreams.
public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	// we need to implement two	read methods. convert each byte (that represents a character) to lowercase if it’s an uppercase character.
	public int read() throws IOException {
		int c = super.read();
		return c == -1 ? c : Character.toLowerCase((char) c);
	}
	
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i < off + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}
}
