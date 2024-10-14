package clasesPersonas;
public class Estudiante extends Persona{
    private String carrera;
    private int legajo;
    
    public Estudiante(){

    }

    public void setCarrera(String car){
        this.carrera = car;
    }

    public void setLegajo(int leg){
        this.legajo = leg;
    }

    public String getCarrera(){
        return carrera;
    } 

    public int getLegajo(){
        return legajo;
    }
}
