
package preciodeproducto;

import java.util.Scanner;

public class PrecioDeProducto {
    
    
    public static void main(String[] args) {
   
      double imp=0.21, pr, prt; 
   Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el precio del produto:");  
        pr=scan.nextFloat();
        prt=(pr*imp)+pr;
        System.out.println("El precio total del producto es de: " + prt);
    }
}
