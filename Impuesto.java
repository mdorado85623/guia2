import java.util.Scanner;
/**
 *  programa en Java, en la cual, a partir del precio bruto y el tipo de vehículo, encuentre el impuesto a pagar
 *  y el precio neto (precio bruto más el impuesto).
 * 
 * @author Mario Esteban Dorado Sánchez 
 * @version Febrero 2020
 */
public class Impuesto
{
    public static void main(String[] args){
        //Variables
        
        double cam, aut, pbca, pbau;

        double ic=0, nc, iau=0, nau;

        Scanner teclado = new Scanner (System.in);
        
        //se solicita la información (precios de los vehículos)
 
        System.out.println("¿Precio bruto de la Camioneta?");

        pbca = teclado.nextDouble();

        
        System.out.println("¿Precio bruto del Automóvil?");

        pbau = teclado.nextDouble();

        //operaciones y resultados

        if (pbca >= 0 && pbca < 80) {

            ic = 0;

            nc = pbca+ic;

            System.out.println("El impuesto de la Camioneta es: " + ic + "Pesos");

            System.out.println("El valor neto de la Camioneta es: " + nc + "Pesos");

        } else if (pbca>=80) {

            ic = pbca/2;

            nc = pbca+ic;

            System.out.println("El impuesto de la Camioneta es: " + ic + "Pesos");

            System.out.println("El valor neto de la Camioneta es: " + nc + "Pesos");

        } else {

            System.out.println("Algo está Mal!");

        }

        

        if (pbau >= 0 && pbau < 20) {

            iau = 5;

            nau = pbau+iau;

            System.out.println("El impuesto del Automóvil es: " + iau + "Pesos");

            System.out.println("El valor neto del Automóvil es: " + nau + "Pesos");

        } else if (pbau >= 20 && pbau <= 20) {

            iau = pbau/5;

            nau = pbau+iau;

            System.out.println("El impuesto del Automóvil es: " + iau + "Pesos");

            System.out.println("El valor neto del Automóvil es: " + nau + "Pesos");

        } else if (pbau > 40) {

            iau = 9;

            nau = pbau+iau;

            System.out.println("El impuesto del Automóvil es: " + iau + "Pesos");

            System.out.println("El valor neto del Automóvil es: " + nau + "Pesos");

        }else {

            System.out.println("Algo está Mal!");

        }   
    }
}
