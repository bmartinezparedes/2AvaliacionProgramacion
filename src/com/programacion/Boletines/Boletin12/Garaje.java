package com.programacion.Boletines.Boletin12;

import javax.swing.*;

public class Garaje {
    private int numeroCoche;
    private float horas, recibido;
    private String coche;

    public Garaje() {
    }

    public int getNumeroCoche() {
        return numeroCoche;
    }

    public void setNumeroCoche(int numeroCoche) {
        this.numeroCoche = numeroCoche;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }


    public void factura() {
        System.out.println("FACTURA: \nMATRICULA COCHE " + coche + "\nTEMPO " +
                horas + "H\nPrecio " + this.precio() + "€\nCARTOS RECIBIDOS " + recibido +
                "€\nCARTOS DEVOLTOS " + this.devolto() +
                "€\nGRACIAS POR USAR O NOSO APARCAMENTO");
    }

    private float precio() {
        float p3 = 1.5f;
        float p = 1.5f + (horas - 3) * 0.2f;
        if (horas <= 3) {
            return p3;
        } else {
            return p;
        }
    }

    public void precio2() {

        JOptionPane.showMessageDialog(null, "Precio de instacia " + this.precio() + "€");
    }

    public void recivido(float reci) {
        recibido = reci;
    }

    private float devolto() {
        float dev = recibido - this.precio();
        return dev;
    }
}
