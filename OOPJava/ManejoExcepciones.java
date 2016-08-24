import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ManejoExcepciones
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.print("\nIntroduce Un Numero > ");
			Integer.parseInt(br.readLine());
		}
		catch(IOException ex)
		{
			System.out.println("\nEntradada De Datos No Valida");
			ex.printStackTrace();
		}
		catch(NumberFormatException ex)
		{
			System.out.println("\nTipo De Dato Incorrecto");
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("\nDe Todas Formas Se Ejecuta");
		}
		
		System.out.println("\nSigue Su Execucion");
	}
}