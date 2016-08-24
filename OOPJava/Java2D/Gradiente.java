import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Rectangle2D;
import java.awt.GradientPaint;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Gradiente extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		GradientPaint gp1 = new GradientPaint(50.0f, 25.0f, Color.blue, 50.0f, 225.0f, Color.black);
		g2.setPaint(gp1);
		
		Rectangle2D r1 = new Rectangle2D.Float(25, 25, 200, 200);
		g2.fill(r1);
		
		GradientPaint gp2 = new GradientPaint(250.0f, 25.0f, Color.blue, 450.0f, 225.0f, Color.black);
		g2.setPaint(gp2);
		
		Rectangle2D r2 = new Rectangle2D.Float(250.0f, 25.0f, 200.0f, 200.0f);
		g2.fill(r2);
	}
	
	public static void main(String[] args)
	{
		JFrame app = new JFrame("Gradiente");
		app.add(new Gradiente());
		app.setSize(490, 300);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}











