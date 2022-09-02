package com.company.interfaces;


import com.company.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service1 = new CocheClassicServiceImpl();
        CocheService service2 = new CocheSportServiceImpl();
        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();
    }
}
