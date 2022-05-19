import java.util.List;
import java.util.Scanner;

public class GestionObras {
    // crear obra
    static public Obra crearObra(long codigoObra, String titulo, int dia, int mes, int anio,float precioRef,int alto, int ancho,long codigoCompra,int diacompra, int mescompra, int aniocompra,boolean pagado,List<Artista> lista) {
        Obra obraAAgregar = new Obra(codigoObra,titulo,dia, mes, anio,precioRef,alto,ancho,codigoCompra,diacompra,mescompra,aniocompra,pagado,lista);
        return obraAAgregar;
    }
    // crear artista
    static public Artista crearArtista( String codigoArtista, long cedula, String nombre, String apellido,int dia,int mes,int anio, long telefono,List<Obra> listaobras) {
        Artista artistaAagregar = new Artista(codigoArtista, cedula, nombre, apellido,dia,mes,anio, telefono,listaobras);
        return artistaAagregar;
    }
    //13
    int i ;
    public void ComprasExistentes(List<Obra> listadeobras){ //verificar que pagado en la Obra, sea falso,ahora q mierda hago con esto 
       
    }


}
