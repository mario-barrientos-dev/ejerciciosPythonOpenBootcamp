package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();
        personas.put("1014230570", "Mario");
        personas.put("1098642990", "Johanna");
        personas.put("63369230", "Teresa");
        System.out.println(personas);
        for (String key : personas.keySet()){
            System.out.println(key);
        }
        for (String values : personas.values()){
            System.out.println(values);
        }
        for(Map.Entry<String, String> entry : personas.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
