package iotest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 1바이트씩 출력하기 - 배열로 변경
public class WriteExample02 {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("c:/temp/test1.db");

		byte[] array = { 10, 20, 30, 40, 50, 60 };
		os.write(array);

		os.flush();// array[1] ~, 3개값
		os.close();
	}
}
