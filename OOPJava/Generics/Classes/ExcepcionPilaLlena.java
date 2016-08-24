import java.lang.RuntimeException;

public class ExcepcionPilaLlena extends RuntimeException
{
	public ExcepcionPilaLlena()
	{
		this( "La Pila esta llena" );
	}
	
	public ExcepcionPilaLlena( String excepcion )
	{
		super( excepcion );
	}
}