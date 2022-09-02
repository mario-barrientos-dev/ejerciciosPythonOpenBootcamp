package com.company.interfaces;

import com.company.Coche;
import com.company.electricCar;
import com.company.interfaces.CocheService;

public class CocheClassicServiceImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche class");
        return new electricCar();
    }
}
