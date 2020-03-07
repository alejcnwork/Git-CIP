package es.formacion.cip.alejandro.vista;

import com.itextpdf.text.DocumentException;
import es.formacion.cip.alejandro.controlador.Operaciones;
import es.formacion.cip.alejandro.modelo.CreacionPDF;
import es.formacion.cip.alejandro.modelo.CreacionPDFREADME;

import java.io.IOException;
import java.util.Scanner;

/**
 * Esta clase es una clase donde tenemos un menu, y cada menu tiene una opcion
 * para ser elegida, depende de la opcion haremos una suma, resta, division o
 * multiplicacion.
 * @author Alejandro
 * @version 0.0.3
 *
 */
public class MenuCalculadora {

    /**
     * Este metodo es el menu donde estan las diferentes opciones de operaciones de la calculadora.
     * @since 0.0.1
     */
    public static void Menu() throws IOException, DocumentException {
        Scanner sc = new Scanner(System.in);
        CreacionPDF.crearPDFHolaMundo();
        CreacionPDFREADME.crearPDFREADME();
        int opcion;
        do{
            System.out.println("+ - / * CALCULADORA * / - +");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            switch (opcion){
                case 1: System.out.print("Introduce el primer número a sumar: ");
                        Double sum1 = sc.nextDouble();
                        System.out.print("Introduce el segundo número a sumar: ");
                        Double sum2 = sc.nextDouble();
                        System.out.println("Resultado: " + Operaciones.suma(sum1, sum2));
                    break;
                case 2: System.out.print("Introduce el primer número a restar: ");
                        Double res1 = sc.nextDouble();
                        System.out.print("Introduce el segundo número a restar: ");
                        Double res2 = sc.nextDouble();
                        System.out.println("Resultado: " + Operaciones.resta(res1, res2));
                    break;
                case 3: System.out.print("Introduce el primer número a multiplicar: ");
                        Double mul1 = sc.nextDouble();
                        System.out.print("Introduce el segundo número a multiplicar: ");
                        Double mul2 = sc.nextDouble();
                        System.out.println("Resultado: " + Operaciones.multiplicar(mul1, mul2));
                    break;
                case 4: System.out.print("Introduce el dividendo de la división: ");
                        Double div1 = sc.nextDouble();
                        System.out.print("Introduce el divisor de la división: ");
                        Double div2 = sc.nextDouble();
                        System.out.println("Resultado: " + Operaciones.dividir(div1, div2) + "\nResto: " + Operaciones.restoDivision(div1, div2));
                    break;
                case 0: break;
                default: System.out.println("Opción inválida");
            }
        } while (opcion != 0);
        sc.close();
    }
}
