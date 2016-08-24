import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Rectangle2D;
import java.awt.Dimension;

import java.awt.Image;
import java.awt.image.BufferedImage;

import java.awt.AlphaComposite;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Clear extends JPanel
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		Dimension d = getSize();
		
		int w = d.width;
		int h = d.height;
		
		BufferedImage buffimg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		Graphics2D gbi = buffimg.createGraphics();
		gbi.setColor(Color.red);
		
		Rectangle2D r1 = new Rectangle2D.Float(150.0f, 50.0f, 100.0f, 100.0f);
		gbi.fill(r1);
		
		AlphaComposite ac;
		
		ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
		gbi.setColor(Color.green);
		gbi.setComposite(ac);
		Rectangle2D r2 = new Rectangle2D.Float(150.0f, 100.0f, 150.0f, 100.0f);
		gbi.fill(r2);
		
		ac = AlphaComposite.getInstance(AlphaComposite.DST_OVER);
		gbi.setColor(Color.magenta);
		gbi.setComposite(ac);
		Rectangle2D r3 = new Rectangle2D.Float(100.0f, 100.0f, 100.0f, 100.0f);
		gbi.fill(r3);
		
		ac = AlphaComposite.getInstance(AlphaComposite.DST_IN, 0.15f);
		gbi.setColor(Color.yellow);
		gbi.setComposite(ac);
		Rectangle2D r4 = new Rectangle2D.Float(10.0f, 150.0f, 100.0f, 100.0f);
		gbi.fill(r4);
		
		g2.drawImage(buffimg, null, 0, 0);
	}
	
	public static void main(String[] args)
	{
		JFrame app = new JFrame("Clear Composite");
		app.add(new Clear());
		app.setBackground(Color.WHITE);
		app.setSize(300, 350);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}











