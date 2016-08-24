import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import java.awt.Color;
import java.awt.Image;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.JFrame;

import javax.swing.ImageIcon;

public class BackgroundImage extends JPanel
{
	public BackgroundImage()
    {
		initWindow();
		setBackground(Color.WHITE);
    }
	
		private void initWindow()
		{
			JFrame app = new JFrame("BackgroundImage");
			app.add(this);
			app.setSize(500, 300);
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
			
			Image imagen = (new ImageIcon("C:\\Users\\HomeWork\\Pictures\\Beat.jpg")).getImage();
			g2.drawImage(imagen, 0, 0, this);
		}
		
		public static void main(String[] args) { new BackgroundImage(); }
}