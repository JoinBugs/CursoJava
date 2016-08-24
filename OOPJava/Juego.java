public class Juego
{
	private int lifes;
	private int initLifes;
	private static int record = 0;
	
	public Juego(int vidas)
	{
		lifes = initLifes = vidas;
	}
	
		public void actualizaRecord()
		{
			if(lifes == record) System.out.println("Se Ha Alcanzado El Record");
			
			else if(lifes > record)
			{
				System.out.println("Se Ha Batido El Record " + lifes);
				record = lifes;
			} 
		}
	
		public void reiniciaPartida()
		{
			lifes = initLifes;
		}
		
		public boolean isKillOne()
		{
			if(lifes > 0) 
			{
				lifes--;
				return true;
			}
			
			System.out.println("Juego Terminado!!");
			return false;
		}
		
		public void muestraVidasRestantes()
		{
			System.out.println("Vidas Totales: " + lifes);
		}
	
		/*public static void main(String[] args)
		{
			Juego p1, p2;
			
			p1 = new Juego(5);
			p1.muestraVidasRestantes();
			
			p1.lifes--;
			p1.muestraVidasRestantes();
			
			p2 = new Juego(5);
			p2.muestraVidasRestantes();
			p1.muestraVidasRestantes();
		}*/
	
}




















