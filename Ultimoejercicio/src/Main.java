public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setEdad(30);
        cliente.setNombre("Mario");
        cliente.setTelefono(123456);
        cliente.setCredito(100000);

        trabajador.setEdad(30);
        trabajador.setNombre("Johanna");
        trabajador.setTelefono(456789);
        trabajador.setSalario(40000);

        System.out.println(cliente.getEdad() + " " + cliente.getNombre() + " "
                + cliente.getTelefono() + " " + cliente.getCredito());
        System.out.println(trabajador.getEdad() + " " + trabajador.getNombre() + " " +
                trabajador.getTelefono() + " " + trabajador.getSalario());


    }
}
class Persona{
    private int edad;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    private String nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    private int telefono;
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
    }
class Cliente extends Persona{
    private int credito;
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
};
class Trabajador extends Persona{
    private int salario;
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
};