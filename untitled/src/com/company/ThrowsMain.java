package com.company;

import java.util.Scanner;



public class ThrowsMain {
    public static void main(String[] args) {
        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }
    /**
     * Metodo que lee nombres de consola y verifica que tenga longitud
     * igual o menor que 8
     * @throws NameFormatException
     */
    private static void leerNombres() throws NameFormatException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un nombre");
        while (teclado.hasNext()) {
            System.out.println("introduce nombre");
            String nombre = teclado.nextLine();
            if(nombre.length()<8){
                teclado.close();
                throw new NameFormatException("El nombre debe tener MINIMO  8 caracteres");

            }

        }
        teclado.close();
    }
}
