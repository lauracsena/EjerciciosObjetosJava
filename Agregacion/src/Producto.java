public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;

    public Producto(){

    }

    public void setCodigo( int val){
        this.codigo = val;
    }

    public void setDescripcion( String val){
        this.descripcion = val;
    }

    public void setPrecio( float val){
        this.precio = val;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public float getPrecio(){
        return precio;
    }

}
