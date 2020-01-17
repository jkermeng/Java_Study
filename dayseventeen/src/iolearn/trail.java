package iolearn;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class trail {
	public static void main(String[] args) throws IOException {
		String a = "abc";
		byte[] bytes = a.getBytes();
		for (byte b : bytes) {
			System.out.println(b);
		}
		char c = 'C';
		System.out.println("mmmmm" + (byte) c);
		byte str[] = new byte[3];
		str[0] = 97;
		str[1] = 98;
		str[2] = 99;
		String bv = new String(str);
		System.out.println(bv);

		File file = new File("D:\\java教学任务.png");
		if (file.isFile()) {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("F:\\java.jpg")));
			byte b[] = new byte[1024];
			int len = 0;
			while ((len = (bis.read(b))) != -1) {
				bos.write(b);
			}
			bos.close();
			bis.close();
		}

	}
}
