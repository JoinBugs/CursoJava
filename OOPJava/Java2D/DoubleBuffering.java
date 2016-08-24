import java.awt.Color;

import java.awt.Dimension;
import java.awt.Image;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class DoubleBuffering extends JPanel
{
private int mX, mY;

	public DoubleBuffering() { initComponents(); }

		private void initComponents()
		{
			JFrame app = new JFrame("Metodo Del Doble Buffer");
			app.add(this);
			app.setBackground(Color.cyan);
			app.setSize(450, 450);
			app.setVisible(true);
			app.addMouseMotionListener(new ManagerEvents());
			app.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				}
			);
		}
		
		public void paint(Graphics g)
		{
			Graphics2D g2 = (Graphics2D)g;
			Dimension d = getSize();
			Image myImage = createImage(d.width, d.height);
			Graphics2D offg = (Graphics2D) myImage.getGraphics();
			offg.setColor(Color.blue);
		}
		
		private void pintarEnOffScreen(Graphics2D g2)
		{
			int s = 100;
			g2.setColor(Color.red);
			Rectangle2D r2 = new Rectangle2D.Float((float)mX - s/2, (float)mY - s/2, 
													(float)s, (float)s);
			g2.fill(r2);
		}
		
		public static void main(String[] args)
		{
			new DoubleBuffering();
		}
	
private class ManagerEvents extends MouseMotionAdapter
{
	public void mouseDragged(MouseEvent e)
	{
		mX = (int)e.getPoint().getX();
		mY = (int)e.getPoint().getY();
		repaint();
	}
}

}














