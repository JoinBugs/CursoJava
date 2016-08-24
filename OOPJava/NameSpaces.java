
import java.awt.List;

import java.util.Arrays;
import java.util.ArrayList;

//import java.util.List;

import javax.swing.JFrame;

public class NameSpaces
{
	public static void main(String[] args)
	{
		java.util.List<String> listaStr;
		listaStr = new ArrayList<>(Arrays.asList("Andres", "Cornejo", "Cruz"));
		
		List lista_View;
	
		lista_View = new List(5);	
		
		for(String name : listaStr)
			lista_View.add(name);
		
		JFrame app = new JFrame("NameSpaces");
		app.setLayout(new java.awt.FlowLayout());;
		app.add(lista_View);
		app.setSize(300, 200);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}