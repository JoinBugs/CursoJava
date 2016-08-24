import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Rectangle2D;

import java.awt.Stroke;
import java.awt.BasicStroke;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Punteada extends JPanel
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		float[] punteo = {10.0f, 5.0f};
		
		Rectangle2D r1 = new Rectangle2D.Float(20.0f, 20.0f, 100.0f, 40.0f);
		Stroke pincel = new BasicStroke(4.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 3.0f, punteo, 10.0f);
		g2.setStroke(pincel); //El Ultimo Parametro Del Constructor BaiscStroke Es El Primer Valor Que Tendra El Trazado Punteado. Es Decir El Primer Segmento.
		g2.setColor(Color.green);
		g2.draw(r1);
	}

	public static void main(String[] args)
	{
		JFrame app = new JFrame("Trazo Punteado");
		app.add(new Punteada());
		app.setBackground(Color.WHITE);
		app.setVisible(true);
		app.setSize(250, 250);
		app.setDefaultCloseOperation(app.EXIT_ON_CLOSE);
	}
}
