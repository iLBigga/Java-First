package com;

import java.util.Scanner;

public class Rettangolo {

	int base;
	int altezza;

	public void calcolaArea(){

		int area = base * altezza;
		System.out.println("l'area e di: " + area);
	}

	public void calcolaPerimetro(){

		int perimetro = (base * 2) + (altezza * 2);
		System.out.println("Il perimentro e' di: " + perimetro);
	}


	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.println("Inserisci base");
		int a = s.nextInt();

		System.out.println("Inserisci altezza");
		int b = s.nextInt();

		Rettangolo r = new Rettangolo();

		r.base 		= a;
		r.altezza 	= b;

		r.calcolaArea();
		r.calcolaPerimetro();
	}
	
}
