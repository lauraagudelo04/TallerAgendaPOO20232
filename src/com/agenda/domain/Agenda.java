package com.agenda.domain;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public static final byte CAPACIDAD=50;
    private List<Contacto>contactos; //Se creo la lista de los contactos

    public Agenda(){
        this.contactos= new ArrayList<>();
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void crearContacto(String nombreContacto, String apellidoContacto, long numeroContacto){
        Contacto contactoVerificacion= this.buscarContactoPorNumero(numeroContacto);
        if(this.contactos.size()<CAPACIDAD && contactoVerificacion==null){
            Contacto contactoNuevo= new Contacto(nombreContacto,apellidoContacto,numeroContacto);
            this.contactos.add(contactoNuevo);
            System.out.println("El contacto "+ contactoNuevo.getNombre() + " " + contactoNuevo.getApellido()+" "+ contactoNuevo.getNumero() + " fue agregado correctamente");
        }
        System.out.println("El contacto no se pudo agregar porque la agenda esta llena");

    }

    public boolean eliminarContacto(long numeroContacto){
        Contacto contactoAEliminar=buscarContactoPorNumero(numeroContacto);
        if(contactoAEliminar!=null){
            this.contactos.remove(contactoAEliminar);
            System.out.println("El contacto "+" "+contactoAEliminar.getNombre()+" "+" "+contactoAEliminar.getApellido()+" "+contactoAEliminar.getNumero()+" " + " ha sido eliminado");
            return true;
        }
        System.out.println("El contacto no se elimino, porque no fue encontrado");
        return false;

    }

    public List<Contacto> buscarContactoPorNombre(String nombreABuscar){
        List<Contacto> listaContactoNombre=this.contactos
                .stream()
                .filter(item-> item.getNombre().equalsIgnoreCase(nombreABuscar))
                .toList();
        return listaContactoNombre;
    }

    public List<Contacto> buscarContactoPorApellido(String apellidoABuscar){
        List<Contacto> listaContactoApellido=this.contactos
                .stream().filter(item->item.getApellido().equalsIgnoreCase(apellidoABuscar))
                .toList();
        return listaContactoApellido;
    }

    public Contacto buscarContactoPorNumero(long numeroABuscar){
        Contacto contactoABuscarNum= this.contactos.stream()
                .filter(item->item.getNumero()==numeroABuscar)
                .findFirst()
                .orElse(null);

        return contactoABuscarNum;
    }

    public void cambiarCelular(long numeroActual, long nuevoNumero){
        Contacto contactoAModificar= this.buscarContactoPorNumero(numeroActual);
        if(contactoAModificar !=null){
            contactoAModificar.setNumero(nuevoNumero);
            System.out.println("Se ha modificado el numero a: "+" "+nuevoNumero);
        }
        System.out.println("El número no existe, por lo tanto no se puede modificar");
    }

    public List<Contacto> ordenarAlfabeticamente(){
        return contactos;

    }
}


