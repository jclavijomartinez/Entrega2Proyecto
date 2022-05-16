import java.util.Calendar;

public class Compra {
    private long codigoCompra;
    private Calendar fechaCompra = Calendar.getInstance();
    private boolean pagado;
    public long getCodigoCompra() {
        return codigoCompra;
    }
    public void setCodigoCompra(long codigoCompra) {
        this.codigoCompra = codigoCompra;
    }
    public Calendar getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(int dia, int mes, int anio) {
        this.fechaCompra.set(anio, mes, dia);
    }
    public boolean isPagado() {
        return pagado;
    }
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    public Compra(long codigoCompra,int dia, int mes, int anio, boolean pagado) {
        this.setCodigoCompra(codigoCompra);
        this.setFechaCompra(dia, mes, anio);
        this.setPagado(pagado);
    }
  
}
