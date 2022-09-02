package com.company;

public class electricCar extends Coche{
    String motorElectrico;

    public electricCar(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    };
    public electricCar(){}
    public electricCar(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada= cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "electricCar{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
