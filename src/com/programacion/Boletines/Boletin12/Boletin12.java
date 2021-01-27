package com.programacion.Boletines.Boletin12;

import javax.swing.*;

public class Boletin12 {
    public static void main(String[] args) {

        Garaje g = new Garaje();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de coches aparcados"));
        g.setNumeroCoche(num);
        if (num >= 0 && num < 5) {
            System.out.println("PLAZAS DISPONIBLES");
            g.setCoche(JOptionPane.showInputDialog("Introduce matricula"));
            g.setHoras(Float.parseFloat(JOptionPane.showInputDialog("Introduce tiempo de estancia")));
            g.precio2();
            g.recivido(Float.parseFloat(JOptionPane.showInputDialog("Introduce dinero")));
            g.factura();
        } else if (num == 5) {
            System.out.println("COMPLETO");

        }

    }

}
