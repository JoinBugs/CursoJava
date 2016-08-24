package profesor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Entrada
{
	BufferedReader br;
	
	public Entrada()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
		public String leeCadena()
		{
			String str;
			
			try
			{
				str = br.readLine();
			}
			catch(IOException ex)
			{
				System.out.println("Ha Ocurrido Una Excepcion De Tipo " + ex);
				return null;
			}
			
			return str;
		}
		
		
		public int leeEntero()
		{
			int num = 0;
			
			try
			{
				num = Integer.parseInt(br.readLine());
			}
			catch(IOException ex)
			{
				System.out.println("Ha Ocurrido Una Excepcion De Tipo " + ex);
				System.exit(0);
			}
			
			return num;
		}
		
		public char leeChar()
		{
			char letter;
			
			try
			{
				letter = br.readLine().charAt(0);
			}
			catch(IOException ex)
			{
				System.out.println("Ha Ocurrido Una Excepcion De Tipo " + ex);
				return ' ';
			}
			
			return letter;
		}
}