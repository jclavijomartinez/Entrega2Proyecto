import java.io.*;
import java.util.*;

public class ControlGaleria {
    //crear la coleccion de obras, se llama listaObras
    private static ArrayList<Obra> listaObras; 
    //crear la lista de artistas, se llama lista artistas
    private static ArrayList<Artista> listaArtistas;
    // dato de tipo gestionobras para acceder a la creacion de artistas y obras
    GestionObras gestionobras = new GestionObras();
    // leer los datos del txt y agregarlos a la obra
    GestionClientes gesticlientes = new GestionClientes();
    public void leertxtyllenarobras(String ruta) {
        File entradatxt = new File(ruta);
        try (FileReader fr = new FileReader(ruta)) {
            try (Scanner lectura = new Scanner(entradatxt)) {
                BufferedReader bf =new BufferedReader(fr);
                Long cantlin = bf.lines().count();
                String linea = lectura.nextLine(); //linea de encabezado
                for (int i = 1; i < cantlin; i++) {
                    String lineai = lectura.nextLine();
                    String[] contenidoObras = lineai.split("-");
                    
                }
            } catch (FileNotFoundException e) { //excepcion del scanner
                System.out.println("el archivo no existe revisa");
            }
        } catch (IOException e) { //excepcion del filereader
            System.out.println("hay un problema con el archivo");
        }
    }
    public void agregarObra(Obra nuevaobra) {
        listaObras.add(nuevaobra);
    }
}
