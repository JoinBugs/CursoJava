import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import java.awt.Color;

import java.awt.Stroke;
import java.awt.BasicStroke;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Clip extends JPanel
{
		public void paint(Graphics g)
		{
			Graphics2D g2 = (Graphics2D)g;
			super.paint(g2);

			int width  = getWidth();
			int height = getHeight();

			float widthR1  = 120.0f;
			float heightR1 = widthR1;

			float widthE1  = widthR1 + 40;
			float heightE1 = widthE1 - 40;

			Ellipse2D e1 = new Ellipse2D.Float((width / 2) - (widthE1 / 2), (height / 2) - (heightE1 / 2), widthE1, heightE1);
			g2.setClip(e1);
			g2.setColor(Color.YELLOW);
			g2.fill(e1);

			Stroke pen1 = new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);			
			g2.setStroke(pen1);

			g2.setColor(Color.BLACK);
			g2.draw(new Ellipse2D.Float((width / 2) - (widthE1 / 2), (height / 2) - (heightE1 / 2), widthE1 - 5.0f, heightE1 - 5.0f));

			Rectangle2D r1 = new Rectangle2D.Float((width / 2)  - (widthR1 / 2), (height / 2) - (heightR1 / 2), widthR1, heightR1);
			g2.clip(r1);
			g2.setColor(Color.GREEN);
			g2.fill(r1);

			g2.setColor(new Color(0, 120, 0));
			g2.draw(new Rectangle2D.Float((width / 2)  - (widthR1 / 2), (height / 2) - (heightR1 / 2), widthR1, heightR1));
		}

		public static void main(String []args)
		{
			JFrame app = new JFrame("Clipping Java2D");
			app.add(new Clip());
			app.setBackground(Color.WHITE);
			app.setSize(500, 300);
			app.setVisible(true);
			app.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e){ System.exit(0); }
				}
			);
		}
}