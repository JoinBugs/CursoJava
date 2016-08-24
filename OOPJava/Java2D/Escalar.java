import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.AlphaComposite;

import java.awt.geom.AffineTransform;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Escalar extends JPanel
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		AffineTransform aT = g2.getTransform();
		aT.translate(10, 170);
		g2.transform(aT);
		aT.setToScale(2.5f, 2.5f);
		
		Color[] colors = {Color.red, Color.green, Color.blue};
		
		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
		
		for(int i = 0; i < 3; i++)
		{
			g2.setColor(colors[i]);
			g2.drawString("Java 2D", 0.0f, 0.0f);
			g2.transform(aT);
			g2.setComposite(ac);
		}
	}

	public static void main(String[] args)
	{
		JFrame app = new JFrame("Escalar");
		app.add(new Escalar());
		app.setSize(400, 400);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}