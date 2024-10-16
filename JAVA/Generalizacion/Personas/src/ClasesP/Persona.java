package ClasesP;
public class Persona {
    private String nombre;
    private int edad;

    public Persona(){

    }

    //asignar valor set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //mostrar/retornar get
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

}