/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab1_karimguifarro;

import java.util.Date;


public class Inventario {
  private String autores,titulo,genero,editoritales,idioma,ISBN;
  private Date creacion;

    public Inventario() {
    }

    public Inventario(String autores, String titulo, String genero, String editoritales, String idioma, String ISBN, Date creacion) {
        this.autores = autores;
        this.titulo = titulo;
        this.genero = genero;
        this.editoritales = editoritales;
        this.idioma = idioma;
        this.ISBN = ISBN;
        this.creacion = creacion;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditoritales() {
        return editoritales;
    }

    public void setEditoritales(String editoritales) {
        this.editoritales = editoritales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Inventario{" + "autores=" + autores + ", titulo=" + titulo + ", genero=" + genero + ", editoritales=" + editoritales + ", idioma=" + idioma + ", ISBN=" + ISBN + ", creacion=" + creacion + '}';
    }
  
}
