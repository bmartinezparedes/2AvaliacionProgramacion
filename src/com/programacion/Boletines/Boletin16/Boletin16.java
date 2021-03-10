package com.programacion.Boletines.Boletin16;

import javax.swing.*;
import java.util.ArrayList;

public class Boletin16 {
    public static void main(String[] args) {
        ArrayList<Numeros> lista = new ArrayList<Numeros>();
        ArrayList<Altura> altura = new ArrayList<Altura>();
        String opcion;
        String texto = "www.javadesde0.com";
        String texto1 = texto.substring(0, 8);
        String texto2 = texto.substring(8, 18);
        System.out.println(texto1 + "\n" + texto2);
        texto = texto1.concat(texto2);
        System.out.println(texto);

        String mayus = "javeros";
        mayus = mayus.toUpperCase();
        System.out.println(mayus);
        mayus = mayus.toLowerCase();
        System.out.println(mayus);
        do {
            opcion = JOptionPane.showInputDialog("MENU\n1 Engadir Numero\n2 Amosar\n3 Pedir altura\n4 Amosar datos altura\n0 Sair");
            switch (opcion) {
                case "1":
                    Metodos.engadirElementoNum(lista);
                    break;
                case "2":
                    Metodos.amosarNum(lista);
                    break;
                case "3":
                    Metodos.añadirAltura(altura);
                    break;
                case "4":
                    Metodos.amosarAlt(altura);
                    break;
                case "0":
                    System.exit(0);
                    break;
            }
        } while (!opcion.equals("0"));


    }
}

