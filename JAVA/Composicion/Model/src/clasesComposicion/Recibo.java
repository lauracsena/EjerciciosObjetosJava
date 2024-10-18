package clasesComposicion;

public class Recibo extends ComprobanteC {
    private Proveedor proveedor;
    private float total;
    private String detalle;

    public Recibo(int dia,int mes,int anio, String razonSocial, int codigo) {
        super(dia, mes, anio); // ejecuta el constructor de la superclase
        proveedor = new Proveedor(razonSocial, codigo);

    }

    public Proveedor getProvedor() {
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
}
