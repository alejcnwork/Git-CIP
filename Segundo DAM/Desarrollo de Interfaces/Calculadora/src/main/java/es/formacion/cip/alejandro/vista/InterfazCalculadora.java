package es.formacion.cip.alejandro.vista;

import es.formacion.cip.alejandro.controlador.Operaciones;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazCalculadora extends JFrame {

    private static final long serialVersionUID = 1583724102189855698L;
    JTextField pantalla;
    double resultado;
    String operacion;
    JPanel panelNumeros, panelOperaciones;
    boolean nuevaOperacion = true;

    public InterfazCalculadora(){
        setSize(350, 350);
        setTitle("Calculadora Alejandro Cea");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new BorderLayout());

        pantalla = new JTextField("0", 20);
        pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        pantalla.setBackground(Color.WHITE);
        panel.add("North", pantalla);

        panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 3));
        panelNumeros.setBorder(new EmptyBorder(4, 4, 4, 4));

        for (int n = 9; n >= 0; n--) {
            nuevoBotonNumerico("" + n);
        }
        nuevoBotonNumerico(".");

        panel.add("Center", panelNumeros);

        panelOperaciones = new JPanel();
        panelOperaciones.setLayout(new GridLayout(6, 1));
        panelOperaciones.setBorder(new EmptyBorder(4, 4, 4, 4));

        nuevoBotonOperacion("+");
        nuevoBotonOperacion("-");
        nuevoBotonOperacion("*");
        nuevoBotonOperacion("/");
        nuevoBotonOperacion("=");
        nuevoBotonOperacion("CE");

        panel.add("East", panelOperaciones);

        validate();
    }

    private void nuevoBotonNumerico(String digito) {
        JButton btn = new JButton();
    btn.setText(digito);
    btn.addMouseListener(new MouseAdapter() {

        @Override
        public void mouseReleased(MouseEvent evt) {
            JButton btn = (JButton) evt.getSource();
            numeroPulsado(btn.getText());
        }
    });

        panelNumeros.add(btn);
    }

    private void nuevoBotonOperacion(String operacion) {
        JButton btn = new JButton(operacion);
        btn.setForeground(Color.RED);

        btn.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent evt) {
                JButton btn = (JButton) evt.getSource();
                operacionPulsado(btn.getText());
            }
        });

        panelOperaciones.add(btn);
    }

    private void numeroPulsado(String digito) {
        if (pantalla.getText().equals("0") || nuevaOperacion) {
        pantalla.setText(digito);
    } else {    pantalla.setText(pantalla.getText() + digito);
        }
        nuevaOperacion = false;
    }

    private void operacionPulsado(String tecla) {
        if (tecla.equals("=")) {
            calcularResultado();
        } else if (tecla.equals("CE")) {
            resultado = 0;
            pantalla.setText("");
            nuevaOperacion = true;
        } else {
            operacion = tecla;
            if ((resultado > 0) && !nuevaOperacion) {
                calcularResultado();
            } else {
                resultado = new Double(pantalla.getText());
            }
        }

        nuevaOperacion = true;  }

    private void calcularResultado() {
        if (operacion.equals("+")) {
            Double num2 = Double.valueOf(pantalla.getText());
            resultado = Operaciones.suma(resultado, num2);
        } else if (operacion.equals("-")) {
            Double num2 = Double.valueOf(pantalla.getText());
            resultado = Operaciones.resta(resultado, num2);
        } else if (operacion.equals("/")) {
            Double num2 = Double.valueOf(pantalla.getText());
            resultado = Operaciones.dividir(resultado, num2);
        } else if (operacion.equals("*")) {
            Double num2 = Double.valueOf(pantalla.getText());
            resultado = Operaciones.multiplicar(resultado, num2);
        }
        pantalla.setText("" + resultado);
    operacion = "";
    }
}
