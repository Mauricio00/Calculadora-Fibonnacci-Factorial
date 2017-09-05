
package calculadora2;

import java.util.Scanner;
import calculadora2.Nuemeros;
import calculadora2.Suma;
import calculadora2.Resta;
import calculadora2.multi;
import calculadora2.Div;

/**
 * Ejercicio: Calculadora Consola 
 * @author:  Chávez-Godinez 5IM6
 * @version:  1.0 
 * @date: 05-09-2017 
 */ 
public class Calculadora2 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Suma osuma = new Suma();
            Resta orest = new Resta();
            multi omult = new multi();
            Div odiv = new Div();
            System.out.println("1 para Multiplicacion");
            System.out.println("2 para Suma");
            System.out.println("3 para Resta");
            System.out.println("4 para Division");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    osuma.opeSuma(opcion, opcion, opcion);
                    break;
                case 2:
                    orest.opeResta(opcion, opcion, opcion);
                    break;
                case 3:
                    omult.opemulti(opcion, opcion, opcion);
                    break;
                case 4:
                    odiv.opeDiv(opcion, opcion, opcion);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Numero incorrecto");
            }

        } catch (Exception e) {
            System.out.println("Error, no puedes hacer eso");
        }
    }
}

