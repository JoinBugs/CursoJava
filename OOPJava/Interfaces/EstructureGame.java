public interface EstructureGame
{
	public enum Piezas
	{
		PEON(), 
		TORRE(),
		CABALLO(),
		ALFIL(),
		DAMA(),
		REY();
		
		private String color;
	
		public void setColor(String color)
		{
			this.color = color;
		}
		
		public String getColor()
		{
			return color;
		}
	}

	void initPieces();
	
	boolean isHacke(Piezas pieza);
}