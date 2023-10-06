package com;

public class Calculator {

	int a;
	int b;

	public void somma(){
		int s = a + b;
		System.out.println("La somma e' " + s);
	}

	public void sottrazione(){
		int s = a - b;
		System.out.println("La differenza e' " + s);
	}

	public void moltiplicazione(){
		int s = a * b;
		System.out.println("Il prodotto e' " + s);
	}

	public void divisione(){
		int s = a / b;
		System.out.println("Il risultato della divisione e' " + s);
	}

	public static void main(String[] args){

		Calculator c = new Calculator();

		c.a = 10;
		c.b = 2;

		c.somma();
		c.sottrazione();
		c.moltiplicazione();
		c.divisione();
	}
}