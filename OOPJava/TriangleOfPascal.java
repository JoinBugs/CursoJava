public class TriangleOfPascal
{
	private int size;

		public static void main(String[] args)
		{
			TriangleOfPascal tp = new TriangleOfPascal();
			
			int size = Integer.parseInt(args[0]);
			tp.setSize(size);
			
			tp.showTriangle();
		}
		
		public void setSize(int n) { size = n + 1; }
		
		public void showTriangle()
		{
			int[] triangle = new int[size];
			
			triangle[size - 1] = 1;
			
			for(int i = 0; i < size - 1; i++)
			{
				for(int k = 0; k < size; k++)
				{
					if(triangle[k] != 0) 
						System.out.print(triangle[k] + " ");
					else
						System.out.print(' ');
				}
			
				for(int j = size - (i + 2); j < size - 1 ; j++)
				{
					triangle[j] = triangle[j] + triangle[j + 1];
				}
					
				System.out.println();
			}
		}
}