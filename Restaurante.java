import java.util.Scanner;
/**
 * Programa para mostrar el precio que debe pagar el cliente por los platos de comida que solicitó,el precio más IVA (19% más).
 * Adicionalmente, si la comida es vegetariana, el cliente tiene un descuento del 20% sobre el precio con IVA y si es no
 * vegetariana, el descuento es del 10% sobre el precio con IVA.
 * 
 * @author (Mario Esteban Dorado Sánchez) 
 * @version (23022020)
 */
public class Restaurante
{
   public static void main(String[] args)
   {
        double sv=10000, ens=25000, jug=5000; 

        double bc=30000, bp=28000;

        double pc=5000, hb=7000;

        int tc, tveg, tnoveg, trap, cp;

        double iva=0.19, subt, imp, tot, desc, net;

        

        Scanner teclado = new Scanner (System.in);

        

        System.out.println("Bienvenido, ¿que desea ordenar?");

        System.out.println("Si desea comida vegetariana digite 1, Para comida no vegetariana digite 2 o para Comida rápida digite 3");

        tc = teclado.nextInt();

        

        if (tc == 1) {

            System.out.println("Ha seleccionado comida vegetariana!");

            System.out.println("Para Sopas de vegetales digite 1, para Ensaladas digite 2 o Para Jugos digite 3");

            tveg = teclado.nextInt();

            desc = 0.80;

            if (tveg == 1) {

               System.out.println("Ha seleccionado sopa de vegetales!");

               System.out.println("¿Cuantas sopas desea?");

               cp = teclado.nextInt();

               subt = cp*sv;

               imp = subt*iva;

               tot = subt+imp;

               net = tot*desc;

               

               System.out.println("El detalle de su cuenta es:");

               System.out.println("Sub-total = " + subt + " Pesos");

               System.out.println("Impuesto (Iva 19%) = " + imp + " Pesos");

               System.out.println("Precio total = " + tot + " Pesos");

               System.out.println("Descuento por su elección del 20% = " + tot*0.20 + " Pesos");

               System.out.println("Gran total a pagar = " + net + " Pesos");

            } else if (tveg == 2) {

               System.out.println("Ha seleccionado ensaladas!");

               System.out.println("¿Cuantas ensaladas desea?");

               cp = teclado.nextInt();

               subt = cp*ens;

               imp = subt*iva;

               tot = subt+imp;

               net = tot*desc;

               

               System.out.println("El detalle de su cuenta es:");

               System.out.println("Sub-total = " + subt + " Pesos");

               System.out.println("Impuesto (Iva 19%) = " + imp + " Pesos");

               System.out.println("Precio total = " + tot + " Pesos");

               System.out.println("Descuento por su elección del 20% = " + tot*0.20 + " Pesos");

               System.out.println("Gran total a pagar = " + net + " Pesos");

            } else if (tveg == 3) {

               System.out.println("Ha seleccionado jugos");

               System.out.println("¿Cuantos jugos desea?");

               cp = teclado.nextInt();

               subt = cp*jug;

               imp = subt*iva;

               tot = subt+imp;

               net = tot*desc;

               

               System.out.println("El detalle de su cuenta es:");

               System.out.println("Sub-total = " + subt + " Pesos");

               System.out.println("Impuesto (Iva 19%) = " + imp + " Pesos");

               System.out.println("Precio total = " + tot + " Pesos");

               System.out.println("Descuento por su elección del 20% = " + tot*0.20 + " Pesos");

               System.out.println("Gran total a pagar = " + net + " Pesos");

            } else {

               System.out.println("Por favor seleccione unicamente de las opciones dadas!");

            }

        } 

        

        if (tc == 2) {

            System.out.println("Ha seleccionado comida no vegetariana!");

            System.out.println("Bandeja de carne digite 1 o Bandeja de pollo digite 2");

            tnoveg = teclado.nextInt();

            desc = 0.90;

            if (tnoveg == 1) {

               System.out.println("Ha seleccionado bandeja de carne!");

               System.out.println("¿Cuantas bandejas de carne desea?");

               cp = teclado.nextInt();

               subt = cp*bc;

               imp = subt*iva;

               tot = subt+imp;

               net = tot*desc;

               

               System.out.println("El detalle de su cuenta es:");

               System.out.println("Sub-total = " + subt + " Pesos");

               System.out.println("Impuesto (Iva 19%) = " + imp + " Pesos");

               System.out.println("Precio total = " + tot + " Pesos");

               System.out.println("Descuento por su elección del 10% = " + tot*0.10 + " Pesos");

               System.out.println("Gran total a pagar = " + net + " Pesos");

            } else if (tnoveg == 2) {

               System.out.println("Ha seleccionado bandeja de pollo!");

               System.out.println("¿Cuantas bandejas de pollo desea?");

               cp = teclado.nextInt();

               subt = cp*bp;

               imp = subt*iva;

               tot = subt+imp;

               net = tot*desc;

               

               System.out.println("El detalle de su cuenta es:");

               System.out.println("Sub-total = " + subt + " Pesos");

               System.out.println("Impuesto (Iva 19%) = " + imp + " Pesos");

               System.out.println("Precio total = " + tot + " Pesos");

               System.out.println("Descuento por su elección del 10% = " + tot*0.10 + " Pesos");

               System.out.println("Gran total a pagar = " + net + " Pesos");

            } else {

               System.out.println("Por favor seleccione unicamente de las opciones dadas!");

            }

        } 

        

        if (tc == 3) {

            System.out.println("Ha seleccionado comida rápida!");

            System.out.println("Para perro caliente digite 1 o para hamburguesas digite 2");

            trap = teclado.nextInt();

            desc = 1;

            if (trap == 1) {

               System.out.println("Ha seleccionado perro caliente!");

               System.out.println("¿Cuantos perros caliente desea?");

               cp = teclado.nextInt();

               subt = cp*pc;

               imp = subt*iva;

               tot = subt+imp;

               net = tot*desc;

               

               System.out.println("El detalle de su cuenta es:");

               System.out.println("Sub-total = " + subt + " Pesos");

               System.out.println("Impuesto (Iva 19%) = " + imp + " Pesos");

               System.out.println("Precio total = " + tot + " Pesos");

               System.out.println("Descuento por su elección del 0% = " + tot*1 + " Pesos");

               System.out.println("Gran total a pagar = " + net + " Pesos");

               
            } else if (trap == 2) {

               System.out.println("Ha seleccionado hamburguesa!");

               System.out.println("¿Cuantas hamburguesas desea?");

               cp = teclado.nextInt();

               subt = cp*hb;

               imp = subt*iva;

               tot = subt+imp;

               net = tot*desc;

               

               System.out.println("El detalle de su cuenta es:");

               System.out.println("Sub-total = " + subt + " Pesos");

               System.out.println("Impuesto (Iva 19%) = " + imp + " Pesos");

               System.out.println("Precio total = " + tot + " Pesos");

               System.out.println("Descuento por su elección del 0% = " + tot*1 + " Pesos");

               System.out.println("Gran total a pagar = " + net + " Pesos");

               
            } else {

               System.out.println("Por favor seleccione unicamente de las opciones dadas!");

            }

        }                  
    }
}
