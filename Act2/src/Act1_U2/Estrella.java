//Escriba una funcion que dibuje una estrela de 5 picos.
//Ponga como parametros las coordenadas del centro, la distancia del centro a uno de los picos y el color.
package Act1_U2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Estrella extends JFrame {
 private JPanel panel;
    public static void main(String[] args) {
        Estrella v = new Estrella();
        v.setVisible(true);
       
    }

    public Estrella() {
        setTitle("Estrella");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        
        agregarPanel();
    }
    public void agregarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.add(panel);
    }

    public void paint(Graphics g) {

        super.paint(g);
//        g.setColor(Color.black);
        Graphics2D g2 = (Graphics2D) g;
//       Dibujo la linea
//        g2.setColor(Color.black);
//        g2.setStroke(new BasicStroke(4.0f));
//        Line2D X = new Line2D.Float(0f, 300.0f, 600.0f, 300.0f);
//        Line2D Y = new Line2D.Float(300.0f, 0.0f, 300.0f, 600.0f);
//        g2.draw(X);
//        g2.draw(Y);
//X y Y mapa cartesiano

        Line2D linea1 = new Line2D.Float(150.0f, 300.0f, 450.0f, 300.0f);// Linea 1 Horizontal
        Line2D linea2 = new Line2D.Float(150.0f, 300.0f, 375.0f, 450.0f); 
        Line2D linea3 = new Line2D.Float(225.0f, 450.0f, 450.0f, 300.0f);

        Line2D linea4 = new Line2D.Float(300.0f, 200.0f, 375.0f, 450.0f);
        Line2D linea5 = new Line2D.Float(225.0f, 450.0f, 300.0f, 200.0f);

        Graphics2D g3 = (Graphics2D) g;
        g3.setColor(Color.BLACK);
        g3.setStroke(new BasicStroke(5.0f));

        g3.draw(linea1);
        g3.draw(linea2);
        g3.draw(linea3);
        g3.draw(linea4);
        g3.draw(linea5);
    }

}
