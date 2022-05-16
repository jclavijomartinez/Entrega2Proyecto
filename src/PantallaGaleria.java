import java.util.*;
public class PantallaGaleria {
    private ControlGaleria galeria;

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String ruta = "D:\\UNIVERSIDAD\\2210\\progaramacion avanzada\\ProytectoEntrega2\\ejemplodeinfo.txt";
            ControlGaleria test1 = new ControlGaleria();
            test1.leertxtyllenarobras(ruta);
            /*
            int opcion = 0;
            System.out.println("¡TE DAMOS LA BIENVENIDA A LA GALERÍA! estas son las opciones que puedes elegir");
            System.out.println("1. leer datos desde archivo");
            System.out.println("2. ver listado de obras disponibles");
            System.out.print("¿Que quieres hacer?: ");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    break;
                default:
                    System.out.println("no reconozco esa opcion");
                    break;
                }
                */
        } catch (NoSuchElementException e) {
            System.out.println("problema con elemento");
        }
    }

    public ControlGaleria getGaleria() {
        return galeria;
    }

    public void setGaleria(ControlGaleria galeria) {
        this.galeria = galeria;
    }
}
