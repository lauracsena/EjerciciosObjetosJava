package clasesComprobantes;
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAnio(a);
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int an) {
        this.anio = an;
    }

    public void setDia(int di) {
        this.dia = di;
    }

    public void setMes(int me) {
        this.mes = me;
    }
}
