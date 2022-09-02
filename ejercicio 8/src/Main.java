public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(90, 2);
        System.out.println(miCoche.numeroDePuertas);
        System.out.println(miCoche.velocidadMax);
        Coche miCoche2 = new Coche();
        System.out.println(miCoche2.numeroDePuertas);
        System.out.println(miCoche2.velocidadMax);
        miCoche.acelerar();
        miCoche.desaacelerar();
    }
}
class Coche{
    int numeroDePuertas;
    int velocidadMax;
    float velocidadActual;
    public Coche(int velocidad, int puertas){
        velocidadMax+=velocidad;
        numeroDePuertas+=puertas;
    }
    public Coche(){
        velocidadMax+=120;
        numeroDePuertas+=5;
    }
    public void acelerar(){
        velocidadActual+=15;
    };
    public void desaacelerar(){};

}