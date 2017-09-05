
package calculadora2;
import calculadora2.Nuemeros;
import java.util.Scanner;

/**
 * 
 * Calculo y despliegue de la suma
 * 
 * @author:  Chávez-Godinez 
 * @version:  1.0 
 * @date: 05-09-2017 
 */

public class Suma {
    void opeSuma(int num1, int num2, int resultado){
              Scanner sc = new Scanner(System.in);
           
        System.out.println("Num 1");
        num1=sc.nextInt();
        System.out.println("Num2");
        num2=sc.nextInt();
        resultado= num1 + num2;
        System.out.println("Resultado: " + resultado);
    }
}
