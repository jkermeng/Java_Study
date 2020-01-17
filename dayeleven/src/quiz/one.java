package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class one {

	public static void main(String[] args) {
		Rect r = new PlainRect(10, 20, 10, 10);
		System.out.println(r.getPerimeter());
		PlainRect plainRect = new PlainRect(10, 20, 10, 10);
		System.out.println(plainRect.isInside(25.5, 13));
			
		 
		/*try {
			SimpleDateFormat s1 = new SimpleDateFormat("YY-MM-DD");
			s1.parse("123");
			FileInputStream f=new FileInputStream("t.txt");
		} catch (FileNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		}
}
