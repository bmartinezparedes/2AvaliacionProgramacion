package com.programacion.Boletines.Boletin14;

public class ConversorTemperaturas {
    static final int MINIMO = 80;


    public void centigradosAFharenheit(float temperatura) throws TemperaturaErradaExcepcion {
        if (temperatura < MINIMO) {
            throw new TemperaturaErradaExcepcion("La temperatura debe de ser como minimo 80ºC");
        } else {
            System.out.println(temperatura + "ºC son " + (9.0 / 5.0 * temperatura + 32.4) + "ºF");
        }
    }

    public void centígradosAReamur(float temperatura) throws TemperaturaErradaExcepcion {
        if (temperatura < MINIMO) {
            throw new TemperaturaErradaExcepcion("La temperatura debe de ser como minimo 80ºC");
        } else {
            double reamur = 4.0 / 5.0 * temperatura;
        }
    }
}
