import java.util.*;
public class PantallaGaleria {
    //public ControlGaleria informacion;
    try (Scanner entrada = new Scanner(System.in)) {
        int opcion = 0;
        entrada.nextInt();
    } catch (NoSuchElementException e) {
        System.out.println("esa opcion no esta en la lista");
    } catch (InputMismatchException e) {
        System.out.println("algo");
    }
}
