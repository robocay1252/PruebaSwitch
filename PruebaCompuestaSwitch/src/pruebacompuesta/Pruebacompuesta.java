package pruebacompuesta;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Considerando un rango entre 1 y 10 para asignar la nota de un curso, el
 * programa ilustra la selección múltiple con la sentencia switch.
 *
 */

public class Pruebacompuesta {
    int nota;
      Scanner entrada = new Scanner(System.in);
     
    public void PruebaCom(){
        
          System.out.print("Introduzca calificación (1 - 10), pulse Intro:");
        nota = entrada.nextInt();
        
        switch (nota) {
            case 10:
                System.out.println("Super excelente");
                break;
            case 9:
                System.out.println("Excelente.");
                break;
            case 8:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable.");
                break;
            case 6:
                System.out.println("Aprobado.");
            case 5:
                System.out.println("Reprobado.");
                break;
            case 4:
                System.out.println("Reprobado.");
                break;
            case 3:
                System.out.println("Reprobado.");
                break;
            case 2:
                System.out.println("Reprobado.");
                break;
            case 1:
                System.out.println("Reprobado.");
                break;
            case 0:
                System.out.println("Suspendido.");
                break;
            default:
                System.out.println("no es posible esta nota.");
        }
        System.out.println("Final de programa.");
        
        
    }

    public static void main(String[] args) {
      Pruebacompuesta PruebaCom = new  Pruebacompuesta ();
      PruebaCom.PruebaCom();
    }
}
