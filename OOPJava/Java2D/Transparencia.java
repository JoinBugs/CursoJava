import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Rectangle2D;

import java.awt.Stroke;
import java.awt.BasicStroke;

import java.awt.AlphaComposite;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Transparencia extends JPanel
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		//----------------- Rectangulo Numero 1 ---------------------//
		Rectangle2D r1 = new Rectangle2D.Float(250.0f, 50.0f, 100.0f, 100.0f);
		Stroke pincel = new BasicStroke(7.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
		g2.setStroke(pincel);
		g2.setColor(new Color(200, 20, 20));
		g2.draw(r1);
		g2.setColor(new Color(255, 100, 100));
		g2.fill(r1); /*El Metodo draw(shape) De Graphics2D Renderiza Solamente Los Bordes Del Contorno De La Figura.
					   Mientras Que Fill Puede Renderizar Todo El Espacio Ocupado Por La Figura.*/
		
		//----------------- Rectangulo Numero 2 ---------------------//
		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
		g2.setComposite(ac);
		Rectangle2D r2 = new Rectangle2D.Float(200.0f, 100.0f, 100.0f, 100.0f);
		g2.setColor(Color.GREEN);
		g2.draw(r2);
		g2.setColor(Color.green);
		g2.fill(r2);

		//----------------- Rectangulo Numero 3 ---------------------//
		ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f);
		g2.setComposite(ac);
		Rectangle2D r3 = new Rectangle2D.Float(150.0f, 150.0f, 100.0f, 100.0f);
		g2.setColor(Color.MAGENTA);
		g2.draw(r3);
		g2.setColor(Color.magenta);
		g2.fill(r3);
		
		//----------------- Rectangulo Numero 4 ---------------------//
		ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f);
		g2.setComposite(ac);
		Rectangle2D r4 = new Rectangle2D.Float(100.0f, 200.0f, 100.0f, 100.0f);
		g2.setColor(Color.YELLOW);
		g2.draw(r4);
		g2.setColor(Color.yellow);
		g2.fill(r4);
	}
	
	public static void main(String[] args)
	{
		JFrame app = new JFrame("Solapamientos");
		app.add(new Transparencia());
		app.setBackground(Color.WHITE);
		app.setVisible(true);
		app.setSize(500, 450);
		app.setDefaultCloseOperation(app.EXIT_ON_CLOSE);	
	}
}









