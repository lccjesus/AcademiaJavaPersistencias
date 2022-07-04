package qintess.academiajava.aplicacao.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AppDatas01 {
	public static void main(String[] args) {
		
		Date data = new Date();
		System.out.println(data);
		
		//Formatar data e hora.
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(df.format(data));
		
		df = new SimpleDateFormat("dd/mm/yyyy - HH:mm:ss");
		System.out.println(df.format(data));
		
		df = new SimpleDateFormat("EEEE", new Locale("jp", "JP"));
		System.out.println(df.format(data));
		
		
		
	}

}
