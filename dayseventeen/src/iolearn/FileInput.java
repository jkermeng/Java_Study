package iolearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInput {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/iolearn/read.txt");

		InputStream is = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(is);
		char[] cr = new char[1024];// 装载器1024容量
		int len = 0;
		// System.out.println(isr.read(cr));
		// System.out.println(cr);
		// if (isr.read(cr) != -1) {
		// System.out.println(cr);
		// System.out.println(new String(cr,0,80));

		// }
		// while ((len = (isr.read(cr))) != -1) {
		// System.out.print(new
		// String(cr,0,len));//由字符转换为字符串,限制它读取完整的数据len,布会出现断开数据
		// System.out.println(cr);// 一次性打印字符，会出现断开数据
		// }
		// char c = '阿';
		// System.out.println((byte)c);
		//
		// int len2 = 0;
		// 一个一个字符串输入
		// int read = is.read();
		// while (read != -1) {
		// System.out.print((char) read);
		// read = is.read();
		// }
		byte bt[] = new byte[1024];
		int read = 0;
		while ((read = (is.read(bt))) != -1) {
			// System.out.println(new String(bt,0,read));
			System.out.println(new String(bt));// 会出现数据去偏移
		}
		is.close();
		isr.close();

	}
}
