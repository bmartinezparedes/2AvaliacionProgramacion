package com.programacion.Boletines.Boletin15;

import javax.swing.*;

public class MetodosB15 {
    //PARA APARTADO 1
    public double numerosAleatoriosDouble() {
        double num = Math.random() * 49 + 1;
        return num;
    }

    public void mostrarArrayDouble(double[] lista) {

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Numero " + (i + 1) + "---->" + lista[i]);
        }
    }

    public void mostrarArrayReves(double[] lista) {
        double aux;
        for (int i = 0; i < lista.length / 2; i++) {
            aux = lista[i];
            lista[i] = lista[lista.length - 1 - i];
            lista[lista.length - 1 - i] = aux;
        }
    }

    //PARA APARTADO 2
    public int numerosAleatoriosInt() {
        int num = (int) Math.floor(Math.random() * 10);
        return num;
    }

    public void mostrarNotas(int[] lista) {
        int suspenso = 0, aprovado = 0, sinNota = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] >= 0 && lista[i] < 5) {
                suspenso++;
            } else if (lista[i] >= 5 && lista[i] <= 10) {
                aprovado++;
            } else
                sinNota++;
        }
        System.out.println("Alumnos:\nAprovados= " + aprovado + "\nSuspensos= " + suspenso + "\nSin nota= " + sinNota);
    }

    public void calcularMedia(int[] lista) {
        float notaMedia, aux = 0;
        for (int i = 0; i < lista.length; i++) {
            aux = aux + lista[i];

        }
        notaMedia = aux / 5;
        System.out.println("Nota media= " + notaMedia);
    }

    public void notaMayor(int[] lista) {
        int notaMayor = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > notaMayor) {
                notaMayor = lista[i];
            }
        }
        System.out.println(notaMayor);
    }

    //Apartado 3
    public String pedirNombres() {
        String nombre = JOptionPane.showInputDialog("Introduce nombre alumno");
        return nombre;
    }

    public void verNotaAlumno(int[] notas, String[] nombres) {
        String nombreBusqueda = pedirNombres();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                if (i == j) {
                    if (nombres[j].equals(nombreBusqueda))
                        System.out.println("Nombre: " + nombres[j] + " Nota: " + notas[i]);
                }
            }
        }
    }

    public String[] crearMatriz(String[] nombres) {

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = pedirNombres();
        }
        return nombres;
    }

    public void verAlumnosAprovados(int[] notas, String[] nombres) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println("Nombre: " + nombres[i] + " Nota: " + notas[i]);
            }
        }

    }

    public void ordenarNotasDeMenosAmas(int[] notas, String[] nombres) {
        int auxNotas;
        String auxNombres;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    auxNotas = notas[i];
                    notas[i] = notas[j];
                    notas[j] = auxNotas;
                    auxNombres = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxNombres;
                }
            }
        }
    }

    public void amosarNotasYnombres(int[] notas, String[] nombres) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nombre: " + nombres[i] + " Nota: " + notas[i]);
        }
    }
    //Ejercicio 4

    public int calcularRestoDNI() {
        String dni;
        int letraDNI = 0;
        do {
            dni = JOptionPane.showInputDialog("Introduce tu NIF");
            if (dni.length() == 8) {
                letraDNI = Integer.parseInt(dni) % 23;
            } else
                System.out.println("NIF incorrecto");
        } while (dni.length() != 8);
        return letraDNI;
    }
}
