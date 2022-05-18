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
    GestionClientes gesticlientes = new GestionClientes();
    public void leertxtyllenarobras(String ruta) {
        File entradatxt = new File(ruta);
        try (FileReader fr = new FileReader(ruta)) {
            try (Scanner lectura = new Scanner(entradatxt)) {
                BufferedReader bf =new BufferedReader(fr);
                Long cantlin = bf.lines().count();
                for (int i = 1; i < cantlin; i++) { 
                    String[] datos =lectura.nextLine().split(" - ");
                    char primerdig = datos[0].charAt(0);
                    if (primerdig == '0') {
                        List<Artista> testlist;
                        //float,String,long,int, int, int,
                        Obra nuevaObra = new Obra(Long.parseLong(datos[0]), datos[1],Integer.parseInt(datos[2]) ,Integer.parseInt(datos[3]),Integer.parseInt(datos[4]),datos[5],datos[6],datos[7],Integer.parseInt(datos[7]),Integer.parseInt(datos[8]),Boolean.parseBoolean(datos[9]) ,testlist);
                        this.agregarObra(nuevaObra);
                    } else if(primerdig == '1') {
                    } else if(primerdig == '2') {
                    } else if(primerdig == '3') {
                        
                    } 
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
    public ArrayList<Obra> getlistaobras() {
        return listaDeObras;
    }
    public ArrayList<Artista> getlistaartistas() {
        return listaDeArtistas;
    }
    public void llenarobras(String[] DATA) {
        //recibir el string[] y procesar con los códigos para comparar y llenar las listas
    }
    public void escribirEnArchivo(String ruta) {
        File entradatxt = new File(ruta);
        try (FileWriter fw = new FileWriter(entradatxt)) {
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            out.println("texto");
        } catch (IOException e) {
            System.out.println("problema al usar el archivo, revisa");
        }
    }
}
