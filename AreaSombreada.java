import java.util.Scanner;
/**
 * Programa que realiza la conversión de unidades de medida a pulgadas.
 * 
 * @author (Mario Esteban Dorado Sánchez) 
 * @version (23/02/2020)
 */
public class AreaSombreada
{
   public static void main(String[] args){
       //se define las variables
        double r, l1cu, l2cu;
        double areasomb;

        //Se solicita informacion ala usuario

        Scanner Teclado = new Scanner (System.in);

        System.out.println("Ingrese el valor del radio del circulo: ");

        r = Teclado.nextDouble();

        //Se realizan las operaciones
        
        l1cu = r*2;
        l2cu = l1cu;

        areasomb = ((l1cu*l2cu)-(Math.PI*Math.pow(r,2)))/2;

        System.out.println("El valor del área sombreada es: " + areasomb);
    }
}
