import java.io.IOException;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class TestCuadrado
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lado = 0;
		
		try
		{
			System.out.print("\nIntrodude El Lado Del Cuadrado > ");
			lado = Integer.parseInt(br.readLine());
		}
		catch(IOException | NumberFormatException ex)
		{
			System.out.println("\nError!!, Entrada No Valida\nDetalles:");
			ex.printStackTrace();
		}
		
		Cuadrado quad = new Cuadrado(lado);
		quad.showQuadSolid();
		System.out.println("");
		quad.showQuadEmpity();
	}
}