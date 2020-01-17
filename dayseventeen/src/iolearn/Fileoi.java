package iolearn;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Fileoi {
	public static void main(String[] args) throws IOException {
		// File f = new File(".");
		// f.mkdir();
		// File f1 = new File(f,"oi.txt");
		// f.createNewFile();
		// File f2 = new File("./java1");
		// f2.mkdir();
		// File f3 = new File("./java1/oi.obj");
		// f3.createNewFile();
		
		File f2 = new File("d:/javaObj/DVDEntity");
		String obj[] = { "DVD001.obj", "DVD002.obj" };
		if (f2.exists()) {
			System.out.println(f2.getAbsolutePath() + "已经存在");
		} else {
			f2.mkdirs();
			for (String string : obj) {
				File f1 = new File(f2, string);
				f1.createNewFile();
			}
		}
		// File f3 = new File("d:/");
		// File[] listFiles = f3.listFiles();
		// for (File file : listFiles) {
		// System.out.println(file.getAbsolutePath());
		// System.out.println((file.length()/1024)+"mb");
		// }
		// File f4 = new File(f3,"/ppt");
		// long length = f4.length();
		// System.out.println(((float)(length/1000))+"mb");
		File f5 = new File("f:/iolearn");
		File f55 = new File(f5, "/io.txt");
		if (!f5.isDirectory()) {
			f5.mkdir();
			if (!f55.isFile()) {
				f55.createNewFile();
				System.out.println(f55.isFile());
			}
		}
		FileOutputStream fs = new FileOutputStream("f:/iolearn/io.txt");
		String str = "我在用Fileio\n";
		fs.write(str.getBytes());
		fs.write(str.getBytes());
		System.out.println(f55.lastModified());
		fs.write(str.getBytes());
		fs.write(str.getBytes());
		System.out.println(f55.lastModified());
		fs.flush();

		OutputStreamWriter of = new OutputStreamWriter(fs);
		String ms = "我在用OutPutWriter\n";
		// for (int i = 0; i < 50000000; i++) {
		// of.write(ms);
		// }
		of.write(ms, 0, ms.length());
		System.out.println(of.append("\tasd"));
		of.flush();
		of.close();
		fs.close();
		File f6 = new File(f5, "/1.txt");
		f6.createNewFile();
		FileOutputStream fileOutputStream = new FileOutputStream(f6);
		fileOutputStream.write("asdasd".getBytes());
//		fileOutputStream.close();
		 BufferedOutputStream bf = new BufferedOutputStream(fileOutputStream);
		 bf.write("12312312".getBytes());
//		 fileOutputStream.close();
		 bf.close();

	}
}
