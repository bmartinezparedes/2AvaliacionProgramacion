package com.programacion.Boletines.Boletin13;

public class Papagaio extends Ave implements IPodeVoar {

    @Override
    public void voar() {
        System.out.println("Pode voar");
    }

    @Override
    public void caminar() {
        super.caminar();
    }
}
