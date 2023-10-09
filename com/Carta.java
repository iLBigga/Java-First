package com;

public class Carta {
	
	private String valore;
	private String seme;

	public Carta(String valore, String seme){
		this.valore = valore;
		this.seme 	= seme;
	}

	public void confronto(String valore, String seme){

		if(this.valore == valore && this.seme == seme){
			System.out.println("La carta combacia");
		} else {
			System.out.println("La carta non combacia");
		}
	}

	public static void main(String[] args){

		Carta c = new Carta("10","picche");

		c.confronto("9","picche");
	}
}
