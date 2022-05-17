import java.util.ArrayList;
import java.util.Calendar;
public class Artista {
    private ArrayList<Obra> listaobras = new ArrayList<>();
    private long codigoArtista;
    private long cedula;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento = Calendar.getInstance();
    private long telefono;
    
    public ArrayList<Obra> getObras() {
        return listaobras;
    }
    public void setObras(ArrayList<Obra> listaobras) {
        this.listaobras = listaobras;
    }
    public long getCodigoArtista() {
        return codigoArtista;
    }
    public void setCodigoArtista(long codigoArtista) {
        this.codigoArtista = codigoArtista;
    }
    public long getCedula() {
        return cedula;
    }
    public void setCedula(long cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(int dia, int mes, int anio) {
        this.fechaNacimiento.set(anio , mes, dia);
    }
    public Artista(long codigoArtista, long cedula, String nombre, String apellido,int dia,int mes,int anio, long telefono, ArrayList<Obra> lista) {
        this.codigoArtista = codigoArtista;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.setFechaNacimiento(dia, mes, anio);
        this.telefono = telefono;
        this.setObras(lista);
    }
    
}