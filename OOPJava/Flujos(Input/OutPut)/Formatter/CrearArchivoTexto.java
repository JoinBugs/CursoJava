import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CrearArchivoTexto
{
	private Formatter salida;
	
	public void abrirArchivo()
	{
		try
		{
			salida = new Formatter( "Clientes.txt" );
		}
		catch( SecurityException ex)
		{
			System.err.println( " No Tiene Acceso De Escritura A Este Archivo. ");
			System.exit(1);
		}
		catch( FileNotFoundException ex)
		{
			System.err.println( " Error Al Crear El Archivo" );
			System.exit(1);
		}
	}
	
	public void agregarRegistros()
	{
		RegistroCuenta registro = new RegistroCuenta();
		
		Scanner entrada = new Scanner( System.in );
		
		System.out.printf( " %s\n%s\n%s\n%s\n\n", 
			"Para Terminar la entrada, Escriba El Indicador de fin de archivo ",
			"cuando se le pida que escriba los datos de entrada.", 
			"en unix/linux/mac os x escriba <ctrl> d y oprima Intro",
			"en windows escriba <ctrl> z y oprima Intro.");
			
		System.out.printf("%s\n%s", 
			"Escriba El Numero De Cuenta (> 0), primer Nombre, apellido paterno y saldo.", "? ");
			
		while( entrada.hasNext() )
		{
			try
			{
				registro.setCuenta( entrada.nextInt() );
				registro.setPrimerNombre( entrada.next() );
				registro.setPrimerApellido( entrada.next() );
				
				if( registro.getCuenta() > 0)
				{
					salida.format( "%d %s %s $.2f\n", registro.getCuenta(), 
						registro.getPrimerNombre(), registro.getPrimerApellido(), 
						registro.getSaldo());
				}
				else
					System.out.println( "El Numero De Cuenta Debe Ser Mayor Que 0." );
			}
			catch( FormatterClosedException ex)
			{
				System.err.println( "Error Al Escribir En El Archivo. " );
				return ;
			}
			catch( NoSuchElementException ex)
			{
				System.err.println( "Entrada Invalida. Intente De Nuevo." );
				entrada.nextLine();
			}
			
			System.out.printf( " %s %s\n%s", "Escriba El Numero De Cuenta (> 0), ", 
				"Primer Nombre, Apellido Paterno Y Saldo.", "? " );
		} // fin del while
	}
	
	public void cerrarArchivo()
	{
		if( salida != null )
			salida.close();
	}
}










































