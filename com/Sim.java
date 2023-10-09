package com;

public class Sim {
    private String numero;
    private double importo;
    private Telefonata[] ultimeTelefonateFatte;
    private Telefonata[] ultimeTelefonateRicevute;
    private int numFatte;
    private int numRicevute;

    public Sim(String numero, double importo) {
        this.numero = numero;
        this.importo = importo;
        this.ultimeTelefonateFatte = new Telefonata[10];
        this.ultimeTelefonateRicevute = new Telefonata[10];
        this.numFatte = 0;
        this.numRicevute = 0;
    }

    public void aggiungiTelefonataFatta(Telefonata telefonata) {
        if (numFatte < 10) {
            ultimeTelefonateFatte[numFatte] = telefonata;
            numFatte++;
        } else {
            for (int i = 0; i < 9; i++) {
                ultimeTelefonateFatte[i] = ultimeTelefonateFatte[i + 1];
            }
            ultimeTelefonateFatte[9] = telefonata;
        }
    }

    public void aggiungiTelefonataRicevuta(Telefonata telefonata) {
        if (numRicevute < 10) {
            ultimeTelefonateRicevute[numRicevute] = telefonata;
            numRicevute++;
        } else {
            for (int i = 0; i < 9; i++) {
                ultimeTelefonateRicevute[i] = ultimeTelefonateRicevute[i + 1];
            }
            ultimeTelefonateRicevute[9] = telefonata;
        }
    }

    public double costoTotaleChiamate() {
        double costoTotale = 0;
        for (int i = 0; i < numFatte; i++) {
            costoTotale += ultimeTelefonateFatte[i].getCosto();
        }
        for (int i = 0; i < numRicevute; i++) {
            costoTotale += ultimeTelefonateRicevute[i].getCosto();
        }
        return costoTotale;
    }

    public int durataTotaleChiamate() {
        int durataTotale = 0;
        for (int i = 0; i < numFatte; i++) {
            durataTotale += ultimeTelefonateFatte[i].getDurata();
        }
        for (int i = 0; i < numRicevute; i++) {
            durataTotale += ultimeTelefonateRicevute[i].getDurata();
        }
        return durataTotale;
    }
}