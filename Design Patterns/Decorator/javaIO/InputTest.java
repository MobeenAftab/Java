package javaIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;;

public class InputTest {

	public static void main(String[] args) throws IOException {
		
		int c;
		
		// Set up and decorate FileInputStream with BufferedInputStream and LowerCaseInputStream
		try {
			InputStream in = 
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("D:\\Java\\Design Patterns\\Decorator\\javaIO\\test.txt")));
			
			// Stream reads characters until EOF
			while((c = in.read()) >= 0 ) {
				System.out.print((char)c);
			}
			
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
