package clasesComposicion;

import clasesAgregacion.Fecha;

public class ComprobanteC {
     private char tipo;
    private int numero;
    private Fecha fecha;

    public ComprobanteC(int dia, int mes, int anio) {
        fecha = new Fecha(dia, mes, anio);
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
