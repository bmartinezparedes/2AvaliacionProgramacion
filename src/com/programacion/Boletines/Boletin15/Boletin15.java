package com.programacion.Boletines.Boletin15;

public class Boletin15 {

    public static void main(String[] args) {
        MetodosB15 m = new MetodosB15();

        //APARTADO 1
        /*
        double []numeros={m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),};

        m.mostrarArrayDouble(numeros);
        m.mostrarArrayReves(numeros);
        m.mostrarArrayDouble(numeros);
        */
        //APARTADO 2

        int[] notas = {m.numerosAleatoriosInt(), m.numerosAleatoriosInt(), m.numerosAleatoriosInt(), m.numerosAleatoriosInt(), m.numerosAleatoriosInt()};
        m.mostrarArrayInt(notas);
        m.mostrarNotas(notas);
        m.calcularMedia(notas);
        m.notaMayor(notas);
    }
}
