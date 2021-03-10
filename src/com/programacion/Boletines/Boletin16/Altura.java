package com.programacion.Boletines.Boletin16;

public class Altura {
    private float altura;

    public Altura() {
    }

    public Altura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "altura=" + altura;
    }
}
