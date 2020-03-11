package es.formacion.cip.alejandro;

import com.itextpdf.text.DocumentException;
import es.formacion.cip.alejandro.vista.InterfazCalculadora;

import java.io.IOException;

/**
 * Esta es la clase principal donde se ejecuta el programa.
 * @author Alejandro
 * @version 0.0.4
 *
 */
public class Calculadora {

    /**
     * Este metodo llamaba a la clase MenuCalculadora, que se puede ver aqui {@link es.formacion.cip.alejandro.vista.MenuCalculadora}
     * Pero actualmente está siendo sustituido por la clase InterfazCalculadora  {@link es.formacion.cip.alejandro.vista.InterfazCalculadora}
     */
    public static void main(String[] args) throws IOException, DocumentException {
        //MenuCalculadora.Menu();
        InterfazCalculadora calculadora = new InterfazCalculadora();
        calculadora.setVisible(true);
    }
}
