package com.company.interfaces;

import com.company.Coche;
import com.company.CocheHibrido;

public class CocheSportServiceImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche sport");
        return new CocheHibrido();
    }
}
