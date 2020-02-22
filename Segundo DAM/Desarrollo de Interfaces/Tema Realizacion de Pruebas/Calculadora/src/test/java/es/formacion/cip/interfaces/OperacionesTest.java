package es.formacion.cip.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class OperacionesTest {

    /**
     * Suma y division
     */
    Double valor1;
    Double valor2;

    @Test
    public void sumaSimpleTest() {
        valor1 = 2.0;
        valor2 = 4.0;
        Double resultado;
        resultado = Operaciones.suma(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(6.0));
    }

    @Test
    public void dividirSimpleTest() {
        valor1 = 4.0;
        valor2 = 2.0;
        dividirTest(valor1, valor2, 2.0);
    }

    @Test
    public void dividirDecimalesTest() {
        valor1 = 2.0;
        valor2 = 4.0;
        dividirTest(valor1, valor2, 0.5);
    }

    @Test
    public void dividirNumeroNegativosTest() {
        valor1 = 2.0;
        valor2 = -4.0;
        dividirTest(valor1, valor2, -0.5);
    }

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

    private void dividirTest(Double valor1, Double valor2, Double resultado) {
        Double result = Operaciones.dividir(valor1, valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", result);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(result));
    }

    /**
     * Resta y multiplicacion
     */

    @Test
    public void restaSimpleTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(4.0, 2.0);
        Double esperado = 2.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    @Test
    public void restaRetornaNegativoTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(-4.0, -2.0);
        Double esperado = -2.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    @Test
    public void restaRetornaPositivoTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(-2.0, -4.0);
        Double esperado = 2.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    @Test
    public void restaRetornaPositovoDosTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(2.0, -4.0);
        Double esperado = 6.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    @Test
    public void multiplicarTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.multiplicar(2.0, 4.0);
        Double esperado = 8.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

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

    @Test
    public void multiplicarNumerosNegativosTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.multiplicar(-2.0, -4.0);
        Double esperado = 8.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    @Test
    public void multiplicarNumeroCeroTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.multiplicar(2.0, 0.0);
        Double esperado = 0.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertEquals("El resultado no es el esperado", esperado, resultado);
    }

    @Test
    public void restaSimpleFalsoTest() {
        Operaciones calculadora = new Operaciones();
        Double resultado = calculadora.resta(4.0, 2.0);
        Double esperado = 8.0;
        Assert.assertNotNull("El resultado no puede ser nulo", resultado); // duda esta bien poner siempre assertNotNull ¿?
        Assert.assertFalse("El resultado es falso",esperado != resultado); // duda si es falso deberia funcionar¿?
    }
}
