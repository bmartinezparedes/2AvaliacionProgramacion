package com.programacion.Boletines.Boletin18;

import javax.swing.*;
import java.util.ArrayList;

public class AplicacionB18 {
    public static void main(String[] args) {

        ArrayList<Correo> correo = new ArrayList<Correo>();
        Buzon b = new Buzon();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu"
                    + "\n1 Recibir Correo"
                    + "\n2 Cuantos correos hay en el buzon"
                    + "\n3 Quedan correos por ler?"
                    + "\n4 Mostrar primer correo non lido"
                    + "\n5 Mostrar correo especifico"
                    + "\n6 Eliminar correo especifico"
                    + "\n0 Salir"));
            switch (opcion) {
                case 1:
                    b.engade(correo);
                    break;
                case 2:
                    System.out.println("Hay " + b.numeroDeCorreos(correo) + " correos");
                    break;
                case 3:
                    System.out.println(b.porLer(correo));
                    break;
                case 4:
                    System.out.println(b.amosaPrimerNoLeido(correo));
                    break;
                case 5:
                    System.out.println(b.amosa(Integer.parseInt(JOptionPane.showInputDialog("Numero correo a ler")), correo));
                    break;
                case 6:
                    b.elimina(Integer.parseInt(JOptionPane.showInputDialog("Numero correo a ler")), correo);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (opcion != 0);
    }
}
