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
		char[] cr = new char[1024];// װ����1024����
		int len = 0;
		// System.out.println(isr.read(cr));
		// System.out.println(cr);
		// if (isr.read(cr) != -1) {
		// System.out.println(cr);
		// System.out.println(new String(cr,0,80));

		// }
		// while ((len = (isr.read(cr))) != -1) {
		// System.out.print(new
		// String(cr,0,len));//���ַ�ת��Ϊ�ַ���,��������ȡ����������len,������ֶϿ�����
		// System.out.println(cr);// һ���Դ�ӡ�ַ�������ֶϿ�����
		// }
		// char c = '��';
		// System.out.println((byte)c);
		//
		// int len2 = 0;
		// һ��һ���ַ�������
		// int read = is.read();
		// while (read != -1) {
		// System.out.print((char) read);
		// read = is.read();
		// }
		byte bt[] = new byte[1024];
		int read = 0;
		while ((read = (is.read(bt))) != -1) {
			// System.out.println(new String(bt,0,read));
			System.out.println(new String(bt));// ���������ȥƫ��
		}
		is.close();
		isr.close();

	}
}
