import java.util.Calendar;
public class Artista {
    private long codigoArtista;
    private long cedula;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento = Calendar.getInstance();
    private long telefono;
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
}