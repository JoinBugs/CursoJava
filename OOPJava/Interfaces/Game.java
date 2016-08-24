public class Game implements EstructureGame
{
	private Piezas piecesBlack[]	= Piezas.values();
	private Piezas piecesWhite[]	= Piezas.values();

	public Game()
	{
		initPieces();
	}
	
		@Override
		public void initPieces()
		{
			initPiecesBlack();
			initPiecesWhite();
		}
		
		protected void initPiecesBlack()
		{
			for(Piezas pieza: piecesBlack)
				pieza.setColor("Negra");
		}
		
		protected void initPiecesWhite()
		{
			for(Piezas pieza: piecesWhite)
				pieza.setColor("Blanca");
		}
		
		@Override
		public boolean isHacke(Piezas pieza)
		{
			return true;
		}
		
		public void printBlack()
		{
			for(Piezas piece: piecesBlack)
				System.out.println(piece.getColor());
		}
		
		public void printWhite()
		{
			for(Piezas piece: piecesWhite)
				System.out.println(piece.getColor());
		}
		
		public static void main(String[] args)
		{
			Game p1 = new Game();
			
			p1.printBlack();
			System.out.println();
			p1.printWhite();
		}
}