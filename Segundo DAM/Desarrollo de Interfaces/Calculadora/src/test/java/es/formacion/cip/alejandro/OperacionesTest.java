package es.formacion.cip.alejandro;

import es.formacion.cip.alejandro.controlador.Operaciones;
import org.junit.Assert;
import org.junit.Test;

/**
 * En esta clase es donde tenemos todas las operaciones TEST de suma, resta, division o
 * multiplicacion.
 * @author Alejandro
 * @version 0.0.3
 *
 */
public class OperacionesTest {

    /**
     * @param valor1 se inicializa la variable valor 1 en double
     * @param valor2 se inicializa la variable valor 2 en double
     */
    Double valor1;
    Double valor2;

    /**
     * sumaSimpleTest lo que hace es hacer una suma simple y da como
     * resultado la suma de los valores que se le han asignado a los valores.
     */
    @Test
    public void sumaSimpleTest() {
        valor1 = 2.0;
        valor2 = 4.0;
        Double resultado;
        resultado = Operaciones.suma(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(6.0));
    }

    /**
     * dividirSimpleTest lo que hace es hacer una division simple y da como
     * resultado la division de los valores que se le han asignado a los valores.
     */
    @Test
    public void dividirSimpleTest() {
        valor1 = 4.0;
        valor2 = 2.0;
        dividirTest(valor1, valor2, 2.0);
    }

    /**
     * dividirDecimalesTest Lo mismo que el anterior metodo, pero esta vez con
     * un número en el divisor mayor que el numero del dividendo.
     */
    @Test
    public void dividirDecimalesTest() {
        valor1 = 2.0;
        valor2 = 4.0;
        dividirTest(valor1, valor2, 0.5);
    }

    /**
     * dividirNumeroNegativosTest Lo mismo que el anterior metodo, pero esta vez con
     * un número en el divisor mayor que el numero del dividendo y dando un numero negativo.
     */
    @Test
    public void dividirNumeroNegativosTest() {
        valor1 = 2.0;
        valor2 = -4.0;
        dividirTest(valor1, valor2, -0.5);
    }

    /**
     * dividirPorCeroTest Lo mismo que el anterior metodo, pero esta vez
     * dividiendo por un cero.
     */
    @Test
    public void dividirPorCeroTest() {
        valor1 = 2.0;
        valor2 = 0.0;
        try {
            dividirTest(valor1, valor2, 0.5);
        } catch (Exception e) {
            Assert.assertTrue("El mensaje no es el esperado", e.getMessage().contains("igual o menor a 0"));
        }
    }

    /**
     * dividirTest Metodo para que el metodo anterior de dividirPorCeroTest funcione correctamente
     * @param valor1 el valor 1 que le pasamos por parametro en double
     * @param valor2 el valor 2 que le pasamos por parametro en double
     * @param resultado es el resultado (cociente) de la división
     */
    private void dividirTest(Double valor1, Double valor2, Double resultado) {
        Double result = Operaciones.dividir(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", result);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(result));
    }

    /**
     * restaSimpleTest lo que hace es hacer una resta simple y da como
     * resultado la resta de los valores que se le que se le introducen, llamando al metodo calculadora.resta
     * de la clase {@link Calculadora}.
     */
    @Test
    public void restaSimpleTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(4.0, 2.0);
        Double esperado = 2.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    /**
     * restaSimpleFalsoTest lo que hace es hacer una resta simple y da como resultado un error en la resta
     * de los valores que se le introducen, llamando al metodo calculadora.resta
     * de la clase {@link Calculadora}.
     */
    @Test
    public void restaSimpleFalsoTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(4.0, 2.0);
        Double esperado = 8.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado); // duda esta bien poner siempre assertNotNull ¿?
        Assert.assertFalse("El resultado es falso", esperado.equals(resultado));
    }

    /**
     * restaRetornaNegativoTest lo que hace es hacer una resta con dos numeros negativos y da como
     * resultado un numero negativo, llamando al metodo calculadora.resta
     * de la clase {@link Calculadora}.
     */
    @Test
    public void restaRetornaNegativoTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(-4.0, -2.0);
        Double esperado = -2.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    /**
     * restaRetornaPositivoTest lo que hace es hacer una resta con dos numeros negativos y da como
     * resultado un numero positivo, llamando al metodo calculadora.resta
     * de la clase {@link Calculadora}.
     */
    @Test
    public void restaRetornaPositivoTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(-2.0, -4.0);
        Double esperado = 2.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    /**
     * restaRetornaPositovoDosTest lo que hace es hacer una resta con un numero negativo y otro positivo, pero dando como
     * resultado un numero positivo, llamando al metodo calculadora.resta
     * de la clase {@link Calculadora}.
     */
    @Test
    public void restaRetornaPositovoDosTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(2.0, -4.0);
        Double esperado = 6.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    /**
     * multiplicarTest lo que hace es hacer una multiplicacion simple y da como
     * resultado la multiplicacion de los valores que se le que se le introducen, llamando al metodo calculadora.multiplicar
     * de la clase {@link Calculadora}.
     */
    @Test
    public void multiplicarTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.multiplicar(2.0, 4.0);
        Double esperado = 8.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    /**
     * multiplicarNumeroNegativosTest lo que hace es hacer una multiplicacion con numeros negativos y da como
     * resultado numeros negativos, llamando al metodo calculadora.multiplicar
     * de la clase {@link Calculadora}.
     */
    @Test
    public void multiplicarNumeroNegativosTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado1 = calculadora.multiplicar(2.0, -4.0);
        Double resultado2 = calculadora.multiplicar(-2.0, 4.0); // duda doble resultado ¿?
        Double esperado = -8.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado1);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado1);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado2);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado2);
    }

    /**
     * multiplicarNumerosNegativosTest lo que hace es hacer una multiplicacion con numeros negativos y da como
     * resultado numero positivo, llamando al metodo calculadora.multiplicar
     * de la clase {@link Calculadora}.
     */
    @Test
    public void multiplicarNumerosNegativosTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.multiplicar(-2.0, -4.0);
        Double esperado = 8.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    /**
     * multiplicarNumeroCeroTest lo que hace es hacer una multiplicacion, multiplicando por cero, y dando
     * como resultado cero, llamando al metodo calculadora.multiplicar
     * de la clase {@link Calculadora}.
     */
    @Test
    public void multiplicarNumeroCeroTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.multiplicar(2.0, 0.0);
        Double esperado = 0.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    /**
     * restoSinResultadoTest lo que hace es calcular el resto, y dando como resultado un resto de cero
     * , llamando al metodo calculadora.restoDivision
     * de la clase {@link Calculadora}.
     */
    @Test
    public void restoSinResultadoTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.restoDivision(4.0, 2.0);
        Double esperado = 0.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    /**
     * restoConResultadoTest lo que hace es calcular el resto, y dando como resultado un resto que
     * no sea cero, llamando al metodo calculadora.restoDivision
     * de la clase {@link Calculadora}.
     */
    @Test
    public void restoConResultadoTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.restoDivision(7.0, 2.0);
        Double esperado = 1.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }
}
