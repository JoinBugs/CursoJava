import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.font.TextLayout;
import java.awt.font.FontRenderContext;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Layout extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		FontRenderContext frc = g2.getFontRenderContext();
		Dimension size = getSize();
		
		TextLayout tl;
		Font f;
		
		f = new Font("Arial", Font.ITALIC, 24);
		tl = new TextLayout("Tamaño 24 Arial Cursiva", f, frc);
		g2.setColor(Color.pink);
		tl.draw(g2, (float)(size.width - tl.getBounds().getWidth()) / 2,
		size.height / 2.0f);
		
		f = f.deriveFont(Font.BOLD, 16);
		tl = new TextLayout("Tamaño 16 Arial", f, frc);
		g2.setColor(Color.red);
		tl.draw(g2, (float)(size.width - tl.getBounds().getWidth()) / 2,
		size.height / 3.5f);
		
		f = new Font("Times New Roman", Font.PLAIN, 20);
		tl = new TextLayout("Tamaño 20 Times New Roman" , f, frc);
		g2.setColor(Color.orange);
		tl.draw(g2, (float)(size.width - tl.getBounds().getWidth()) / 2,
		size.height / 1.5f);
	}

	public static void main(String args[])
	{
		JFrame app = new JFrame("TextLayout");
		app.add(new Layout());
		app.setBackground(Color.WHITE);
		app.setSize(450, 200);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}












