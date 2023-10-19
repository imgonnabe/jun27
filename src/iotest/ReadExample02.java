package iotest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

// 배열로 읽어보기
public class ReadExample02 {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/temp/test1.db");

		byte[] buffer = new byte[100];
		while (true) {
			int readByteNum = is.read(buffer, 5, 6);
			System.out.println("readByteNum: " + readByteNum);
			System.out.println(Arrays.toString(buffer));
			if (readByteNum == -1) {
				break;
			}
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i + 5]);
			}
		}
		is.close();
	}
}
