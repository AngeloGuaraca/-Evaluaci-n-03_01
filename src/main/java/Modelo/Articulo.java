/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ROG PC
 */
public class Articulo {
    
    private String nombre;
    private String titulo;
    private String idioma;
    private int codigo;
    private int numpage;

    public Articulo(String nombre, String titulo, String idioma, int codigo, int numpage) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.idioma = idioma;
        this.codigo = codigo;
        this.numpage = numpage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumpage() {
        return numpage;
    }

    public void setNumpage(int numpage) {
        this.numpage = numpage;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", titulo=" + titulo 
                + ", idioma=" + idioma + ", codigo=" + codigo + ", numpage="
                + numpage + '}';
    }
   
    
}
