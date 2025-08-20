public class Test {

    private String Nombre;
    private int Edad;
    private String Apellido;

    
    public Test(String nombre, int edad, String apellido) {
        Nombre = nombre;
        Edad = edad;
        Apellido = apellido;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    

}
