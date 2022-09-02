package com.company;

public class Stringmain {
    public static void main(String[] args) {
        String mensaje = "     Hola soy un mensaje   ";
        System.out.println(mensaje.length());
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.trim());
        String nuevoMensaje =mensaje.trim();
        System.out.println(nuevoMensaje.equalsIgnoreCase("Hola SOY un mensaje"));
    }
}
