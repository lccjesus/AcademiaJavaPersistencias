package qintess.academiajava.aplicacao.datas;

import java.util.Calendar;

public class AppDatas03 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		calendar.set(Calendar.YEAR, 2023);
		
	}

}
