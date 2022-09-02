package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListasMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Bob");
        nombres.add("Tom");
        nombres.add("Jane");
        nombres.add("Luna");
        System.out.println(nombres);
        for(String n : nombres){
            System.out.println(n);
        }
        List<Coche> coches = new ArrayList<>();
        coches.add(new Coche("rojo","perro", "gato", 2.00, 20.00));
        coches.add(new Coche());
        coches.add(new Coche());
        coches.add(new Coche());
        System.out.println(coches);
    }

}
