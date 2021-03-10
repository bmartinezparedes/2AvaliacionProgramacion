package com.programacion.Boletines.Boletin17.libreria;

public class Libreria implements Comparable<Libreria>{
    private String titulo,autor,isbn;
    private int numero;
    private float prezo;

    public Libreria(){
    }

    public Libreria(String titulo, String autor, String isbn, int numero, float prezo) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numero = numero;
        this.prezo = prezo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", Autor=" + autor + ", ISBN=" + isbn + ", Numero de ejemplares=" + numero + ", Prezo=" + prezo;
    }

    @Override
    public int compareTo(Libreria t) {
        Libreria lib=(Libreria) t;
        return(this.titulo.compareToIgnoreCase(lib.titulo));

    }
}
