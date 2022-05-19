import java.util.*;
public class PantallaGaleria2 {
    public static ControlGaleria galeria = new ControlGaleria();
    public static ArrayList<Obra> listadeobras = new ArrayList<>();
    public static ArrayList<Artista> listadeartistas = new ArrayList<>();
    public static ArrayList<Cliente> listadeclientes = new ArrayList<>();
    public static ArrayList<Obra> listadeobrascompra = new ArrayList<>();
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String ruta = "infodeejemplo.txt";
            galeria.leertxtyllenarobras(ruta); //lee y agrega las obras y artistas a las listas
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
                        if (obra.getCompraObra().isPagado()==false) {
                            System.out.println("[" + cont + "]" + " nombre: " + obra.getTitulo() + " Fecha de creacion: "+ obra.getFecha().get(Calendar.DAY_OF_WEEK)+"/"+obra.getFecha().get(Calendar.MONTH)+"/"+obra.getFecha().get(Calendar.YEAR)+ " precio: " + obra.getPrecioRef());
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
                        listaobras = galeria.getlistaobras();
                        for (Obra obra : listaobras) {
                            if (obra.getCodigoObra()==codigoobra) {
                                try (Scanner quesemodifica = new Scanner(System.in)) {
                                    System.out.println("Aqui esta lo que puedes modificar:");

                                    System.out.println("1. codigo");
                                    System.out.println("2. titulo");
                                    System.out.println("3. dia de creacion");
                                    System.out.println("4. mes de creacion");
                                    System.out.println("5. anio de creacion");
                                    System.out.println("6. precio");
                                    System.out.println("7. alto");
                                    System.out.println("8. ancho");
                                    System.out.print("Qué quieres modificar?: ");
                                    int opcionp4 = quesemodifica.nextInt();
                                    switch (opcionp4) {
                                        case 1:
                                            System.out.print("Dame el nuevo codigo (debe ser algo como 000033, empieza en 0)");
                                            Long newcode = quesemodifica.nextLong();
                                            obra.setCodigoObra(newcode);
                                            break;
                                        case 2: 
                                            System.out.print("dame el titulo: ");
                                            String newtitle = quesemodifica.nextLine();
                                            obra.setTitulo(newtitle);
                                            break;
                                        case 3:
                                            System.out.print("dame el dia de creacion: ");
                                            int newday = quesemodifica.nextInt();
                                            obra.setFecha(newday, obra.getFecha().get(Calendar.MONTH), obra.getFecha().get(Calendar.YEAR));
                                            break;
                                        case 4:
                                            System.out.print("dame el mes de creacion: ");
                                            int newmonth = quesemodifica.nextInt();
                                            obra.setFecha(obra.getFecha().get(Calendar.DAY_OF_MONTH), newmonth, obra.getFecha().get(Calendar.YEAR));
                                            break;
                                        case 5:
                                            System.out.print("dame el anio de creacion: ");
                                            int newyear = quesemodifica.nextInt();
                                            obra.setFecha(obra.getFecha().get(Calendar.DAY_OF_MONTH), obra.getFecha().get(Calendar.MONTH), newyear);
                                            break;
                                        case 6:
                                            System.out.print("dame el precio: ");
                                            float newprice = quesemodifica.nextFloat();
                                            obra.setPrecioRef(newprice);
                                            break;
                                        case 7:
                                            System.out.print("dame el alto: ");
                                            int newheigth = quesemodifica.nextInt();
                                            obra.setPrecioRef(newheigth);
                                            break;
                                        case 8:
                                            System.out.print("dame el alto: ");
                                            int newwidth = quesemodifica.nextInt();
                                            obra.setPrecioRef(newwidth);
                                            break;
                                        default:
                                            break;
                                    }
                                } catch (NoSuchElementException e) {
                                    System.out.println("no existe ese parametro");
                                }
                            } else {
                                System.out.println("ese codigo no existe");
                            }
                        }
                    } catch (NoSuchElementException e) {
                        System.out.println("problema con la entrada");
                    }
                    break;

                default:
                    System.out.println("no reconozco esa opcion");
                    break;

                case 5:
                    break;

                case 6:
                
                break;
                case 7:
                int cont2 = 0;
                for (Cliente cliente : listadeclientes) {
                    System.out.println("[" + cont2 + "]" + "Cedula: " + cliente.getCedula() + " Nombre completo: " + cliente.getNombre() + " " + cliente.getApellidos() + " Direccion: "+ cliente.getDireccionEntrega() + " Telefono: " + cliente.getTelefono());
                    cont2++;
                }
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
                /*
                     int cont13 = 0;
                    for (Obra obracompra : listadeobrascompra) {
                        System.out.println("[" + cont13 + "]" + "Cliente:" + obracompra.setCompraObra(codigoCompra, dia, mes, anio, pagado));
                        cont13++;
                    }
                    
                break;
                */
                
                case 14:

              

                break;
                } //switch
                
                

               
            }//switch general
            catch(NoSuchElementException e){
            System.out.println("problema con elemento");
            }
            
        }//try general
    } //main   


