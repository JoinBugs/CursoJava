import java.awt.Color;

import java.lang.Math;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.AffineTransform;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Transformacion extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
	
		int ancho = getSize().width;
		int largo = getSize().height;
		
		AffineTransform aT = g2.getTransform();
		
		aT.translate(ancho/2, largo/2);
		g2.transform(aT);
		aT.setToRotation(Math.PI / 4.0);
		
		for(int i = 0; i < 8; i++)
		{
			g2.drawString("Java2D", 0.0f, 0.0f);
			g2.transform(aT);
		} 
	}
	
	public static void main(String[] args)
	{
		JFrame app = new JFrame("Transformaciones"); 
		app.add(new Transformacion());
		app.setBackground(Color.WHITE);
		app.setSize(500, 300);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}




