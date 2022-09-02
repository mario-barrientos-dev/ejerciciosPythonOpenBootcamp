package com.company;

public class whilee {
    public static void main(String[] args) {
        boolean check=true;
        int count = 0;
        while (count <  10){
            count+=1;
            if (count==5)
            //    continue;//salta la iteracion
            break;//rompe el flujo apenas se cumple
            System.out.println(count + " " + "aun no es 10");

        }
        System.out.println("ya es termino");
    }
}
