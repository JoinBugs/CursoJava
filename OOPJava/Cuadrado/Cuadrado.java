public class Cuadrado
{
	private final int lado;
	
	public Cuadrado(int lado)
	{
		this.lado = lado;
	}
	
		public int getArea()
		{
			return area();
		}
		
		private int area()
		{
			return lado*lado;
		}
		
		public void showQuadSolid()
		{
			for(int row = 0; row < lado; row++)
			{
				for(int col = 0; col < lado; col++)
					System.out.print("*");
		
				System.out.println();
			}
		}
		
		public void showQuadEmpity()
		{
			for(int row = 0; row < lado; row++)	
			{
				for(int col = 0; col < lado; col++)
				{
					if(col == 0 || col == lado - 1 || row == 0 || row == lado - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
}