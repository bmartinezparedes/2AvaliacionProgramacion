package com.programacion.Boletines.Boletin18;

public class Correo {
    String contido;
    boolean lido;

    public Correo() {
    }

    public Correo(String contido, boolean lido) {
        this.contido = contido;
        this.lido = lido;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    @Override
    public String toString() {
        return "Contido= " + contido + ", lido= " + lido;
    }
}
