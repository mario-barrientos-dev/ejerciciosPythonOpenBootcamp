package com.company;

public class CocheMain {
    public static void main(String[] args) {
       // Coche cocheObj = new Coche("rojo", "toyota", "Prado", 800.88, 2.23);
       // Coche cocheObj2 = new Coche();
        //cocheObj.acelerar(100);
        //cocheObj2.acelerar(50);
        //System.out.println(cocheObj);
        //System.out.println(cocheObj2);
        //cocheObj.peso=700.76;
        //System.out.println(cocheObj);
        electricCar cocheObj3 = new  electricCar();
        cocheObj3.peso=700.76;
        cocheObj3.color="verde";
        cocheObj3.fabricante="Mazda";
        System.out.println(cocheObj3);
        electricCar cocheObj4 = new  electricCar("morado", "toyota", "prado", 100.00, 100.00, "efectivo");
        System.out.println(cocheObj4);
        cocheObj4.acelerar(10);
        System.out.println(cocheObj4);
    }
}
