package juegos.numeros;

import juegos.numeros.JuegoAdivinaNumero;
import juegos.interfaces.Jugable;

public class JuegoAdivinaPar extends JuegoAdivinaNumero implements Jugable
{
	int lifes;

	public JuegoAdivinaPar(int lifes, int num)
	{
		super(lifes, num);
		this.lifes = lifes;
	}

	public boolean validaNumero()
	{
		if(lifes % 2 == 0) return true;
		
		System.out.println("El Numero Es Impar");
		return false;
	}
			
	public void muestraInfo()
	{
		System.out.println("Intenta Adivinar Un Numero Par Comprendido Entre [0-10] No. De Intentos " + lifes);
	}
	
	public void muestraNombre()
	{
		System.out.println("Adivina Par");
	}
	
	public void juego() {}
}