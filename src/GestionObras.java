import java.util.List;
import java.util.Scanner;

public class GestionObras {
    // crear obra
    static public Obra crearObra(long codigoObra, String titulo, int dia, int mes, int anio,float precioRef,String dimensiones,long codigoCompra,int diacompra, int mescompra, int aniocompra,boolean pagado,List<Artista> lista) {
        Obra obraAAgregar = new Obra(codigoObra,titulo,dia,mes,anio,precioRef,dimensiones,codigoCompra,diacompra,mescompra,aniocompra,pagado,lista);
        return obraAAgregar;
    }
    // crear artista
    static public Artista crearArtista( String codigoArtista, long cedula, String nombre, String apellido,int dia,int mes,int anio, long telefono,List<Obra> listaobras) {
        Artista artistaAagregar = new Artista(codigoArtista, cedula, nombre, apellido,dia,mes,anio, telefono,listaobras);
        return artistaAagregar;
    }

    //Eliminar Obra
    public static void EliminarObra(int codigo, List<Obra> listaObras, int codigoCompra) throws Exception {
        for (int i = 0; i < listaObras.size(); i++) {
            if (codigo==listaObras.get(i).getCodigoObra()) {
                System.out.println("Niceee, el codigo ingresado existe ");
            } else {
                throw new Exception();
            }
        }
        String confirm;
        for (int i = 0; i < listaObras.size(); i++) {
            if (codigoCompra==codigo) {
                System.out.println("El codigo se ha encontrado y procederá a eliminarse: ");
                try (Scanner scanner= new Scanner(System.in)){
                    System.out.println("desea eliminar el codigo? yes/not");
                    confirm=scanner.next();
                    if (confirm=="yes") {
                        System.out.println("La obra fue eliminada con éxito: ");
                    } else {
                        System.out.println("Hubo un fallo al eliminar la obra, revisa bien lo datos");
                    }
                } catch (Exception e) {
                   
                }
            } else {
                System.out.println("Verifique el código ingresado :)");
            }
        }
       

    }

}
