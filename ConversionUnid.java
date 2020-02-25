import java.util.Scanner;
/**
 * Programa que realiza la conversión de unidades de medida a pulgadas.
 * 
 * @author (Mario Esteban Dorado Sánchez) 
 * @version (23/02/2020)
 */
public class ConversionUnid
{
    public static void main(String[] args)
    {
        // Se definen las variables intofe, intocm, intole, intoya, fetoin, cmtoin, letoin, yatoin 
        // De pulgada a pie se multiplica el valor de longitud entre 12
        
        double intofe=12, intocm=2.54, intole=190080.02, intoya=36;
        double p, c, l, y, fetoin, cmtoin, letoin, yatoin;

        //Se solicita la información al usuario

        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el numero de pies (P) a convertir: ");
        p = teclado.nextDouble();

        System.out.println("Ingrese el numero de centimetros (C) a convertir: ");
        c = teclado.nextDouble();

        System.out.println("Ingrese el numero de leguas (L) a convertir: ");
        l = teclado.nextDouble();

        System.out.println("Ingrese el numero de yardas (Y) a convertir:");
        y = teclado.nextDouble();

        //Se realiza las operaciones
        fetoin = p*intofe;
        cmtoin = c/intocm;
        letoin = l*intole;
        yatoin = y*intoya;
        
        //Se muestran los resultados de Salida
        System.out.println(p + " pies, es igual a " + fetoin + " pulgadas");
        System.out.println(c + " centimetros, es igual a " + cmtoin + " pulgadas");
        System.out.println(l + " leguas, es igual a " + letoin + " pulgadas");
        System.out.println(y + " yardas, es igual a " + yatoin + " pulgadas");  
    }
}
