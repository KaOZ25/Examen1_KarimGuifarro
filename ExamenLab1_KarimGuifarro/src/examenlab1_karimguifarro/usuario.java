/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab1_karimguifarro;

import java.util.ArrayList;


public class usuario {
private String codigo,nombre,apellido,edad,admin;
private ArrayList <Inventario> libro=new ArrayList ();
    public usuario() {
    }

    public usuario(String codigo, String nombre, String apellido, String edad, String admin) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.admin = admin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.length()==4) {
        this.codigo = codigo;
        }  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public ArrayList<Inventario> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Inventario> libro) {
        this.libro = libro;
    }
    
}
