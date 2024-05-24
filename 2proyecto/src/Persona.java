public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private String contraseña;

    public Persona(String nombre, int edad, String sexo, double peso, double altura,String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        double imc = peso / (altura * altura);
        return Math.round(imc);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // getter y seter dec contraseña
    

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
    }

    public String getContraseña() {
        return contraseña;
    }

}
