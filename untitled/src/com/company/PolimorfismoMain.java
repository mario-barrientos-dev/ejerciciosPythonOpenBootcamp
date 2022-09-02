package com.company;

public class PolimorfismoMain {
    public static void main(String[] args) {
        //Coche coche1= new Coche();
        CocheHibrido coche2= new CocheHibrido();
        electricCar coche3= new electricCar();
        //polimorfismo se pueden tratar como 2 clases, superior y heredada
        Coche coche5= new electricCar();
        Coche coche6= new CocheHibrido();
    }
}
