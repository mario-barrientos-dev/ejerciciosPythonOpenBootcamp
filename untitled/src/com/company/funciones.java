package com.company;

import javax.xml.namespace.QName;

public class funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo("mario");
        holaMundo("mario", "apellido");
        String careBola= devolverHola();
        System.out.println(careBola);
        int res= sum(2,3);
        System.out.println(res);
    }

    public static void holaMundo() {
        System.out.println("hola mundo");
    }

    //sobre carga con 1 parametro adicional
    public static void holaMundo(String name) {
        System.out.println("hola " + name);

    }
    //sobre carga con 2 parametros adicionales
    public static void holaMundo(String name, String apellido){
        System.out.println("hola " + name + " " + apellido);
    }

    private static String devolverHola(){
        return "Hola";
    }
    private static int sum(int num1, int num2){
        return num1 + num2;
    }
}