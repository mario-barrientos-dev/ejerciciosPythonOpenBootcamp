package com.company;

public class ifElse {
    public static void main(String[] args) {
        boolean check= 5<10;

        if(check==false){
            System.out.println("Es verdad");
        }else if(5%5!=0){
            System.out.println("Estoy en el elseif");
        }else{
            System.out.println("se acabo");
        }
        System.out.println("estoy fuera de la funcion");
    }
}
