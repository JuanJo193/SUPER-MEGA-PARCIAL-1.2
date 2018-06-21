
package numerosprimos;

import java.util.Scanner;

public class NumerosPrimos {

    
    public static void main(String[] args) {
    int a,b,c=0;
    Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        a=scan.nextInt(); 
        for(b=1;b<=a;b++){
            if(a%b==0)
                c++;
        }
        if (c>2){
                System.out.println(a+" No es un número primo");
        }
        else{
                System.out.println(a+" Es un número primo");
        }
    }
}
