package com.programacion.Boletines.Boletin17.aplicacion;

import com.programacion.Boletines.Boletin17.libreria.Libreria;
import com.programacion.Boletines.Boletin17.libreria.Metodos17;

import javax.swing.*;
import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {

        ArrayList<Libreria> libro=new ArrayList<Libreria>();

        String opcion;

        do{
            opcion= JOptionPane.showInputDialog("MENU\n1 Engadir Libro\n2 Libreria\n3 Busqueda por Titulo\n4 Vender Libro\n0 Sair");
            switch(opcion){
                case "1": Metodos17.engadirElemento(libro);
                    break;
                case "2": Metodos17.amosarLib(libro);
                    break;
                case "0":System.exit(0);
                    break;
                case "3": Metodos17.buscarLibro(libro, JOptionPane.showInputDialog("Titulo de la busqueda"));
                    break;
                case "4": Metodos17.VenderLibro(libro,JOptionPane.showInputDialog("Titulo a vender"));
            }
        }while(!opcion.equals("0"));

    }
}
