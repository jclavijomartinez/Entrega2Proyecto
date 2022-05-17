import java.util.ArrayList;
import java.util.Calendar;

public class Obra {
    private ArrayList<Artista> listadeartistas= new ArrayList<>(); 
    private Compra compraObra;
    private long codigoObra;
    private String titulo;
    private Calendar fecha= Calendar.getInstance();
    private float precioRef;
    private String dimensiones;
    
    public ArrayList<Artista> getListadeartistas() {
        return listadeartistas;
    }
    public void setListadeartistas(ArrayList<Artista> listadeartistas) {
        this.listadeartistas = listadeartistas;
    }
    public long getCodigoObra() {
        return codigoObra;
    }
    public void setCodigoObra(long codigoObra) {
        this.codigoObra = codigoObra;
    }
    public Compra getCompraObra() {
        return compraObra;
    }
    public void setCompraObra(long codigoCompra,int dia, int mes, int anio,boolean pagado) {
        this.compraObra = new Compra(codigoCompra, dia, mes, anio, pagado);
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
    public Obra(long codigoObra, String titulo, int dia, int mes, int anio,float precioRef,String dimensiones,long codigoCompra,int diacompra, int mescompra, int aniocompra,boolean pagado,ArrayList<Artista> lista) {
        this.setCodigoObra(codigoObra);
        this.setTitulo(titulo);
        this.setFecha(dia, mes, anio);
        this.setPrecioRef(precioRef);
        this.setDimensiones(dimensiones);
        this.setCompraObra(codigoCompra,diacompra,mescompra, aniocompra,pagado);
        this.setListadeartistas(lista);
    }
}

