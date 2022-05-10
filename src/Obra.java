import java.util.Calendar;

public class Obra {
    private long codigoObra;
    private String titulo;
    private Calendar fecha= Calendar.getInstance();
    private float precioRef;
    private String dimensiones;
    public long getCodigoObra() {
        return codigoObra;
    }
    public void setCodigoObra(long codigoObra) {
        this.codigoObra = codigoObra;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Calendar getFecha() {
        return fecha;
    }
    public void setFecha(int dia, int mes, int anio) {
        this.fecha.set(anio, mes, dia);
    }
    public float getPrecioRef() {
        return precioRef;
    }
    public void setPrecioRef(float precioRef) {
        this.precioRef = precioRef;
    }
    public String getDimensiones() {
        return dimensiones;
    }
    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
    public Obra(long codigoObra, String titulo, int dia, int mes, int anio,float precioRef,String dimensiones) {
        this.setCodigoObra(codigoObra);
        this.setTitulo(titulo);
        this.setFecha(dia, mes, anio);
        this.setPrecioRef(precioRef);
        this.setDimensiones(dimensiones);
    }
}
