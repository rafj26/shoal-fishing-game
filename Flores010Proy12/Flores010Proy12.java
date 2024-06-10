import javax.swing.*;
import java.awt.event.*;

public class Flores010Proy12 implements ActionListener {

    JFrame ventana;
    JButton btn_boton, btn_tmp, btn_most;
    JLabel lbl_valor, lbl_x, lbl_y, lbl_x2, lbl_y2, lbl_btn, lbl_pres, lbl_pres2, lbl_pres3, lbl_pres4, lbl_pres5, lbl_pres6, lbl_pres7, lbl_pres8, lbl_pres9, lbl_py, lbl_px, lbl_n, lbl_s, lbl_e, lbl_o;
    JTextField tf_valor, tf_x, tf_y, tf_x2, tf_y2, tf_msj, tf_cardumenPos;
    Peces2 peces;

    public static void main(String[] args) {
        new Flores010Proy12();
    }

    Flores010Proy12() {
        ventana = new JFrame("Pescando al pez");
        ventana.setBounds(200, 200, 500, 500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);

        lbl_valor = new JLabel("Botones");
        lbl_valor.setBounds(50, 25, 50, 20);
        ventana.add(lbl_valor);

        tf_valor = new JTextField();
        tf_valor.setBounds(105, 25, 50, 20);
        ventana.add(tf_valor);

        lbl_x = new JLabel("X:");
        lbl_x.setBounds(160, 25, 20, 20);
        ventana.add(lbl_x);

        tf_x = new JTextField();
        tf_x.setBounds(185, 25, 50, 20);
        ventana.add(tf_x);

        lbl_y = new JLabel("Y:");
        lbl_y.setBounds(160, 50, 20, 20);
        ventana.add(lbl_y);

        tf_y = new JTextField();
        tf_y.setBounds(185, 50, 50, 20);
        ventana.add(tf_y);

        /*lbl_x2 = new JLabel("X2");
        lbl_x2.setBounds(240, 25, 20, 20);
        ventana.add(lbl_x2);

        tf_x2 = new JTextField();
        tf_x2.setBounds(265, 25, 50, 20);
        ventana.add(tf_x2);

        lbl_y2 = new JLabel("Y2");
        lbl_y2.setBounds(240, 50, 20, 20);
        ventana.add(lbl_y2);

        tf_y2 = new JTextField();
        tf_y2.setBounds(265, 50, 50, 20);
        ventana.add(tf_y2);*/

        // Labels de puntos cardinales
        lbl_n = new JLabel("NORTE");
        lbl_n.setBounds(930, 180, 50, 20);
        ventana.add(lbl_n);

        lbl_s = new JLabel("SUR");
        lbl_s.setBounds(930, 730, 50, 20);
        ventana.add(lbl_s);

        lbl_e = new JLabel("ESTE");
        lbl_e.setBounds(1205, 450, 50, 20);
        ventana.add(lbl_e);

        lbl_o = new JLabel("OESTE");
        lbl_o.setBounds(620, 450, 50, 20);
        ventana.add(lbl_o);

        // Labels de presentacion
        lbl_pres = new JLabel("Universidad Tecnologica de Panama");
        lbl_pres.setBounds(95, 140, 400, 20);
        ventana.add(lbl_pres);

        lbl_pres2 = new JLabel("Facultad Ingenieria en Sistema Computacional");
        lbl_pres2.setBounds(65, 165, 275, 20);
        ventana.add(lbl_pres2);

        lbl_pres3 = new JLabel("Lic. Desarrollo y Gestion de Software");
        lbl_pres3.setBounds(90, 210, 210, 20);
        ventana.add(lbl_pres3);

        lbl_pres4 = new JLabel("Desarrollo de software III");
        lbl_pres4.setBounds(120, 255, 210, 20);
        ventana.add(lbl_pres4);

        lbl_pres5 = new JLabel("Prof: Ricardo Chan");
        lbl_pres5.setBounds(133, 310, 200, 20);
        ventana.add(lbl_pres5);

        lbl_pres6 = new JLabel("Rolando Flores");
        lbl_pres6.setBounds(142, 365, 100, 20);
        ventana.add(lbl_pres6);

        lbl_pres7 = new JLabel("8-948-2010");
        lbl_pres7.setBounds(152, 380, 100, 20);
        ventana.add(lbl_pres7);

        lbl_pres8 = new JLabel("1GS222");
        lbl_pres8.setBounds(158, 435, 90, 20);
        ventana.add(lbl_pres8);

        lbl_pres9 = new JLabel("02 de Junio 2024");
        lbl_pres9.setBounds(135, 480, 110, 20);
        ventana.add(lbl_pres9);

        // Notificaciones del cardumen u otros
        tf_msj = new JTextField();
        tf_msj.setBounds(800, 25, 150, 20);
        ventana.add(tf_msj);

        // Campo de texto para la posición del cardumen
        tf_cardumenPos = new JTextField();
        tf_cardumenPos.setBounds(800, 80, 150, 20);
        tf_cardumenPos.setEditable(false);
        tf_cardumenPos.setVisible(false);
        ventana.add(tf_cardumenPos);

        btn_most = new JButton("Mostrar/Ocultar");
        btn_most.setBounds(800,135,150,20);
        btn_most.addActionListener(this);
        ventana.add(btn_most);

        // Inicializar la clase Peces2
        peces = new Peces2(tf_cardumenPos);


        int f; // Para generar los numeros en x,y
        for (f = 1; f <= 10; f++) {
            lbl_px = new JLabel(String.valueOf(f));
            lbl_px.setBounds(670 + 50 * (f % 11), 685, 50, 50);
            ventana.add(lbl_px);

            lbl_py = new JLabel(String.valueOf(f));
            lbl_py.setBounds(685, 700 - 50 * (f % 11), 50, 50);
            ventana.add(lbl_py);
        }

        int i; // Generar 100 botones
        for (i = 0; i <= 99; i++) {
            btn_boton = new JButton(String.valueOf(i));
            btn_boton.setBounds(700 + 50 * (i / 10), 200 + 50 * (i % 10), 50, 50);
            btn_boton.addActionListener(this);
            ventana.add(btn_boton);
        }

        ventana.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("en actionPerformed");

        if (e.getSource() == btn_most) 
        {
         tf_cardumenPos.setVisible(!tf_cardumenPos.isVisible());   
        }

        btn_tmp = (JButton) e.getSource();

        int botonNum = Integer.parseInt(btn_tmp.getText());
        tf_valor.setText(btn_tmp.getText());

        tf_x.setText(String.valueOf(btn_tmp.getLocation().x));
        tf_y.setText(String.valueOf(btn_tmp.getLocation().y));

        //tf_x2.setText(String.valueOf(700 + 50 * (Integer.parseInt(tf_valor.getText()) / 10)));
        //tf_y2.setText(String.valueOf(200 + 50 * (Integer.parseInt(tf_valor.getText()) % 10)));

        if (botonNum == peces.getCardumenPos()) {
            tf_msj.setText("Tocaste el cardumen.");
        } else if (isCircundanteButton(botonNum)) {
            peces.botonpres();
            tf_msj.setText("¡El cardumen se movió!");
            if (peces.botonpress()) {
                peces.moveCardumen(); // Generar una nueva posición aleatoria para el cardumen
                tf_cardumenPos.setText("Nueva posición: " + peces.getCardumenPos());
            }
        } else {
            tf_msj.setText("Sigue pescando, amigo.");
        }
    }
    

    private boolean isCircundanteButton(int pos) {
        int cardumenPos = peces.getCardumenPos();
        int fil = cardumenPos / 10;
        int col = cardumenPos % 10;

        int btnfil = pos / 10;
        int btnCol = pos % 10;

        // Verificar si el botón está adyacente en fila o columna y no es el mismo que el cardumen
        if ((btnfil == fil && (btnCol == col + 1 || btnCol == col - 1)) || 
            (btnCol == col && (btnfil == fil + 1 || btnfil == fil - 1))) {
            return true;
        }
        // Verificar si el botón está en una de las esquinas adyacentes al cardumen
        if ((btnfil == fil + 1 || btnfil == fil - 1) && (btnCol == col + 1 || btnCol == col - 1)) {
            return true;
        }
        return false;
    }
}
