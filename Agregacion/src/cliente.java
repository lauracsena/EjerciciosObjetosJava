public class cliente {
    private int codigo;
    private String razonSocial;

    public cliente(){

    }

    public int getCodigo(){
        return codigo;
    }

    public String getRazonSocial(){
        return razonSocial;
    }

    public void setRazonSocial(String raz){
        this.razonSocial = raz;
    }

    public void setCodigo(int cod){
        this.codigo = cod;
    }

}
