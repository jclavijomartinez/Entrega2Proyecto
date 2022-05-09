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
    public void setFechaCompra(Calendar fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public boolean isPagado() {
        return pagado;
    }
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
}
