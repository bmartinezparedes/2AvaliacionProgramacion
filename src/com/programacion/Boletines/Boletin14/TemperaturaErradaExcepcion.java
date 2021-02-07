package com.programacion.Boletines.Boletin14;

public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {
        super();
    }

    public TemperaturaErradaExcepcion(String mensaje) {
        super("Tes un erro " + mensaje);
    }
}
