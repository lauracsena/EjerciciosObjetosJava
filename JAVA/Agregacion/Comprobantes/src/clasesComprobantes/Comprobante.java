package clasesComprobantes;
public class Comprobante {

    private char tipo;
    private int numero;
    private Fecha fecha;

    public Comprobante(char t, int n, Fecha f) {
        setFecha(f);
        setNumero(n);
        setTipo(t);
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char val) {
        this.tipo = val;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int val) {
        this.numero = val;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha val) {
        this.fecha = val;
    }

}
