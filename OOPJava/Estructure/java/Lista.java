import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

public class Lista
{
	private BufferedReader br;
	private Nodo lista;
	
	public Lista() 
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		lista = null;
	}
	
		public static void main(String[] args)
		{
			Lista list = new Lista();
			list.whileRequest();
			list.showEdges();
			list.addInFirst(new Nodo(list.getEdad(), null));
			list.showEdges();
		}
		
		public void whileRequest()
		{
			char option = ' ';
			
			do
			{
				addElement();
				System.out.print("\nQuieres Agregar Mas Edades [S/N] > ");
				
				try
				{
					option = br.readLine().charAt(0);
				} 
				catch(IOException ex)
				{
					System.out.println("\nRespuesta Incorrecta " + ex.getMessage());
				}
			}
			while(option == 'S' || option == 's');
		}
		
		public void addElement()
		{
			int edad = getEdad();
			
			if(edad != 0)
			{
				lista = new Nodo(edad, lista);
				System.out.println("Elemento Agregado");
			}
		}
		
		public int getEdad()
		{
			int dato;
		
			try
			{
				System.out.print("\nTeclea Una Edad Valida > ");
				dato = Integer.parseInt(br.readLine());
			}
			catch(IOException ex)
			{
				System.out.println("\nEdad No Valida!!! " + ex.getMessage());
				System.exit(0);
				dato = 0;
			}
			
			if(dato <= 1) dato = 0;
			
			return dato;
		}
		
		public void showEdges()
		{
			System.out.print("\nEdades Almacenadas : ");
		
			for(Nodo n = lista; n != null; n = n.next)
			{
				System.out.print(n.edad + ", ");
			}
			
			System.out.println();
		}
		
		public void addInFirst(Nodo node)
		{	
			node.next = lista;
			lista = node;
		}
		
		public void addInLast(Nodo node)
		{
			Nodo n;
			
			for(n = lista; n.next != null; n = n.next){}
			
			
			
		}
}