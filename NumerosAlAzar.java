
package numerosalazar;

import java.util.Scanner;

public class NumerosAlAzar {

    public static void main(String[] args) {
        float nums=0,numy=0,numnr=0,sum=0,sump=0,sumn=0,promedio,i=-1;
                System.out.println("Si desea terminar el programa ingrese ´-1´");
                do{
                            if(numy<nums){
                                numy=nums;
                            }
                            if(numnr>nums){
                                numnr=nums;
                            }
                            sum=sum+nums;
                            if(nums>=0){
                                sump=sump+nums;
                            }else{
                                sumn=sumn+nums;
                            }
                            i++;
                            Scanner scan = new Scanner(System.in);
                            System.out.println("Teclee un número:");
                            nums= scan.nextFloat();
                }while(nums!=-1);
       promedio=sum/i;
       System.out.println("El mayor número es: "+numy);
       System.out.println("El menor número es: "+numnr); 
       System.out.println("La suma de todos los números es: "+sum);
       System.out.println("La suma de los números positivos es: "+sump);
       System.out.println("La suma de los números negativos es: "+sumn);
       System.out.println("El promedio es: "+promedio);


    }
    
}
