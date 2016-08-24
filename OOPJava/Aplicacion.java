public class Aplicacion
{
	public static void main(String[] args)
	{
		Juego p1, p2;
		
		p1 = new Juego(5);		
		p2 = new Juego(5);
		
		p1.isKillOne();
		p1.muestraVidasRestantes();
		p1.reiniciaPartida();
		p1.muestraVidasRestantes();
		
		p1.actualizaRecord();
		p2.actualizaRecord();
	}
}

