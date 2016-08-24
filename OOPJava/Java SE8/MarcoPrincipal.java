import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class MarcoPrincipal extends JFrame
{
	private JButton btnOye;

	public MarcoPrincipal(String title)
	{
		setTitle(title);
		setSize(400, 300);
		setLayout(new FlowLayout());
		
		btnOye = new JButton("Escucha Con Lambdas");
		add(btnOye);
		addListeners();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
		private void addListeners()
		{
			ActionListener oye = (ActionEvent e) -> 
			{
				JOptionPane.showMessageDialog(this, "Listener Implementado Con Lambdas",
						"Hello With LAMBDAS", JOptionPane.INFORMATION_MESSAGE);
			};
		
			btnOye.addActionListener(oye);
		}
		
		public static void main(String[] args) { new MarcoPrincipal("Java SE8").setVisible(true); }
}