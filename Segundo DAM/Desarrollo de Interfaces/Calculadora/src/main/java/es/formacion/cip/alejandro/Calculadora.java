package es.formacion.cip.alejandro;

import com.itextpdf.text.DocumentException;
import es.formacion.cip.alejandro.vista.MenuCalculadora;

import java.io.IOException;

/**
 * Esta es la clase principal donde se ejecuta el programa.
 * @author Alejandro
 * @version 0.0.3
 *
 */
public class Calculadora {

    /**
     * Este metodo llama a la clase MenuCalculadora, que se puede ver aqui {@link es.formacion.cip.alejandro.vista.MenuCalculadora}
     */
    public static void main(String[] args) throws IOException, DocumentException {
        MenuCalculadora.Menu();
    }
}
