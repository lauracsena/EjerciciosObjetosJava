import clasesPersonas.*;
import clasesPersonas.Persona;
import clasesPersonas.Estudiante;
import clasesPersonas.Profesor;
 
public class AppGeneralizacion{
    public static void main(String[] args){
        Persona p = new Persona();
        p.setNombre("Pepe");
        p.setEdad(25);
        Estudiante e = new Estudiante();
        e.setNombre("Juan jose");
        e.setLegajo(22345);
        e.setCarrera("Sistemas");

        Profesor pro = new Profesor();
        pro.setNombre("Fernando");
        pro.setMateria("Paradigmas de programacion");
        pro.setCargo("Adjunto");

        System.out.println("Objeto p de tipo persona");
        System.out.printf("Nombre: %s, Carrera: %d \n", p.getNombre(), p.getEdad());
        System.out.println("Obejto e de tipo Estudiante");
        System.out.printf("Nombre: %s, Carrera:%s, Legajo: %d \n", e.getNombre(), e.getCarrera(), e.getLegajo());
        System.out.println("Objeto pro de tipo profesor");
        System.out.printf("Nombre: s%, Materia:%s, Cargo: %s \n", pro.getNombre(), pro.getMateria(), pro.getCargo());

    }
}
