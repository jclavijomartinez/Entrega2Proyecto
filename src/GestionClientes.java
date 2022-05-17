public class GestionClientes {
    //crear cliente
    public static Cliente crearCliente(String codigoCliente,long cedula,String nombre,String apellidos,String direccionEntrega,long telefono) {
        Cliente clienteAAgregar= new Cliente(codigoCliente, cedula, nombre, apellidos, direccionEntrega, telefono);
        return clienteAAgregar;
    }
}
