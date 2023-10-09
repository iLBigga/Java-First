package com;

public class Telefonata {
	
    private String numero;
    private int durata;
    private double costo;

    public Telefonata(String numero, int durata, double costo) {
        this.numero = numero;
        this.durata = durata;
        this.costo = costo;
    }

    public int getDurata() {
        return durata;
    }

    public double getCosto() {
        return costo;
    }
}