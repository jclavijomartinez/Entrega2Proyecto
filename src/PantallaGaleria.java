import java.util.*;

public class PantallaGaleria {
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
            long codigoCompra;
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
                   int escoje;
                System.out.println("por que método quieres buscar?");
                System.out.println("Titulo: 1");
                System.out.println("Artista: 2");
                System.out.println("Obra: 3");
                escoje=escoje.nextInt;
                
                    
                    

                     GestionObras buscarobra= new GestionObras();
                     List<Obra> listaobra=new ArrayList<>();
                     List<Artista> buscarartista=new ArrayList<>();
                     listaobra=buscarobra.crearobras();
                     buscarartista=buscarobra.crearartistas();
                    try(Scanner criterio = new Scanner(System.in)){
                        int opc=0;

                        System.out.println("Dime como quieres buscar tu obra");
                        System.out.println("Titulo: 1");
                        System.out.println("Artista: 2");
                        System.out.println("Anio: 3");
                        opc=criterio.nextInt();
                        if(opc==1){
                            String titulo;
                            System.out.println("Dame el titulo por el lcual quieres buscar:");
                            titulo=criterio.nextLine();
                            for(int i=0; i<buscarobra.size;i++){
                                if(buscarartista.get(i).getTitulo()==Titulo){
                                    System.out.println("["+i+"]"+"El titulo es:"+buscarobra.get(i).getTitulo()+"fecha de creacion: "+listaobra.get(i).getFecha()+"El precio de referencia: "+listaobra.get(i).getprecioRef()+"Dimensiones: "+listaobra.get(i).getDimensiones());
                                }
                            }

                        }
                        if(opc==2)
                        {
                            String artista;
                            System.out.println("Dame el artista que quieres buscar: ");
                            artista=criterio.nextLine();
                            for(int i=0;i<lis;i++){
                                if(artista.get(i).getNombre()==artista){

                                    System.out.println("["+i"]"+"Codigo: "+ artista.get(i).getcodigoartista()+"Cedula: "+ artista.get(i).getcedula()+"Nombre: "+ artista.get(i).getNombre()+"Apellido: "+artista.get(i).getApellido()+" Fecha de nacimento: "+ artista.get(i).getFechaNacimiento()+"Telefono: "+artista.get(i).getTelefono());
                                }
                            }
                        }
                        if(opc==3){
                             

                            System.out.println("Dame el year por el cual deseas buscar: ");
                            year=Scanner.nextInt();
                            for(int i =0;i<listaobra.size();i++){
                                if(artista.get(i).getFecha().YEAR==year){
                                    System.out.println("["+i+"]"+"Titulo: "+ astista.get(i).getTitulo()+"Fecha de creacion: " + artista.get(i).getFecha().YEAR+ "/"+ artista.get(i).getFecha().MONTH+"/"+ artista.get(i).getFecha().DATE+"Precio de referencia: "+ artista.get(i).getprecioRef()+" En COP, sus dimensiones son: "+artista.get(i).getDimensiones());
                                }
                            }
                        }
                    

                    }
                            catch (InputMismatchException e) {
                                System.out.println("revisa el dato que ingresaste");
                            } catch (NoSuchElementException e) {
                                System.out.println("revisa lo que ingresaste");
                            }
  
                    break;
                case 3:
                    List<Artista> listadeartistas = galeria.getlistaartistas();
                    //List<Obra> listaobras = new 
                        int siesta1 = 0;
                        int cont1 = 0;
                        int cantidadaDSinArtista = 0;
                        int NumeroTempoSinArtista;
                        int cantidadaDConArtista = 0;
                        int NumeroTempoConArtista; 
                    
                            // mostrar los artistas disp.
                            for (Artista artistas : listadeartistas) 
                            {
                                System.out.println("["+cont1+"]"+"nombre: " + artistas.getNombre() + " apellidos: " + artistas.getApellido()+ " cedula: " + artistas.getCedula());
                                cont1++;
                            }
                                System.out.print("el artista que hizo la obra nueva está en esta lista? ");
                                siesta1 = entrada.nextInt();
                    if (siesta1 == 1) 
                    {
                        try (Scanner nuevaobra = new Scanner(System.in)) 
                        {
                            System.out.print("Dame el codigo de la nueva obra (EL CODIGO DEBE TENER 7 DIGITOS");
                            String codigoObraNuevaSinArtista= nuevaobra.nextLine();
                            System.out.print("Dame el titulo de la nueva obra: ");
                            String tituloObraNuevaSinArtista = nuevaobra.nextLine();
                            System.out.print("Dame el dia de creacion de la nueva obra: ");
                            int diaObraNuevaSinArtista = nuevaobra.nextInt();
                            System.out.print("Dame el mes de creacion de la nueva obra: ");
                            int mesObraNuevaSinArtista = nuevaobra.nextInt();
                            System.out.print("Dame el year de creacion de la nueva obra: ");
                            int yearObraNuevaSinArtista = nuevaobra.nextInt();
                            System.out.print("Dame el precio de la nueva obra: ");
                            Float precioObraNuevaSinArtista = nuevaobra.nextFloat();
                            System.out.print("Dame las dimensiones de la nueva obra: (alto) ");
                            int altoObraNuevaSinArtista = nuevaobra.nextInt();
                            System.out.print("Dame las dimensiones de la nueva obra: (ancho) ");
                            int anchoObraNuevaSinArtista = nuevaobra.nextInt();
                            // crear una nueva obra
                            Obra obraAAgregar = new Obra(Long.parseLong(codigoObraNuevaSinArtista) , tituloObraNuevaSinArtista, diaObraNuevaSinArtista, mesObraNuevaSinArtista,yearObraNuevaSinArtista, precioObraNuevaSinArtista, altoObraNuevaSinArtista,anchoObraNuevaSinArtista, 5, 1, 1, 1854, false,listadeartistas);
                            galeria.agregarObra(obraAAgregar);
                            //INTENTO DE VER LA CANTIDAD DE DIGITOS//
                            if(codigoObraNuevaSinArtista.length()==7)
                            {
                                System.out.print("El codigo de la obra ha sido aceptado ");
                            }
                                else
                                {
                                System.out.print("Revisa el codigo de la obra ");
                                }
                        

                           
                                        for (Artista artistas : listadeartistas) 
                                        {
                                            if(codigoObraNuevaSinArtista == artistas.getCodigoArtista())
                                            {

                                                System.out.println("El codigo ya existe ");
                                            }
                                        } }}               
                        
                           else {
                                    System.out.println("Datos Artista: ");
                                    try (Scanner  nuevoartista  = new Scanner(System.in)) 
                                    {
                                        System.out.print("Dame el Codigo del artista: ");
                                        String codigoArtista = nuevoartista.nextLine();
                                        System.out.print("Dame la cedula del artista: ");
                                        Long cedula = nuevoartista.nextLong(); 
                                        System.out.print("Dame el Nombre del artista: ");
                                        String nombre = nuevoartista.nextLine();
                                        System.out.print("Dame el Apellido del artista: ");
                                        String apellido = nuevoartista.nextLine();
                                        System.out.print("Dame el dia de necimiento del artista ");
                                        int dianac = nuevoartista.nextInt();
                                        System.out.print("Dame el mes de necimiento del artista ");
                                        int mesnac = nuevoartista.nextInt();
                                        System.out.print("Dame el year de necimiento del artista ");
                                        int ynac = nuevoartista.nextInt(); 
                                        System.out.print("Dame el telefono del artista ");
                                        Long tel = nuevoartista.nextLong();
                                        Artista artistaAAgregar = new Artista(codigoArtista, cedula, nombre, apellido, dianac, mesnac, ynac, tel);
                                        
                                        System.out.println("Datos Obra con artista: ");    
                                            try (Scanner nuevaobra = new Scanner(System.in)) 
                                            {
                                                System.out.print("Dame el codigo de la nueva obra (EL CODIGO DEBE TENER 7 DIGITOS");
                                                String codigoObraNuevaConArtista= nuevaobra.nextLine();
                                                System.out.print("Dame el titulo de la nueva obra: ");
                                                 String tituloObraNuevaConArtista = nuevaobra.nextLine();
                                                    System.out.print("Dame el dia de creacion de la nueva obra: ");
                                                            int diaObraNuevaConArtista = nuevaobra.nextInt();
                                                    System.out.print("Dame el mes de creacion de la nueva obra: ");
                                                    int mesObraNuevaConArtista = nuevaobra.nextInt();
                                                    System.out.print("Dame el year de creacion de la nueva obra: ");
                                                    int yearObraNuevaConArtista = nuevaobra.nextInt();
                                                    System.out.print("Dame el precio de la nueva obra: ");
                                                    Float precioObraNuevaConArtista = nuevaobra.nextFloat();
                                                    System.out.print("Dame las dimensiones de la nueva obra: (altoxancho) ");
                                                    String dimsObraNuevaConArtista = nuevaobra.nextLine();
                                                        // crear una nueva obra
                                                        Obra obraAAAgregar = new Obra(Long.parseLong(codigoObraNuevaConArtista), tituloObraNuevaConArtista, diaObraNuevaConArtista, mesObraNuevaConArtista,yearObraNuevaConArtista, precioObraNuevaConArtista, dimsObraNuevaConArtista, 5, 1, 1, 1854, false);
                                                        galeria.agregarObra(obraAAAgregar);
                                                        //INTENTO DE VER LA CANTIDAD DE DIGITOS//
                                                    //Length
                                                    if(codigoObraNuevaConArtista.length()==7)
                                                    {
                                                        System.out.print("El codigo de la obra a sido aceptado ");
                                                    }
                                                    else
                                                    {
                                                        System.out.print("Revisa el codigo de la obra ");
                                                    }

                           
                                                        for (Artista artistas : listadeartistas)
                                                        {
                                                            if(codigoObraNuevaSinArtista == artistas.getCodigoArtista())
                                                            {

                                                                System.out.println("El codigo ya existe ");
                                                            }
                                                        }
                                            }catch (InputMismatchException  e) {
                                                System.out.println("revisa el dato que escribiste!");
                                                }                    
                                                    } catch (NoSuchElementException  e) {
                                                    System.out.println("revisa el dato que escribiste!");
                                                }
                    
                    

                            }
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
                try(Scanner enentrada5=new Scanner(System.in)){
                    System.out.println("dime el codigo de la obra a eliminar: ");
                    Long codigo=enentrada5.nextLong();
                    System.out.println("Ahora dame el codigo de la compra de la obra: ");
                     codigoCompra=enentrada5.nextInt();
                    for (Obra obra : listadeobras) {
                        if (codigo==obra.getCodigoObra()&&codigoCompra==obra.getCompraObra().getCodigoCompra()) {
                            listadeobras.remove(obra);
                        }
                    }
                    
                    }
                    catch(NoSuchElementException e){
                        System.out.println("Sorry la obra no existe o un codigo quedó mal escrito ");
                    }
                    break;
                case 6:
                    int cont2 = 0;
                    for (Cliente cliente : listadeclientes) {
                        System.out.println("[" + cont2 + "]" + "Cedula: " + cliente.getCedula() + " Nombre completo: " + cliente.getNombre() + " " + cliente.getApellidos() + " Direccion: "+ cliente.getDireccionEntrega() + " Telefono: " + cliente.getTelefono());
                        cont2++;
                    }
                    break;
                case 7:
                    try (Scanner entrada7=new Scanner(System.in)) {
                        System.out.println("dame el codigo del cliente: ");
                        String codigobuscar = entrada7.nextLine();
                        for (Cliente cliente : listadeclientes) {
                            if (codigobuscar == cliente.getCodigoCliente()) {
                                System.out.println("Nombre: "+cliente.getNombre()+" cedula: "+cliente.getCedula());
                            }else {
                                System.err.println("el codigo no tiene un clienterelacionado");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("no reconozco lo que ingresaste");
                    }

                    break;
                case 8:
                try(Scanner entrada7 =new Scanner(System.in)){

                String codModificar;

                System.out.println("Pasame el codigo del lcliente que deseas modificar: ");
                codModificar=entrada7.nextLine();

                for (Cliente cliente : listadeclientes) {
                    
                                    if(codModificar!=cliente.getCodigoCliente()){
                                    System.out.println("El codigo no existe :( crea uno primero");
                    
                                    }
                                        else{
                                            for(int i=0; i<listadeclientes.size();i++){
                                                listadeclientes.get(i);
                                            }
                                        }
                }



                }catch(Exception e){
                System.out.println("algo salio mal con el codigo revisalo e intenta de nuevo");
                }
                break;

                case 9:
                
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

 

                case 10:
                
                    //////Eliminar cliente 
                    for (Cliente cliente : listadeclientes) {
                    try (Scanner entrada12 = new Scanner(System.in)) {
                        System.out.println("dame el codigo: ");
                        String codigoaremover = entrada12.nextLine();
                        if (cliente.getCodigoCliente()==codigoaremover) {
                            listadeclientes.remove(cliente);
                        }
                    } catch (Exception e) {
                        System.out.println("no entiendo el codigo!");
                    }
                }
    
                break;

                case 11:
                try(Scanner entrada6 = new Scanner(System.in)){
                     Compra compraCliente;

                    long cedula2, telefono2;

                     String nombre2, apellidos2, direccionEntrega2,codigoObra2, codigoCompra2;
                     Long codigoCliente2;
                     Calendar fechaCompra2= Calendar.getInstance();
                     Boolean pagado2;
                    GestionClientes administrarCliente=new GestionClientes();

                     Cliente nuevoCliente;
                     Obra nuevaObra;

                    System.out.println("Dame el codigo del cliente que quieres insertar");
                    codigoCliente2=entrada6.nextLong();

                    System.out.println("Dame el codigo de la obra que quieres insertar");
                    codigoObra2=entrada6.nextLine();

                    System.out.println("Dame el codigo de la compra:");
                    codigoCompra2=entrada6.nextLine();

                    System.out.println("Dame la fecha de la compra anio/mes/dia: ");
                    int dia;
                    int mes;
                    int anio;
                    fechaCompra2.set(anio, mes, dia);

                    System.out.println("pagaste el producto?: true/false");
                    pagado2=entrada6.nextBoolean();
                    List<Compra>lcompra=new ArrayList<Compra>();

                   Cliente codigoCliente3=new Cliente("65498794", 32169887, "pedro", "julio", "calle 7", 9873165);

                    for(int i=0;i<lcompra.size();i++){
                            
                         if(lcompra.get(i).equals(codigoCompra2) &&lcompra.get(i).getFechaCompra()/*YEAR*/==fechaCompra2 && lcompra.get(i).getFechaCompra()/*MONTH*/==fechaCompra2 && lcompra.get(i).equals(pagado2) )
                        {
                                System.out.println("La compra ya existe ");
                        }else
                        {
                                System.out.println("La compra no se ha hecho");
                                boolean pagado;
                                compraCliente=new Compra( codigoCompra, dia,  mes,  anio,  pagado);

                        }

    }


                        }catch(Exception e){
                            System.out.println("Resivisa los datos ingresados");
                        }
                break;
                case 12:
                for (Obra obra : listadeobras) {
                    try (Scanner entrada12 = new Scanner(System.in)) {
                        System.out.println("dame el codigo: ");
                        Long codigoaremover = entrada12.nextLong();
                        if ( obra.getCompraObra().getCodigoCompra()==codigoaremover) {
                            obra.getCompraObra().setCodigoCompra(00000l);
                        }
                    } catch (Exception e) {
                        System.out.println("no entiendo el codigo!");
                    }
                }
                 
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
                /*
                    int year, month;

                    Compra listaVerCompras=new GestionClientes();

                    List<Compra>ListaImprimir=new ArrayList<>();


                    System.out.println("En que anio hiciste la compra?");
                    year=scanner.nextInt();

                    System.out.println("En que mes hiciste la compra?");
                    month=scanner.nextInt();


                    for (int i=0; i<ListaImprimir.size();i++){
                        if(ListaImprimir.get(i).getFechaCompra().YEAR==year&&ListaImprimir.get(i).getFechaCompra().MONTH==month){
                            System.out.println("["+i+"]"+"listado de obras: "+ListaImprimir().get(i)+"Cliente que la compro: "+listadeclientes().get(i)+"fecha de compra: "+listaVerCompras().get(i));
                        }
                        else{
                            Sytem.out.println("No coinciden las fechas ingresadas con la compra, verifique y vuelva a intentar");
                        }
                        
                    } 

                */
              

                break;
                case 15:
                //por tiempo no se pudo completar
                break;
                } //switch
                
                
                

               
            }//switch general
            catch(NoSuchElementException e){
            System.out.println("problema con elemento");
            }
            
        }// try general
} // main
