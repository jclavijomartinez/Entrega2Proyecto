import java.util.ArrayList;

public class GestionObras {
    // crear obra
    static public Obra crearObra(long codigoObra, String titulo, int dia, int mes, int anio,float precioRef,String dimensiones,long codigoCompra,int diacompra, int mescompra, int aniocompra,boolean pagado,ArrayList<Artista> lArtistas) {
        Obra obraAAgregar = new Obra(codigoObra, titulo, dia, mes, anio, precioRef, dimensiones,codigoCompra,diacompra, mescompra,aniocompra,pagado,lArtistas);
        return obraAAgregar;
    }
    // crear artista
    static public Artista crearArtista( long codigoArtista, long cedula, String nombre, String apellido, int dia, int mes, int anio, long telefono,ArrayList<Obra> lista) {
        Artista artistaAagregar = new Artista(codigoArtista, cedula, nombre, apellido, dia, mes, anio, telefono,lista);
        return artistaAagregar;
    }
}
