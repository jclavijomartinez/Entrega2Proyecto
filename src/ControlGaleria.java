import java.io.*;
import java.util.*;

public class ControlGaleria {
    //crear la coleccion de obras, se llama listaDeObras
    private static ArrayList<Obra> listaDeObras = new ArrayList<>(); 
    //crear la lista de artistas, se llama listaDeArtistas
    private static ArrayList<Artista> listaDeArtistas = new ArrayList<>();
    //crear la lista de clientes, se llama listaDeClientes
    private static ArrayList<Cliente> listaDeClientes = new ArrayList<>();
    // dato de tipo gestionobras para acceder a la creacion de artistas y obras
    GestionObras gestionobras = new GestionObras();
    // dato de tipo gestionclientes para acceder a la creacion de clientes
    GestionClientes gestionClientes = new GestionClientes();
    // leer los datos del txt y agregarlos a la obra
    public void leertxtyllenarobras(String ruta) {
        File entradatxt = new File(ruta);
        try (FileReader fr = new FileReader(ruta)) {
            try (Scanner lectura = new Scanner(entradatxt)) {
                BufferedReader bf =new BufferedReader(fr);
                Long cantlin = bf.lines().count();
                String linea = lectura.nextLine(); //linea de encabezado
                for (int i = 1; i < cantlin; i++) {
                    String lineai = lectura.nextLine();
                    //lectura de obras
                    System.out.println(lineai);
                }
            } catch (FileNotFoundException e) { //excepcion del scanner
                System.out.println("el archivo no existe revisa");
            }
        } catch (IOException e) { //excepcion del filereader
            System.out.println("hay un problema con el archivo");
        }
    }
    public void agregarObra(Obra nuevaobra) {
        listaDeObras.add(nuevaobra);
    }
    public void agregarArtista(Artista nuevoArtista) {
        listaDeArtistas.add(nuevoArtista);
    }
    public void agregarClientes(Cliente nuevoCliente) {
        listaDeClientes.add(nuevoCliente);
    }
}
