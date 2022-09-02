public class Main {
    public static void main(String[] args) {
        int Resultado = suma(1, 2, 3);
        System.out.println(Resultado);
        coche micoche =  new coche();
        micoche.sumpuerta();
        System.out.println(micoche.puertas);

    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
    }
class coche{
    public int puertas = 4;

    public void sumpuerta(){
        this.puertas++;
    }
}