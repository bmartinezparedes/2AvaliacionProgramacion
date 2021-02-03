package com.programacion.Boletines.Boletin13;

public class Felino extends Mamifero implements IPodeNadar {
    @Override
    public void nadar() {
        System.out.println("Puede nadar");
    }

    public void soyFelino() {
        System.out.println("Felino");
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
