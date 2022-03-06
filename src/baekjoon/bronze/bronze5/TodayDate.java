package baekjoon.bronze.bronze5;

import java.text.SimpleDateFormat;
//오늘 날짜
//import java.util.Calendar;
import java.util.Date;
public class TodayDate {

	public static void main(String[] args) {
		//Date는 대부분 Deprecate되어, Calendar클래스를 이용한다고 한다.
		//Date date = new Date();
		//System.out.printf("%d-%02d-%02d",1900+date.getYear(),date.getMonth()+1,date.getDate());
		//Calendar date = Calendar.getInstance();
		//System.out.printf("%d-%02d-%02d", date.get(Calendar.YEAR), date.get(Calendar.MONTH)+1, date.get(Calendar.DATE));
	
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
		Date date = new Date();
		System.out.println(format.format(date));
	}

}
