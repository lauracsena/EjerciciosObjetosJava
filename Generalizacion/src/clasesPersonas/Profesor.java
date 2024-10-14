package clasesPersonas;
public class Profesor extends Persona {
    private String materia;
    private String cargo;

    public Profesor(){

    }

    public void setMateria(String mat){
        this.materia = mat;
    }

    public void setCargo(String car){
        this.cargo = car;
    }

    public String getMateria(){
         return materia;
    }

    public String getCargo(){
        return cargo;
   }

}
