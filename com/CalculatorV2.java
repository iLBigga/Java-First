package com;

public class CalculatorV2 {
	
	private int a;
	private int b;


	public CalculatorV2(int a, int b){
		super();
		this.a = a;
		this.b = b;
	}

	public int somma(){
		int s = a + b;
		System.out.println("La somma e' " + s);
		return s;
	}

	public int sottrazione(){
		int s = a - b;
		System.out.println("La differenza e' " + s);
		return s;
	}

	public int moltiplicazione(){
		int s = a * b;
		System.out.println("Il prodotto e' " + s);
		return s;
	}

	public int divisione(){
		int s = a / b;
		System.out.println("Il risultato della divisione e' " + s);
		return s;
	}

	public static void main(String[] args){

		CalculatorV2 c = new CalculatorV2(10,2);

		c.somma();
		c.sottrazione();
		c.moltiplicazione();
		c.divisione();

	}
}
