import java.lang.RuntimeException;

public class ExcepcionPilaVacia extends RuntimeException
{
	public ExcepcionPilaVacia()
	{
		this( "La Pila esta vacia" );
	}
	
	public ExcepcionPilaVacia( String excepcion )
	{
		super( excepcion );
	}
}