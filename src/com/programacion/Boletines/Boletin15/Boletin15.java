package com.programacion.Boletines.Boletin15;

public class Boletin15 {

    public static void main(String[] args) {
        Metodos m = new Metodos();

        //APARTADO 1
        /*
        double []numeros={m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),};

        m.mostrarArrayDouble(numeros);
        m.mostrarArrayReves(numeros);
        m.mostrarArrayDouble(numeros);
        */
        //APARTADO 2 y 3
        /*String []nombreAlumnos=new String [Integer.parseInt(JOptionPane.showInputDialog("Numero de alumnos"))];
        int []notas={m.numerosAleatoriosInt(),m.numerosAleatoriosInt(),m.numerosAleatoriosInt(),m.numerosAleatoriosInt(),m.numerosAleatoriosInt()};
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Menu:\n0 para salir\n1 Crear lista alumnos\n2 Visualizar Nº Suspensos y Aprovados"
                    + "\n3 Mostrar nota media de la clase\n4 Mostrar la mayor nota\n5 Mostar nota de un alumno determinado\n6 Mostrar lista de alumnos aprovados"));
            switch(opcion){
                case 0:System.exit(0);
                    break;
                case 1:  m.crearMatriz(nombreAlumnos);
                    break;
                case 2:  m.mostrarNotas(notas);
                    break;
                case 3:  m.calcularMedia(notas);
                    break;
                case 4:  m.notaMayor(notas);
                    break;
                case 5:  m.verNotaAlumno(notas, nombreAlumnos);
                    break;
                case 6: m.verAlumnosAprovados(notas, nombreAlumnos);
                    break;
                case 7: m.ordenarNotasDeMenosAmas(notas, nombreAlumnos);
                    break;
                case 8: m.amosarNotasYnombres(notas, nombreAlumnos);
                    break;
            }
        }while(opcion!=0);*/

        //Apartado 4
        int opcion2;
        opcion2 = m.calcularRestoDNI();
        switch (opcion2) {
            case 0:
                System.out.println("Su letra es: T");
                break;
            case 1:
                System.out.println("Su letra es: R");
                break;
            case 2:
                System.out.println("Su letra es: W");
                break;
            case 3:
                System.out.println("Su letra es: A");
                break;
            case 4:
                System.out.println("Su letra es: G");
                break;
            case 5:
                System.out.println("Su letra es: M");
                break;
            case 6:
                System.out.println("Su letra es: Y");
                break;
            case 7:
                System.out.println("Su letra es: F");
                break;
            case 8:
                System.out.println("Su letra es: P");
                break;
            case 9:
                System.out.println("Su letra es: D");
                break;
            case 10:
                System.out.println("Su letra es: X");
                break;
            case 11:
                System.out.println("Su letra es: B");
                break;
            case 12:
                System.out.println("Su letra es: N");
                break;
            case 13:
                System.out.println("Su letra es: J");
                break;
            case 14:
                System.out.println("Su letra es: Z");
                break;
            case 15:
                System.out.println("Su letra es: S");
                break;
            case 16:
                System.out.println("Su letra es: Q");
                break;
            case 17:
                System.out.println("Su letra es: V");
                break;
            case 18:
                System.out.println("Su letra es: H");
                break;
            case 19:
                System.out.println("Su letra es: L");
                break;
            case 20:
                System.out.println("Su letra es: C");
                break;
            case 21:
                System.out.println("Su letra es: K");
                break;
            case 22:
                System.out.println("Su letra es: E");
                break;
        }
    }
}
