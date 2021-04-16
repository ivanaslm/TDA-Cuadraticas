package CYL;

import java.util.Scanner;

/**
 *
 * @author ivanam
 */
public class AppRaices {

    public static void main(String[] args) {
        Scanner Entrada;
        Entrada = new Scanner(System.in);
        System.out.println("Obtener raices de una ecuacion cuadratica");
        System.out.println("Ingrese el valor de A:");
        double a = Entrada.nextDouble();
        System.out.println("Ingrese el valor de B:");
        double b = Entrada.nextDouble();
        System.out.println("Ingrese el valor de C:");
        double c = Entrada.nextDouble();
        Raices Poli;
        Poli = new Raices(a, b, c);
        System.out.println("El resultado es:");
        System.out.println(Poli.FormulaGeneral());

    }//main
}
