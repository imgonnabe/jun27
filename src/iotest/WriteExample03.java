package iotest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample03 {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("c:/temp/write.txt");
		
		writer.write("안녕하세요.\t");
		writer.write("?????");
		writer.write("String도 됩니다.");
		writer.write("엔터표시\n");
		writer.write("엔터는?");
		
		writer.flush();
		writer.close();
	}
}
