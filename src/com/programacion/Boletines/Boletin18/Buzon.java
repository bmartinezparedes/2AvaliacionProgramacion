package com.programacion.Boletines.Boletin18;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Buzon {
    public int numeroDeCorreos(ArrayList<Correo> listaCorreo) {
        int aux = 0;
        for (Correo ele : listaCorreo) {
            aux++;
        }
        //System.out.println("Hay "+aux+" correos");
        return aux;
    }

    public void engade(ArrayList<Correo> listaCorreo) {
        Correo co = pedirCorreo("Corro a engadir: ");
        listaCorreo.add(co);
    }

    public static Correo pedirCorreo(String menxase) {
        String contido = JOptionPane.showInputDialog("Introduce correo");
        int numero;
        boolean lido;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("0-NO Leido\n1-Leido"));
        } while (numero != 0 && numero != 1);
        if (numero == 1) {
            lido = true;
        } else
            lido = false;
        Correo co = new Correo(contido, lido);
        return co;
    }

    public boolean porLer(ArrayList<Correo> listaCorreo) {
        boolean aux = false;
        for (Correo ele : listaCorreo) {
            if (ele.isLido() == false)//si el correo no esta leido que marque aux como que hay correos sin leer
                aux = true;
        }
        //System.out.println("Hay "+aux+" correos");
        return aux;
    }

    public String amosaPrimerNoLeido(ArrayList<Correo> listaCorreo) {
        int aux = 0;
        String string = "Todos los correos leidos";
        for (Correo ele : listaCorreo) {
            if (aux == 0 && ele.isLido() == false) {
                aux = 1;
                string = ele.getContido();
                ele.setLido(true);
            }
        }
        return string;
    }

    public String amosa(int correo, ArrayList<Correo> listaCorreo) {
        int aux = 1;
        String co = "Correo inexistente";
        for (Correo ele : listaCorreo) {
            if (aux == correo) {
                co = ele.getContido();
            }
            aux++;
        }
        return co;
    }

    public void elimina(int correo, ArrayList<Correo> listaCorreo) {
        int aux = 1;
        Iterator it = listaCorreo.iterator();
        while (it.hasNext()) {
            Correo co = (Correo) it.next();
            if (aux == correo) {
                it.remove();
            }
            aux++;
        }
    }
}
