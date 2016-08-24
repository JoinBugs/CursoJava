package juegos.numeros;

import juegos.numeros.JuegoAdivinaNumero;
import juegos.interfaces.Jugable;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero implements Jugable
{
	int lifes;

	public JuegoAdivinaImpar(int lifes, int num)
	{
		super(lifes, num);
		this.lifes = lifes;
	}

	public boolean validaNumero()
	{
		if(lifes % 2 == 0)
		{
			System.out.println("El Numero Es Par");
			return false;
		}
		return true;
	}
	
	public void muestraInfo()
	{
		System.out.println("Intenta Adivinar Un Numero Impar Comprendido Entre [0-10] No. De Intentos " + lifes);
	}
	
	public void muestraNombre()
	{
		System.out.println("Adivina Impar");
	}
	
	public void juego(){}
}