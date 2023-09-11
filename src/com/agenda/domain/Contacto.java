package com.agenda.domain;

public class Contacto {
    private String nombre;
    private String apellido;
    protected long numero;

    public Contacto(String nombre, String apellido, long numero) { //Luego de establecer los
        // atributos de la clase creamos el contructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }
//Se crean los getters y setters  para obtener los valores los atributos y
// modificar los que se permitan

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getNumero() {
        return numero;
    }


}



