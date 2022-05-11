public class GestionObras {
    // crear obra
    static public Obra crearObra(long codigoObra, String titulo, int dia, int mes, int anio,float precioRef,String dimensiones) {
        Obra obraAAgregar = new Obra(codigoObra, titulo, dia, mes, anio, precioRef, dimensiones);
        return obraAAgregar;
    }
    // crear artista
    static public Artista crearArtista( long codigoArtista, long cedula, String nombre, String apellido, int dia, int mes, int anio, long telefono) {
        Artista artistaAagregar = new Artista(codigoArtista, cedula, nombre, apellido, dia, mes, anio, telefono);
        return artistaAagregar;
    }
}
