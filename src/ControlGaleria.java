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
    public void leertxtyllenarobras(String ruta) {
        File entradatxt = new File(ruta);
        try (FileReader fr = new FileReader(ruta)) {
            try (Scanner lectura = new Scanner(entradatxt)) {
                BufferedReader bf =new BufferedReader(fr);
                Long cantlin = bf.lines().count();
                lectura.nextLine();//linea de inicio
                listaDeObras.clear(); //limpieza de las listas, para que no acumulen basura
                listaDeArtistas.clear();
                listaDeClientes.clear();//fin limpieza
                for (int i = 1; i < cantlin; i++) { 
                    String[] datos =lectura.nextLine().split(" - ");
                    char primerdig = datos[0].charAt(0);
                    if (primerdig == '0') {
                        List<Artista> testlist = new ArrayList<>();
                        Obra nuevaObra = new Obra(Long.parseLong(datos[0]),datos[1],Integer.parseInt(datos[2]),Integer.parseInt(datos[3]),Integer.parseInt(datos[4]),Float.parseFloat(datos[5]),Integer.parseInt(datos[6]),Integer.parseInt(datos[7]),Long.parseLong(datos[8]),Integer.parseInt(datos[9]),Integer.parseInt(datos[10]),Integer.parseInt(datos[11]),Boolean.parseBoolean(datos[12]),testlist);
                        this.agregarObra(nuevaObra);
                    } else if(primerdig == '1') {
                        List<Obra> testlist = new ArrayList<>();
                        //String codigoArtista, long cedula, String nombre, String apellido,int dia,int mes,int anio, long telefono,List<Obra> listaobras
                        Artista newArtista = new Artista(datos[0], Long.parseLong(datos[1]), datos[2], datos[3],Integer.parseInt(datos[4]),Integer.parseInt(datos[5]),Integer.parseInt(datos[6]),Long.parseLong(datos[7]), testlist);
                        this.agregarArtista(newArtista);
                    } else if(primerdig == '2') {
                        //String codigoCliente,long cedula,String nombre,String apellidos,String direccionEntrega,long telefono
                        Cliente nuevoCliente = new Cliente(datos[0], Long.parseLong(datos[1]),datos[2] , datos[3], datos[4],Long.parseLong(datos[5]));
                        this.agregarClientes(nuevoCliente);
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
                System.out.println("El codigo se ha encontrado y proceder?? a eliminarse: ");
                try (Scanner scanner= new Scanner(System.in)){
                    System.out.println("desea eliminar el codigo? yes/not");
                    confirm=scanner.next();
                    if (confirm=="yes") {
                        System.out.println("La obra fue eliminada con ??xito: ");
                    } else {
                        System.out.println("Hubo un fallo al eliminar la obra, revisa bien lo datos");
                    }
                } catch (Exception e) {
                   
                }
            } else {
                System.out.println("Verifique el c??digo ingresado :)");
            }
        }
       

    }
    //Eliminar cliente
    public static void EliminarCliente( List<cliente> listadeclientes) throws Exception {
        int codigo;
        System.out.println("Ingresa el codigo del cliente a eliminar ");
        for (int i = 0; i < listadeclientes.size(); i++) {
            if (codigo==listadeclientes.get(i).getCodigoCliente()) {
                System.out.println("El codigo ingresado existe ");
            } else {
                throw new Exception();
            }
        }
        String confirm;
        for (int i = 0; i < listadeclientes.size(); i++) {
            if (codigo==listadeclientes.get(i).getCodigoCliente()) {
                System.out.println("El codigo se ha encontrado y proceder?? a eliminarse: ");
                try (Scanner scanner= new Scanner(System.in)){
                    System.out.println("desea eliminar el codigo? yes/not");
                    confirm=scanner.next();
                    if (confirm=="yes") {
                        System.out.println("El cliente fue eliminado con ??xito: ");
                    } else {
                        System.out.println("Hubo un fallo al eliminar el cliente, revisa bien lo datos");
                    }
                } catch (Exception e) {
                   
                }
            } else {
                System.out.println("Verifique el c??digo ingresado :)");
            }
        }
       

    }
       //Eliminar Compra Obra/
    public static void EliminarCompraObra(List<Obra> listadeobrascompra) throws Exception {
        int codigo1; 
        System.out.println("Ingresa el codigo de la compra a eliminar ");
        for (int i = 0; i < listadeobrascompra.size(); i++) {
            if (codigo1==listadeobrascompra.get(i).getCodigoCompra()) {
                System.out.println("Niceee, el codigo ingresado existe ");
            } else {
                throw new Exception();
            }
        }
        String confirm;
        for (int i = 0; i < listadeobrascompra.size(); i++) {
            if (codigoCompra==codigo1) {
                System.out.println("El codigo se ha encontrado y proceder?? a eliminarse: ");
                try (Scanner scanner= new Scanner(System.in)){
                    System.out.println("desea eliminar el codigo? yes/not");
                    confirm=scanner.next();
                    if (confirm=="yes") {
                        System.out.println("La compra fue eliminada con ??xito: ");
                    } else {
                        System.out.println("Hubo un fallo al eliminar la compra, revisa bien lo datos");
                    }
                } catch (Exception e) {
                   
                }
            } else {
                System.out.println("Verifique el c??digo ingresado :)");
            }
        }
       

    }

                    
                    
}
