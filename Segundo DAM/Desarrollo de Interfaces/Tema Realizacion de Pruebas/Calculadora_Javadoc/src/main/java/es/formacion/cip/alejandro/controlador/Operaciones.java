package es.formacion.cip.alejandro.controlador;

/**
 * En esta clase es donde tenemos todas las operaciones de suma, resta, division o
 * multiplicacion.
 * @author Alejandro
 * @version 0.0.3
 *
 */
public class Operaciones {

    /**
     * Método suma es la realiza la operacion suma de los dos valores.
     * @param valor1 el valor 1 que le pasamos por parametro en double
     * @param valor2 el valor 2 que le pasamos por parametro en double
     * @return devuelve el resultado de la suma.
     */
    public static Double suma(Double valor1, Double valor2) {
        Double resultado = valor1 + valor2;
        return resultado;
    }

    /**
     * Método dividir es la realiza la operacion dividir de los dos valores.
     * @param valor1 el valor 1 que le pasamos por parametro en double
     * @param valor2 el valor 2 que le pasamos por parametro en double
     * @return devuelve el resultado de la division.
     */
    public static Double dividir(Double valor1, Double valor2) {
        if (valor2 == null || valor2.equals(0.0)) {
            throw new NumberFormatException ("El divisor no puede ser igual o menor a 0");
        }
        Double resultado = valor1 / valor2;
        return resultado;
    }

    /**
     * Método resta es la realiza la operacion resta de los dos valores.
     * @param valor1 el valor 1 que le pasamos por parametro en double
     * @param valor2 el valor 2 que le pasamos por parametro en double
     * @return devuelve el resultado de la resta.
     */
    public static Double resta(Double valor1, Double valor2) {
        Double resultado = valor1 - valor2;
        return resultado;
    }

    /**
     * Método multiplicar es la realiza la operacion multiplicar de los dos valores.
     * @param valor1 el valor 1 que le pasamos por parametro en double
     * @param valor2 el valor 2 que le pasamos por parametro en double
     * @return devuelve el resultado de la multiplicacion.
     */
    public static Double multiplicar(Double valor1, Double valor2) {
        Double resultado = valor1 * valor2;
        return resultado;
    }

    /**
     * Método restoDivision es la realiza la operacion del resto de la division de los dos valores.
     * @param valor1 el valor 1 que le pasamos por parametro en double
     * @param valor2 el valor 2 que le pasamos por parametro en double
     * @return devuelve el resultado del resto de la division.
     */
    public static Double restoDivision(Double valor1, Double valor2) {
        dividir (valor1, valor2);
        Double resto = valor1 % valor2;
        return resto;
    }
}
