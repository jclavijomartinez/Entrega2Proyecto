import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Artista {
    private List<Obra> listaobras;
    private String codigoArtista;
    private long cedula;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento = Calendar.getInstance();
    private long telefono;
    
    public void setObras(ArrayList<Obra> listaobras) {
        this.listaobras = listaobras;
    }
    public String getCodigoArtista() {
        return codigoArtista;
    }
    public void setCodigoArtista(String codigoArtista) {
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
    public void addObra(Obra nuevaObra) {
        if (this.listaobras == null) {
            
        } else {
            
        }
    }
    public Artista(String codigoArtista, long cedula, String nombre, String apellido,int dia,int mes,int anio, long telefono,List<Obra> listaobras) {
        this.codigoArtista = codigoArtista;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.setFechaNacimiento(dia, mes, anio);
        this.telefono = telefono;
        this.listaobras = new ArrayList<>();
    }
    
}