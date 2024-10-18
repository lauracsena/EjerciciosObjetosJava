package clasesComposicion;

public class Recibo extends ComprobanteC {
    private Proveedor proveedor;
    private float total;
    private String detalle;

    public Recibo(int dia,int mes,int anio, String razonSocial, int codigo) {
        super(dia, mes, anio); 
        proveedor = new Proveedor(razonSocial, codigo);

    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void mostrar() {
        System.out.printf("Tipo: %c Número: %d \n Fecha: %d/%d/%d \n Proveedor: %s",
        getTipo(), getNumero(), getFecha().getDia(), getFecha().getMes(), getFecha().getAnio(), getProveedor());

        System.out.printf(" Codigo: %d Razon Social: %s \n",
        proveedor.getCodigo(), proveedor.getRazonSocial()); 

        System.out.printf("Servicio Jardineria: %s Importe Total: 5.2f \n",
        getDetalle(), getTotal());
        
    }
    
}
