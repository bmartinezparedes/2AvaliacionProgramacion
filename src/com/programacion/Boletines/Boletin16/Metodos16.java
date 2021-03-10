package com.programacion.Boletines.Boletin16;

import javax.swing.*;
import java.util.ArrayList;

public class Metodos16 {
    public static void engadirElementoNum(ArrayList<Numeros> listaNum) {
        Numeros ele = pedirNum("Alumno a engadir:");
        listaNum.add(ele);
    }

    public static Numeros pedirNum(String menxase) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        Numeros num = new Numeros(numero);
        return num;
    }

    public static void amosarNum(ArrayList<Numeros> listaNum) {
        int auxPares = 0, auxNega = 0;
        for (Numeros al : listaNum) {
            if (al.getNumero() % 2 == 0) {
                auxPares++;
            }
            if (al.getNumero() < 0) {
                auxNega++;
            }
        }
        System.out.println("Numeros pares=" + auxPares + "\nNumeros negativos=" + auxNega);
    }

    public static void añadirAltura(ArrayList<Altura> listaAlt) {
        int nAltura;
        do {
            nAltura = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de participantes positivo"));
        } while (nAltura <= 0);
        for (int i = 0; i < nAltura; i++) {
            Altura altura = new Altura(Float.parseFloat(JOptionPane.showInputDialog("Introduce altura")));
            listaAlt.add(altura);
        }
    }

    public static void amosarAlt(ArrayList<Altura> listaAlt) {
        float altMedia = 0;
        int altSuperior = 0, altInferior = 0, altIgual = 0, i = 0;
        for (Altura al : listaAlt) {
            altMedia = altMedia + al.getAltura();
            i++;
        }
        altMedia = altMedia / i;
        System.out.println("La altura media es de " + altMedia + " metros.");
        for (Altura al : listaAlt) {
            if (altMedia > al.getAltura()) {
                altInferior++;
            } else if (altMedia < al.getAltura()) {
                altSuperior++;
            } else {
                altIgual++;
            }
        }
        System.out.println(altInferior + " participantes son inferiores a la media " + altSuperior + " participantes son superiores a la media y " + altIgual + " participantes son iguales a la media");
    }
}
