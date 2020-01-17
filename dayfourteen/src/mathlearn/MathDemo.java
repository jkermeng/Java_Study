package mathlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import stringbufferlearn.DateUtil;

public class MathDemo {
	public static void main(String[] args) throws ParseException {
		char c[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' };
		String str = "";
		Random r = new Random();

		SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-dd");
		//
		// for (int i = 0; i < 10; i++) {
		// System.out.println(Math.round(Math.random() * 35 + 1));
		// System.out.println(Math.floor(3.999));
		// Math.sqrt(2);
		// Math.round(5.5);// 5.5+0.5 =5 ÌØÊâÖµx.5
//		Date date = new Date();
		// String format = sf.format(date);
		// System.out.println(format);
		//
		// int nextInt = r.nextInt(c.length);
		// str = str + c[nextInt];
		//
		// }
		Date date = new Date();
		long time = date.getTime();
		String format = sf.format(time);
		String format2 = sf.format(0L);
	
		System.out.println(time);
		System.out.println(format2);
//		System.out.println(date);
		String mm = "1950-02-1";
		Date parse = sf.parse(mm);
		String format3 = sf.format(parse);
		System.out.println(format3);
		System.out.println("======================");
		String dateToStr = DateUtil.dateToStr(new Date(), "yyyy-MM-dd HH:mm:ss");
		System.out.println(dateToStr);
		String d = "1900-1-25";
		Date strToDate = DateUtil.strToDate(d,"yyyy-MM-dd");
		System.out.println(strToDate);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");

		Calendar cl = Calendar.getInstance();
		StringBuffer sb  = new  StringBuffer(30);
		sb.append(cl.get(Calendar.YEAR)+"-");
		sb.append(cl.get(Calendar.MONTH)+1+"-");
		sb.append(cl.get(Calendar.DATE)+" ");
		sb.append(cl.get(Calendar.HOUR)+":");
		sb.append(cl.get(Calendar.MINUTE)+":");
		sb.append(cl.get(Calendar.SECOND)+" ");
		System.out.println(sb);
		
		
		
		
		
		
	}
}
