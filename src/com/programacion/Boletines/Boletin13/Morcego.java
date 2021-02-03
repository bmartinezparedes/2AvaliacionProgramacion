package com.programacion.Boletines.Boletin13;

public class Morcego extends Mamifero implements IPodeVoar {
    @Override
    public void voar() {
        System.out.println("Podo voar");
    }

    @Override
    public void mamifero() {
        super.mamifero();
    }

    @Override
    public void caminar() {
        super.caminar();
    }
}
