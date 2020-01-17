package FileUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class FileUtil {
	public static void main(String[] args) throws IOException {
		FileUtil.CopyFile("D:\\java教学任务.png", "F:\\");
		// String a = "a.b.c";
		// int lastIndexOf = a.lastIndexOf(".");
		// String substring = a.substring(lastIndexOf);
		// System.out.println(substring);
	}

	private FileUtil() {
	}

	/**
	 * 
	 * @param OoriginUrl
	 *            D:\yy\yy.doc
	 * @param toNewUrl
	 *            F：\
	 * @throws IOException
	 */
	public static void CopyFile(String OoriginUrl, String toNewUrl) throws IOException {
		File file = new File(OoriginUrl);
		File fileto = new File(toNewUrl);
		String OriginName = file.getName();// java.jpg
		String EndName = OriginName.substring(OriginName.lastIndexOf("."));// .jpg
		String BeginName = OriginName.substring(0, OriginName.lastIndexOf("."));// java
		int i = 1;
		int k = 1;
		String[] list = fileto.list();
		String NewName = OriginName;
		String filename = null;
		BufferedInputStream fs = new BufferedInputStream(new FileInputStream(file));// 读java.jpg

		// int g = 0;
		for (int j = 0; j < list.length; j++) {
			// g++;//4次
			filename = list[list.length - k];// 0(1) list.lenghth(2)
			k++;
			if (filename.equals(NewName)) {
				NewName = BeginName + "(" + i + ")" + EndName;// 0
				i++;
				// break;
			}
			for (String string : list) {
				if (string.equals(NewName)) {
					NewName = BeginName + "(" + i + ")" + EndName;// (1)
					i++;
					break;
				}
			}

		}
		BufferedOutputStream ofs = new BufferedOutputStream(new FileOutputStream(new File(fileto, NewName)));// 写入新文件
		byte bt[] = new byte[1024];
		while (fs.read(bt) != -1) {
			ofs.write(bt);
		}
		fs.close();
		ofs.close();

	}
}
