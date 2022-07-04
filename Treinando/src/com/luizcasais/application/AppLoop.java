package com.luizcasais.application;

import java.util.Random;

public class AppLoop {
	public static void main(String[] args) {
		Random rd = new Random();

		/*
		 * int i = 0; while(i < 1) {
		 * 
		 * // int num = rd.nextInt(60 * 9999); System.out.println(num); i++;
		 * }
		 */
		
		for (int i = 0; i < 6; i++) {
			int num = rd.nextInt(100);
			System.out.println(num);
		}
		
	}

}
