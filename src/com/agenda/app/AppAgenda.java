package com.agenda.app;

import com.agenda.domain.Agenda;
import com.agenda.domain.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda nuevoContacto=new Agenda();

        nuevoContacto.crearContacto("Laura","Agudelo",304);
        nuevoContacto.crearContacto("Laura","Aalvarez",312);
        nuevoContacto.crearContacto("Carlos","Alvarez",316);
        nuevoContacto.crearContacto("Pedro","Rios",312);
        nuevoContacto.crearContacto("Simon","Lopez",316);
        nuevoContacto.crearContacto("Luciana","lopez",304);


        System.out.println("\n");
        System.out.println("-------------la lista de contactos es--------------------------------\n");
        for (Contacto item:nuevoContacto.getContactos()){
            System.out.println(item.getNombre()+" "+item.getApellido()+" "+item.getNumero());
        }
        System.out.println("\n-------------Lista de contactos nueva-------------\n");
        nuevoContacto.eliminarContacto(123);
        System.out.println("---Lista actualizada---");
        for (Contacto item:nuevoContacto.getContactos()){
            System.out.println(item.getNombre()+" "+item.getApellido()+" "+item.getNumero());

        }

        System.out.println("\n-------------Lista de contactos encontrados por nombre-------------\n");
       // List<Contacto> contactoEncontradoNombre= nuevoContacto.buscarContactoPorNombre("laURa");
        for (Contacto elemento:nuevoContacto.buscarContactoPorNombre("LAURA")){
            System.out.println("El contacto buscado con el nombre "+ elemento.getNombre()+" encontrado fue: "+" "+elemento.getNombre()+" "+ elemento.getApellido()+" "+ elemento.getNumero());
        }
        System.out.println("\n-------------Lista de contactos encontrados por apellido-----------\n");
        //List<Contacto> contactoPorApellido= nuevoContacto.buscarContactoPorApellido("Lopez");
        for (Contacto elemento2: nuevoContacto.buscarContactoPorApellido("aLVarez")){
            System.out.println("El contacto buscado con el apellido "+ elemento2.getApellido()+" encontrado fue: "+" "+elemento2.getApellido()+" "+ elemento2.getNombre()+" "+ elemento2.getNumero());

        System.out.println("\n-----------------Cambio de numero------------------\n");
        nuevoContacto.cambiarNumero(304,123);
        for (Contacto item:nuevoContacto.getContactos()){
            System.out.println(item.getNombre()+" "+item.getApellido()+" "+item.getNumero());
        }

        System.out.println("\n-----------------Orden alfabetico------------------\n");
        nuevoContacto.ordenarAlfabeticamente();
            for (Contacto contacto : nuevoContacto.ordenarAlfabeticamente()) {
                System.out.println(contacto.getNombre() + " " + contacto.getApellido());
            }

        }
}}
