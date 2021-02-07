package com.programacion.Boletines.Boletin15;

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

    public void mostrarArrayInt(int[] lista) {

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Alumno " + (i + 1) + "---->" + lista[i]);
        }
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
}
