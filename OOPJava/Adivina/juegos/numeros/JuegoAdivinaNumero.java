package juegos.numeros;

import juegos.Juego;
import juegos.numeros.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable
{
	int numSecret;

	Entrada input;
	 
	int lifes;
	
	public JuegoAdivinaNumero(int lifes, int num)
	{
		super(lifes);
		this.lifes = lifes;
		numSecret = num;
		input = new Entrada();
	}
	
	@Override
	public void muestraNombre()
	{
		System.out.println("Adivina Un Numero");
	}
	
	public void muestraInfo()
	{
		System.out.println("Intentar Adivinar Un Numero Comprendido Entre[0-10] Puede Ser Par O Impar No. Intentos:" + lifes);
	}
	
	@Override
	public void juega()
	{
		reiniciaPartida();
		
		System.out.print("Adivina Un Numero Entre [0-10] > ");
		int n = input.leeEntero();
		
		if(n == numSecret)
		{
			System.out.println("Acertaste!!");
			actualizaRecord();
		}
		else if(n != numSecret)
		{
			if(isKillOne()) // Si Aun Tiene Vidas.
			{ 
				String result = "El Numero Es ";
				result += (n > numSecret) ? "Menor" : "Mayor";
				
				System.out.println(result);
				System.out.println("Intentalo De Nuevo!!");
			}
		}
		
		int num2 = input.leeEntero();
		
		if(!validaNumero(num2)) isKillOne();
		
	}
	
	public boolean validaNumero(int num)
	{
		return true;
	}
}




















