package com;

public class Potenza {
	
	private int base;

	public Potenza(int n){
		this.base = n;
	}

	public int pow(){
		return base * base;
	}

	public void cambiobase(int n){
		this.base = n;
	}

	public static void main(String[] args){

		Potenza c = new Potenza(5);

		int a = c.pow(); 
		c.cambiobase(10);

		System.out.println(a);
	}
}
