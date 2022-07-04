package qintess.academiajava.aplicacao.datas;

import java.util.Calendar;

public class AppDatas04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int hora = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora + " horas.");
		
		String status;
		
		if(hora< 12) {
			status = "Parte da manhã";
		}
		else if(hora > 18) {
			status = "Parte da Noite";
		}
		else {
			status = "Parte da Tarde";
		}
		
		System.out.println(status);
		
		
	}

}
