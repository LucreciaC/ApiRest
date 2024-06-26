package com.uch.apirest.models;

import javax.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int ID;
    @Basic
    private String nombre;
    private String autor;
    private int ISBN;
    private int añoPublicacion;

    public Libro() {
    }

    public Libro(String nombre, String autor, int ISBN, int añoPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
        this.añoPublicacion = añoPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN=" + ISBN +
                ", añoPublicacion=" + añoPublicacion +
                '}';
    }
}
