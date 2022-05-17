import java.util.*;

public class PantallaGaleria {
    public static ControlGaleria galeria = new ControlGaleria();
    public static ArrayList<Obra> listadeobras = new ArrayList<>();
    public static ArrayList<Artista> listadeartistas = new ArrayList<>();
    public static ArrayList<Cliente> listadeclientes = new ArrayList<>();
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String ruta = "D:\\UNIVERSIDAD\\2210\\progaramacion avanzada\\ProytectoEntrega2\\ejemplodeinfo.txt";
            int opcion = 0;
            System.out.println("¡TE DAMOS LA BIENVENIDA A LA GALERÍA! estas son las opciones que puedes elegir");
            System.out.println(" 1. Ver listado de Obras disponibles ");
            System.out.println(" 2. Buscar una Obra por titulo. artista o anio ");
            System.out.println(" 3. Insertar Obrar ");
            System.out.println(" 4. Modificar Obra ");
            System.out.println(" 5. Eliminar Obra ");
            System.out.println(" 6. Ver listado de Clientes registrados en el sistema");
            System.out.println(" 7. Buscar un Cliente ");
            System.out.println(" 8. Insertar Cliente ");
            System.out.println(" 9. Modificar los datos del Cliente ");
            System.out.println(" 10. Eliminar un Cliente ");
            System.out.println(" 11. Relizar compra de una Obra ");
            System.out.println(" 12. Eliminar compra de Obra ");
            System.out.println(" 13. Ver listado de Compras existentes");
            System.out.println(" 14. Ver listado de Compras para un mes y anio especifico insertado por el usuario ");
            System.out.println(" 15. Ver listado de Artistas mas vendidos ");
            System.out.print("¿Que quieres hacer?: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    listadeobras = galeria.getlistaobras();
                    int cont = 0;
                    for (Obra obra : listadeobras) {
                        if (!(obra.getCompraObra().isPagado())) {
                            System.out.println("[" + cont + "]" + "nombre: " + obra.getTitulo() + " fecha de creacion: "+ obra.getFecha() + " precio: " + obra.getDimensiones());
                            cont++;
                        }
                    }
                    break;
                case 2:
                  listadeartistas.
                    break;
                case 3:
                    break;
                case 4:
                    try (Scanner modificarobra = new Scanner(System.in)) {
                        System.out.print("Dame el codigo de la obra a modificar: ");
                        Long codigoobra = modificarobra.nextLong();
                        ArrayList<Obra> listaobras = new ArrayList<>();
                        for (Obra obra : listaobras) {
                            if (!(obra.getCodigoObra() == codigoobra)) {
                                System.out.println("no puedo modificar esa obra, no existe!");
                            } else {
                                try (Scanner nuevaentrada = new Scanner(System.in)) {
                                    System.out.print("Dame el codigo de la obra: ");
                                    Long codigo = nuevaentrada.nextLong();
                                    for (Obra obra2 : listaobras) {
                                        
                                    }
                                } catch (NoSuchElementException e) {
                                    System.out.println("no reconozco esa opcion");
                                }
                            }
                        }
                    } catch (NoSuchElementException e) {
                        System.out.println("no reconozco esa opcion");
                    }
                    break;

                default:
                    System.out.println("no reconozco esa opcion");
                    break;

                case 5:
                    break;

                case 6:
                    int cont2 = 0;
                    for (Cliente cliente : listadeclientes) {
                        System.out.println("[" + cont2 + "]" + "Cedula: " + cliente.getCedula() + " Nombre completo: " + cliente.getNombre() + " " + cliente.getApellidos() + " Direccion: "+ cliente.getDireccionEntrega() + " Telefono: " + cliente.getTelefono());
                        cont2++;
                    }
                    break;

                case 7:
                break;

                case 8:
                break;

                case 9:
                //Modificar datos cliente
                System.out.println("Dame el codigo del cliente a modificar");
                
                break;
            }
        } catch (NoSuchElementException e) {
            System.out.println("problema con elemento");
        }
    }
}
