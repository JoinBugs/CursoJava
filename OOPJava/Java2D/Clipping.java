import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Clipping extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		int ancho = getSize().width;
		int largo = getSize().height;
		
		Ellipse2D e1 = new Ellipse2D.Float(ancho/4.0f, largo/4.0f, ancho/2.0f, largo/2.0f);
		g2.setClip(e1);
		g2.setColor(Color.cyan);
		g2.fill(new Rectangle2D.Float(0.0f, 0.0f, ancho, largo));
		
		Rectangle2D r2 = new Rectangle2D.Float(ancho/4.0f + 10.0f, largo/4.0f + 10.0f, 
											   ancho/2.0f - 20.0f, largo/2.0f - 20.0f);
		g2.clip(r2);
		g2.setColor(Color.WHITE);
		g2.fill(new Rectangle2D.Float(0.0f, 0.0f, ancho, largo));
	}
	
	public static void main(String[] args)
	{
		JFrame app = new JFrame("Clipping");
		app.add(new Clipping());
		app.setBackground(Color.WHITE);
		app.setSize(400, 400);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}







