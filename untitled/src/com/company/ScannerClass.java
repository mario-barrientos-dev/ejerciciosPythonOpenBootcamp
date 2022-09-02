package com.company;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Porfavor intruce un Nombre");
        String nombre = scaner.nextLine();

        System.out.println("El nombre introducido es: " + nombre);

        System.out.println("Porfavor intruce un Numero");
        int numero = scaner.nextInt();

        System.out.println("El nombre introducido es: " + numero);

        System.out.println("Fin del programa");

    }
}
