package com.programacion.Boletines.Boletin14;

import javax.swing.*;

public class Boletin14 {
    public static void main(String[] args) {
        ConversorTemperaturas converT = new ConversorTemperaturas();

        try {
            converT.centigradosAFharenheit(Float.parseFloat(JOptionPane.showInputDialog("Introduce temperatura en ºC")));
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
}
