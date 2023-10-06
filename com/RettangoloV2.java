package com;

import java.util.Scanner;

public class RettangoloV2 {

	private int base;
	private int altezza;

	public RettangoloV2(int base, int altezza){
		this.base 		= base;
		this.altezza 	= altezza;
	}

	public void setBase(int base){
		this.base = base;
	}

	public void setAltezza(int altezza){
		this.altezza = altezza;
	}

	public int calcolaArea(){

		int area = base * altezza;
		// System.out.println("l'area e di: " + area);
		return area;
	}

	public int calcolaPerimetro(){

		int perimetro = (base * 2) + (altezza * 2);
		// System.out.println("Il perimentro e' di: " + perimetro);
		return perimetro;
	}


	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.println("Inserisci base");
		int a = s.nextInt();

		System.out.println("Inserisci altezza");
		int b = s.nextInt();

		RettangoloV2 r = new RettangoloV2(a, b);

		r.setAltezza(10);
		r.setBase(90);

		int area 		= r.calcolaArea();
		int perimentro 	= r.calcolaPerimetro();

		System.out.println("L'area e' di: " + area + " ed il perimetro e' di: " + perimentro);
	}
	
}
