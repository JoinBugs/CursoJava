import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Cadena extends JPanel
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
	
		g2.setFont(new Font("FatCap", Font.PLAIN, 55));
		g2.setColor(Color.green);
		g2.drawString("Andres Cornejo Cruz", 10, 70);
	}
		public static void main(String[] args)
		{
			JFrame app = new JFrame("Renderizado De Una Cadena De Texto");
			app.add(new Cadena());
			app.setBackground(Color.WHITE);
			app.setSize(850, 170);
			app.setVisible(true);
			app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}