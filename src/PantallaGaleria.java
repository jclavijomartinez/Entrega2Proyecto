import java.util.*;

public class PantallaGaleria {
    public static ControlGaleria galeria = new ControlGaleria();
    public static ArrayList<Obra> listadeobras = new ArrayList<>();
    public static ArrayList<Artista> listadeartistas = new ArrayList<>();
    public static ArrayList<Cliente> listadeclientes = new ArrayList<>();
    public static ArrayList<Obra> listadeobrascompra = new ArrayList<>();
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
                 //listadeartistas
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
     //wtf                                   
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
                /*
                    //Modificar datos cliente
                try (Scanner  modificarcliente = new Scanner(System.in)) {
                System.out.println("Dame el codigo del cliente a modificar");
                    String codigoCliente = modificarcliente.nextLine();
                    ArrayList<Cliente> listadeclientes = new ArrayList<>();
                    for (Cliente cliente : listadeclientes) {
                        if(!(cliente.getCodigoCliente() == codigoCliente)){
                            System.out.println("no puedo modificar este cliente, no existe!");
                            break;
                        } else {
                               for (int i = 0; i < listadeclientes.size(); i++) {
                                    System.out.println("Aqui puedes modificar la obra, puedes modificar:");
                                        System.out.println("1. Código ");
                                        System.out.println("2. Cedula");
                                        System.out.println("3. Nombre");
                                        System.out.println("4. Apellidos");
                                        System.out.println("5. Direccion de Entrega");
                                        System.out.println("6. Telefono");
                                        System.out.print("Que quieres modificar: ");
                                        int opcionmod = modificarcliente.nextInt();
                                        switch (opcionmod) {
                                            case 1:
                                                System.out.print("Dame el nuevo codigo: ");
                                                String nuevocod = modificarcliente.nextLine();
                                                if (nuevocod!=listadeclientes.get(i).getCodigoCliente()) {
                                                    listadeclientes.get(i).setCodigoCliente(nuevocod);
                                                } else {
                                                    System.out.println("el codigo nuevo no puede ser igual al anterior");
                                                }
                                            break;

                                            case 2 :
                                                System.out.print("dame la nueva Cedula: ");
                                                Long nuevaCedula = modificarcliente.nextLong();
                                                listadeclientes.get(i).setCedula(nuevaCedula);
                                                

                                            break;

                                            
                                            case 3:
                                                System.out.print("dame el nuevo Nombre: ");
                                                String nuevoNombre = modificarcliente.nextLine();
                                                listadeclientes.get(i).setNombre(nuevoNombre);
                                                

                                            break;


                                            case 4:
                                                System.out.print("dame el nuevo Apellido: ");
                                                String nuevoApellido = modificarcliente.nextLine();
                                                listadeclientes.get(i).setApellidos(nuevoApellido);

                                            break;


                                            case 5:
                                                System.out.print("dame la nueva Direccion de Entrega: ");
                                                String nuevaDireccionEntr = modificarcliente.nextLine();
                                                listadeclientes.get(i).setDireccionEntrega(nuevaDireccionEntr);

                                            break;


                                            case 6:
                                                System.out.print("dame el nuevo Telefono: ");
                                                Long nuevoTelefon = modificarcliente.nextLong();
                                                listadeclientes.get(i).setTelefono(nuevoTelefon);

                                            break;



                                        
                                            default:
                                                break;
                                        }
                                   
                               }
                    
                    }   
                        }
                        
                        
                    }catch (NoSuchElementException e) {
                    System.out.println("no reconozco esa opcion");
                }

                break;

*/

                case 10:
                break;

                case 11:
                break;


                case 12:
                break;

                case 13:
                     int cont13 = 0;
                    for (Obra obracompra : listadeobrascompra) {
                        System.out.println("[" + cont13 + "]" + "Cliente:" + obracompra.setCompraObra(codigoCompra, dia, mes, anio, pagado));
                        cont13++;
                    }
                    
                break;
                
                } //switch
                
                

               
            }//try general
            catch(NoSuchElementException e){
            System.out.println("problema con elemento");
            }
        }//main
        
        
        
}//clase

