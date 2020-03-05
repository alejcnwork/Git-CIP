package es.formacion.cip.alejandro.controlador;

public class Operaciones {

    public static Double suma(Double valor1, Double valor2) {
        Double resultado = valor1 + valor2;
        return resultado;
    }

    public static Double dividir(Double valor1, Double valor2) {
        if (valor2 == null || valor2.equals(0.0)) {
            throw new NumberFormatException ("El divisor no puede ser igual o menor a 0");
        }
        Double resultado = valor1 / valor2;
        return resultado;
    }

    public static Double resta(Double valor1, Double valor2) {
        Double resultado = valor1 - valor2;
        return resultado;
    }

    public static Double multiplicar(Double valor1, Double valor2) {
        Double resultado = valor1 * valor2;
        return resultado;
    }

    public static Double restoDivision(Double valor1, Double valor2) {
        dividir (valor1, valor2);
        Double resto = valor1 % valor2;
        return resto;
    }
}
