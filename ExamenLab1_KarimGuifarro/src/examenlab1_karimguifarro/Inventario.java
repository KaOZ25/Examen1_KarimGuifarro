/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab1_karimguifarro;

import java.util.Date;


public class Inventario {
  private String autores,titulo,genero,editoriales,idioma,ISBN,año_ingreso,estado,libro_persona,cuenta_persona;
  private String creacion;

    public Inventario() {
    }

    public Inventario(String autores, String titulo, String genero, String editoriales, String idioma, String ISBN, String año_ingreso, String estado, String libro_persona, String cuenta_persona, String creacion) {
        this.autores = autores;
        this.titulo = titulo;
        this.genero = genero;
        this.editoriales = editoriales;
        this.idioma = idioma;
        this.ISBN = ISBN;
        this.año_ingreso = año_ingreso;
        this.estado = estado;
        this.libro_persona = libro_persona;
        this.cuenta_persona = cuenta_persona;
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

    public String getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(String editoritales) {
        this.editoriales = editoritales;
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

    public String getAño_ingreso() {
        return año_ingreso;
    }

    public void setAño_ingreso(String año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLibro_persona() {
        return libro_persona;
    }

    public void setLibro_persona(String libro_persona) {
        this.libro_persona = libro_persona;
    }

    public String getCuenta_persona() {
        return cuenta_persona;
    }

    public void setCuenta_persona(String cuenta_persona) {
        this.cuenta_persona = cuenta_persona;
    }

    public String getCreacion() {
        return creacion;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }

    
}
