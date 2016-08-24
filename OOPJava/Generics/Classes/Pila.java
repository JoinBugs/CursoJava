public class Pila< E >
{
	private final int tamanio;
	private int superior; // ubicacion del elemento superior.
	private E[] elementos;
	
	public Pila()
	{
		this(10);
	}
	
	public Pila( int s )
	{
		tamanio = s > 0 ? s : 10;
		superior = -1; // Al Principio la pila esta vacia.
		elementos = (E[]) new Object[ tamanio ];
	}
	
	public void push( E valorAMeter )
	{
		if( superior == tamanio - 1 ) // si la pila esta llena
			throw new ExcepcionPilaLlena( String.format(
					"La Pila esta llena, no se puede meter %s", valorAMeter ) );
					
		elementos[  ++superior ] = valorAMeter; //coloca valor a meter en la pila.
	}
	
	public E pop()
	{
		if( superior == -1 )
			throw new ExcepcionPilaVacia( "La Pila esta vacia, no se puede sacar" );
			
		return elementos[ superior-- ];
	}
}	



















