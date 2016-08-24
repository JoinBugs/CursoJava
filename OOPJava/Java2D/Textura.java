import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import java.awt.TexturePaint;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Textura extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		BufferedImage bi = new BufferedImage(5, 5, BufferedImage.TYPE_INT_RGB);
		Graphics2D bigr = bi.createGraphics();
		
		bigr.setColor(Color.orange);
		Rectangle2D r2 = new Rectangle2D.Float(0.0f, 0.0f, 5.0f, 5.0f);
		bigr.draw(r2);
	
		Ellipse2D e2 = new Ellipse2D.Float(0.0f, 0.0f, 5.0f, 5.0f);
		bigr.setColor(Color.red);
		bigr.fill(e2);
		
		Rectangle2D r3 = new Rectangle2D.Double(0.0, 0.0, 5.0, 5.0);
		TexturePaint tp = new TexturePaint(bi, r3);
		
		g2.setPaint(tp);
		
		Rectangle2D rt = new Rectangle2D.Float(10.0f, 10.0f, 250.0f, 250.0f);
		g2.fill(rt);
	}
	
	public static void main(String[] args)
	{
		JFrame app = new JFrame("Texturas");
		app.add(new Textura());
		app.setBackground(Color.WHITE);
		app.setSize(450, 450);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}







