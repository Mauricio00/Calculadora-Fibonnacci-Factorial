
package calculadora2;
import calculadora2.Nuemeros;
import java.util.Scanner;
/**
 * 
 * Calculo y despliegue de la multiplicación.
 * 
 * @author:  Chávez-Godinez 
 * @version:  1.0 
 * @date: 05-09-2017 
 */

public class multi {
    void opemulti(int num1, int num2, int resultado){
              Scanner sc = new Scanner(System.in);
           
        System.out.println("Num 1");
        num1=sc.nextInt();
        System.out.println("Num2");
        num2=sc.nextInt();
        resultado= num1 * num2;
        System.out.println("Resultado: " + resultado);
    }
}
