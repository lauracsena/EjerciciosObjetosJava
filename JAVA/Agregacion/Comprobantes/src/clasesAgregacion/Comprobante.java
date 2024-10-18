package clasesAgregacion;
public class Comprobante {

    private char tipo;
    private int numero;
    private Fecha fecha;

    public Comprobante(char t, int n, Fecha f) {
        setFecha(f);
        setNumero(n);
        setTipo(t);
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

}
