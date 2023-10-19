package iotest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 1바이트씩 출력하기
public class WriteExample {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("c:/temp/test1.db");

		byte a = 10;
		byte b = 20;
		byte c = 30;

		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}
}
