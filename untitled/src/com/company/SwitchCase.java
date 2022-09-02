package com.company;

public class SwitchCase {
    public static void main(String[] args) {
        String weather = "sunny";
        switch (weather){
            case "sunny":
                System.out.println("el tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("el tiempo es nublado");
                break;
            case "raining":
                System.out.println("el tiempo es lluvioso");
                break;
            case "darkness":
                System.out.println("el tiempo es oscuro");
                break;
            default:
                System.out.println("no se ha encontrado el clima");
        }
    }
}
