import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.GeneralPath;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class FiguraIrregular extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		GeneralPath gp = new GeneralPath();
		gp.moveTo(50.0f, 50.0f);
		gp.lineTo(100.0f, 50.0f);
		gp.curveTo(120.0f, 30.0f, 120.0f, 100.0f, 180.0f, 125.0f);
		gp.lineTo(50.0f, 150.0f);
		gp.closePath();
		
		//Relleno Y Contorno.
		g2.setColor(Color.green);
		g2.fill(gp);
		g2.setColor(Color.blue);
		g2.draw(gp);
	}

	public static void main(String[] args)
	{
		JFrame app = new JFrame("GeneralPath");
		app.add(new FiguraIrregular());
		app.setBackground(Color.WHITE);
		app.setSize(300, 200);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}






