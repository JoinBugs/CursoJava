import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.AffineTransform;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Shear extends JPanel
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		AffineTransform aT = g2.getTransform();
		aT.translate(100, 100);
		g2.transform(aT);
		aT.shear(20.0, -3.0);
		
		for(int i = 0; i < 2; i++)
		{
			g2.drawString("Java2D", 0.0f, 0.0f);
			g2.transform(aT);
		}
	}
	
	public static void main(String[] args)
	{
		JFrame app = new JFrame("Shear");
		app.add(new Shear());
		app.setBackground(Color.WHITE);
		app.setSize(400, 400);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}












