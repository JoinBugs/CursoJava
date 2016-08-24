import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import java.lang.Math;

import java.awt.Toolkit;
import java.awt.Dimension;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.GradientPaint;

import java.awt.Stroke;
import java.awt.BasicStroke;

import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import java.awt.AlphaComposite;

import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class MyDoubleBuffering extends JPanel implements Runnable
{
	protected Thread hilo;
	protected BufferedImage ctxOff;
	
	private Rectangle2D bg;
	private Rectangle2D r1;
	
	private static float posX, posY;
	private static float incremento = -1.0f;
	
	protected AlphaComposite ac;
	protected GradientPaint gp = new GradientPaint(50.0f, 25.0f, Color.green, 50.0f, 225.0f, Color.blue);
	
	protected AffineTransform aT;
	
	public MyDoubleBuffering()
	{
		posX = 0.0f;
		posY = 70.0f;
		init();
	}
	
		private void init()
		{			
			hilo = new Thread(this);
			hilo.start();
		}
	
		public void paint(Graphics g)
		{
			Graphics2D g2 = (Graphics2D)g;
			
			Dimension marco = getSize();
		    ctxOff = new BufferedImage(marco.width, marco.height, BufferedImage.TYPE_INT_RGB);
			Graphics2D offg = ctxOff.createGraphics();
			bg = new Rectangle2D.Float(0.0f, 0.0f, marco.width, marco.height);
			offg.setColor(Color.WHITE);
			offg.fill(bg);
			drawInSetOff(offg);
			g2.drawImage(ctxOff, 0, 0, null);
		} 
		
		protected void drawInSetOff(Graphics2D offg)
		{	
			offg.setPaint(gp);
			r1 = new Rectangle2D.Float(posX, posY, 50, 50);
			offg.fill(r1);
			
			ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f);
			
			Stroke pincel = new BasicStroke(7.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
			offg.setComposite(ac);
			offg.setStroke(pincel);
			offg.setColor(Color.red);
			offg.draw(r1);
		}
		
		public void run()
		{
			while(true)
			{
				try
				{
					fisica();
					hilo.sleep(10);
					repaint();
					//System.out.println(posX);
				}
				catch(InterruptedException ex)
				{
					System.out.println(ex.getMessage());
				}
			}
		}
	
		private void fisica()
		{
			if(posX == 335)
				incremento *= -1.0f;
			else if(posX == 0)
				incremento *= -1.0f;
				
			posX += incremento;
		}
	
		public static void main(String[] args)
		{
			JFrame app = new JFrame("Meodo Del Doble Buffer");
			app.add(new MyDoubleBuffering());
			app.setSize(400, 400);
			app.setVisible(true);
			app.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						Toolkit.getDefaultToolkit().beep();
						System.exit(0);
					}
				}
			);
		}
}