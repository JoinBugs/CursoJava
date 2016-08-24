package juegos;

import profesor.Entrada;
import juegos.numeros.JuegoAdivinaNumero;
import juegos.numeros.JuegoAdivinaImpar;
import juegos.numeros.JuegoAdivinaPar;

public class Aplicacion
{
	static Entrada input;
	
	public Aplicacion() { input = new Entrada(); }
	
	public static Jugable eligeJuego()
	{
		JuegoAdivinaNumero	p1  = new JuegoAdivinaNumero(3, 8);
		JuegoAdivinaImpar	p2	= new JuegoAdivinaImpar(3, 5);
		JuegoAdivinaPar		p3	= new JuegoAdivinaPar(3, 2);
		
		Jugable[] elements = new Jugable[3];
		
		elements[0] = p1;
		elements[1] = p1;
		elements[2] = p1;
		
		int option;
		
		do
		{	
			System.out.print("\nElige Tipo De Juego.-\n");
			System.out.print("\n0).-Adivina Numero");
			System.out.print("\n1).-Adivina Numero Impar");
			System.out.print("\n2).-Adivina Numero Par");
			
			System.out.print("\n\nIntroduce La Opcion > ");
			option = input.leeEntero();
		}
		while(option < 0 && option > 2);
		
		return elements[option];
	}

	public static void main(String[] args)
	{		
		Aplicacion app = new Aplicacion();
			
		Jugable set;
			
		set = app.eligeJuego();
		
		char option;
		
		do
		{
			set.muestraNombre();
			set.muestraInfo();
			set.juega();
			
			System.out.print("Deseas Juegar Nuevamente? [S/N] > ");
			option = input.leeChar();
		}
		while(option == 'S' || option == 's');
	}
}


















