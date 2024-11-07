package practicagraficoss;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class PracticaGraficoss extends JFrame {

    private JLabel result;
    private JLabel label1;
    private JLabel label2;
    private JTextField dato1;
    private JTextField dato2;
    private JButton btncalcular;

    public PracticaGraficoss() {
        setTitle("Operaciones Básicas"); // Título de la ventana
        setSize(550, 300); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Función terminar la ejecución al cerrar la ventana

        // Inicialización de los componentes
        result = new JLabel("Resultado");
        label1 = new JLabel("Valor 1");
        label2 = new JLabel("Valor 2");

        dato1 = new JTextField(5);
        dato2 = new JTextField(5);
        btncalcular = new JButton("Calcular");
    }

    public void Componentes(PracticaGraficoss ventana) {
        ventana.add(label1);
        ventana.add(dato1);
        ventana.add(label2);
        ventana.add(dato2);
        ventana.add(btncalcular);
        ventana.add(result);

        btncalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btncalcular.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {
                btncalcularActionPerformed2(evt);
            }
        });
    }

    private void btncalcularActionPerformed(ActionEvent evt) {
        float v1 = Integer.parseInt(dato1.getText());
        float v2 = Integer.parseInt(dato2.getText());

        // Realizar las operaciones
        float suma = v1 + v2;
        float resta = v1 - v2;
        float multiplicacion = v1 * v2;
        float division = v1 / v2;

        // Mostrar los resultados
        result.setText("<html>Resultado Suma: " + suma + "<br>Resultado Resta: " + resta +
                       "<br>Resultado Multiplicación: " + multiplicacion + "<br>Resultado División: " + division + "</html>");
    }

    private void btncalcularActionPerformed2(MouseEvent evt) {
        float v1 = Integer.parseInt(dato1.getText());
        float v2 = Integer.parseInt(dato2.getText());

        // Realizar las operaciones
        float suma = v1 + v2;
        float resta = v1 - v2;
        float multiplicacion = v1 * v2;
        float division = v1 / v2;

        // Mostrar los resultados
        result.setText("<html>Resultado Suma: " + suma + "<br>Resultado Resta: " + resta +
                       "<br>Resultado Multiplicación: " + multiplicacion + "<br>Resultado División: " + division + "</html>");
    }

    public static void main(String[] args) {
        PracticaGraficoss ventana = new PracticaGraficoss();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        ventana.setBackground(Color.yellow);
        ventana.Componentes(ventana);

        ventana.setVisible(true); // Activar la ventana
    }
}