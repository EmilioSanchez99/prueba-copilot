public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private double estatura;
    private double peso;
    //constructor
    public Persona(String nombre, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //toString

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + "]";
    }
    
}