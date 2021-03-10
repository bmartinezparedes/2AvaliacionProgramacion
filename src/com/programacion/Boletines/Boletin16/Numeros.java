package com.programacion.Boletines.Boletin16;

public class Numeros {
    private int numero;

    public Numeros() {
    }

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero=" + numero;
    }
}
