package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UDataForm {
	public static String StrToDate(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);

	}
	private UDataForm() {
	}
}
