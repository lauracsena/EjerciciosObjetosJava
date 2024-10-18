package clasesComposicion;

public class FechaC {
    private int dia;
    private int mes;
    private int anio;

    public FechaC() {
        setDia(dia);
        setMes(mes);
        setAnio(anio);

    }

    public int getDia(int dia, int mes, int anio) {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
