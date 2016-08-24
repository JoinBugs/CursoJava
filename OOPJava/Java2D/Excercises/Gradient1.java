import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Font;

import java.awt.FontFormatException;

import java.awt.Color;
import java.awt.GradientPaint;

import java.awt.Stroke;
import java.awt.BasicStroke;

import java.awt.AlphaComposite;

import java.awt.geom.AffineTransform;

import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.JFrame;

import java.io.IOException;
import java.io.File;

public class Gradient1 extends JPanel
{			
	static final float widthE  = 300.0f;
	static final float heightE = 310.0f;

	public Gradient1() { initWindow(); }
	
		private void initWindow()
		{
			JFrame app = new JFrame("Esphere");
			app.add(this);
			setBackground(Color.WHITE);
			app.setSize(700, 430);
			app.setVisible(true);
			app.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e) { System.exit(0); }
				}
			);
		}
		
		public void paint(Graphics g)
		{
			super.paint(g);	
			Graphics2D g2 = (Graphics2D)g;
			
			drawBigEllipse(g2);
		}
		  
		public void drawBigEllipse(Graphics2D g2)
		{	
			final int width  = getWidth();
			final int height = getHeight();
		
			Ellipse2D e1 = new Ellipse2D.Float((width / 2) - (widthE / 2), height / 2 - (heightE / 2), widthE, heightE);
			g2.setStroke(new BasicStroke(10.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
			
			g2.setColor(new Color(255, 255, 0));
			g2.draw(new Ellipse2D.Float((width / 2) - (widthE / 2), height / 2 - (heightE / 2), widthE, heightE));
			
			GradientPaint gp = new GradientPaint(0, 0, Color.red, 175.0f, 175.0f, Color.yellow, true);
			g2.setPaint(gp);
			
			g2.fill(e1);
		
			File f;
			Font fat = null;
		
			try
			{
				f = new File("FatCap.ttf");	
				fat = Font.createFont(Font.TRUETYPE_FONT, f).deriveFont(Font.BOLD, 55);
			}
			catch(IOException | FontFormatException ex) 
			{ 
				System.out.println ("Fuente No Cargada " + ex.getMessage()); 
			}
			
			AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f);
			//g2.setComposite(ac);
			
			g2.setColor(new Color(255, 0, 0));
			g2.setFont(fat);
			g2.drawString("Andres", (width / 2) - 110, (height / 2) + 10);	
			
		}
		
		protected Ellipse2D desingEsphere(Graphics2D g2)
		{
			//Ellipse2D e = new Ellipse2D.Float();
			return null;
		}
		  
		public static void main(String[] args) { new Gradient1(); } 
}