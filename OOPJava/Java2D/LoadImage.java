import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import java.awt.Image;
import java.awt.Font;

import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;

import java.awt.Shape;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JFrame;

import javax.swing.ImageIcon;

public class LoadImage extends JPanel
{

	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		super.paint(g2);
		
		//getWidth() / 2, getHeight() / 2
		
		FontRenderContext frc = g2.getFontRenderContext();
		Font f = new Font("FatCap", Font.BOLD, 100);
		
		TextLayout tl = new TextLayout("Auto", f, frc);
		
		Shape shape = tl.getOutline();
		
		Image tatto = new ImageIcon("Images\\Grafitti.jpg").getImage();
		
		g2.drawImage(tatto, 0, 0, this);
	}
	
	public static void main(String[] args)
	{
		JFrame app = new JFrame("LoadImage");
		app.add(new LoadImage());
		app.setSize(300, 200);
		app.setVisible(true);
		app.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e){ System.exit(0); }
			}
		);
	}
}





