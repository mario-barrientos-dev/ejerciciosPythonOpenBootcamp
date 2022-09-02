public class Main {
    public static void main(String[] args) {
        int numeroif = -1;
        if(numeroif>0){
            System.out.print("Positivo" + " ");
        } else if (numeroif<0) {
            System.out.print("negativo" + "\n");
        }else{
            System.out.println(0 + "\n");
        }
        int numerowhile=0;
        while(numerowhile<3){
            numerowhile+=1;
            System.out.println(numerowhile + "\n");

        }
        do{
            System.out.println(numerowhile + "\n");
            numerowhile-=3;
        }while(numerowhile>3);

        int numerofor=0;
        for(numerofor=0; numerofor<=3; numerofor++){
            System.out.println(numerofor);
        }
        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es vernano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("indefinido");
                break;
        }
    }
}