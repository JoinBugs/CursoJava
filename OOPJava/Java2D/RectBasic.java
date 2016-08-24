import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Stroke;
import java.awt.BasicStroke;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class RectBasic extends JPanel
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g; //Establecer El Contexto.
		
		Rectangle2D r2 = new Rectangle2D.Float(75, 50, 100, 25); //Crear La Figura A Renderizar.
		Stroke pincel = new BasicStroke(4.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
		//Crear El Pincel.(Tamaño En Puntos Del Trazo Del Lapiz, Estilo De Los Extremos Del Trazo Del Lapiz,
	   //, Estilo Del Remate Del Trazado Del Lapiz).
		
		g2.setStroke(pincel); //Establecer El Pincel Con El Cual Sera Trazada La Figura.
		g2.draw(r2); //Renderizar La Figura En El Contexto.
	}

	public static void main(String[] args)
	{
		JFrame app = new JFrame("Shape Basic");
		app.add(new RectBasic());
		app.setBackground(Color.WHITE);
		app.setVisible(true);
		app.setSize(250, 250);
		app.setDefaultCloseOperation(app.EXIT_ON_CLOSE);
	}
}

