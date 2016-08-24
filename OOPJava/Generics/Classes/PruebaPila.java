public class PruebaPila
{
	private Double[]	elementosDouble		= { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
	private Integer[]	elementosInteger	= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };	
	
	private Pila< Double >	pilaDouble;
	private Pila< Integer > pilaInteger;
	
	public void pruebaPilas()
	{
		pilaDouble	= new Pila<>( 5 );
		pilaInteger	= new Pila<>( 10 );
		
		probarPush( "pilaDouble", pilaDouble, elementosDouble);
		probarPop( "pilaDouble", pilaDouble );
		
		probarPush( "pilaInteger", pilaInteger, elementosInteger);
		probarPop( "pilaInteger", pilaInteger);
		
	  /*pruebaPushDouble();
		pruebaPopDouble();
		pruebaPushInteger();
		pruebaPopInteger();*/
	}
	
	public < T > void probarPush( String nombre, Pila< T > pila, T[] elementos )
	{
		try
		{
			System.out.println( "\nMetiendo elementos en " + nombre);
			
			for( T elemento : elementos )
			{
				System.out.printf( "%s ", elemento);
				pila.push(elemento);
			}
		}
		catch( ExcepcionPilaLlena ex )
		{
			System.err.println();
			ex.printStackTrace();
		}
	}
	
	public < T > void probarPop(String nombre, Pila< T > pila)
	{
		try
		{
			System.out.println( "\nSacando elementos de " + nombre );
			T valorASacar; //Almacena el elemento que se elimino de la pila.
		
			while( true )
			{
				valorASacar = pila.pop();
				System.out.printf( "%s ", valorASacar);
			}
		}
		catch(ExcepcionPilaVacia ex)
		{
			System.err.println();
			ex.printStackTrace();
		}
	}
	
	/*public void pruebaPushDouble()
	{
		try
		{
			System.out.println( "\nMetiendo elementos en pilaDouble" );
			
			//mete elementos en la pila
			for( double elemento : elementosDouble )
			{
				System.out.printf( "%.1f ", elemento);
				pilaDouble.push(elemento);
			}
		}
		catch( ExcepcionPilaLlena ex)
		{
			System.err.println();
			ex.printStackTrace();
		}
	}
	
	public void pruebaPopDouble()
	{
		try
		{
			System.out.println( "\nSacando elementos de pilaDouble" );
			double valorASacar; //Almacena el elemento que se elimino de la pila.
			
			while( true )
			{
				valorASacar = pilaDouble.pop(); //saca el elemento de pilaDouble.
				System.out.printf( "%.1f ", valorASacar);
			}
		}
		catch(ExcepcionPilaVacia ex)
		{
			System.err.println();
			ex.printStackTrace();
		}
	}

	public void pruebaPushInteger()
	{
		try
		{
			System.out.println( "\nMetiendo elementos en pilaInteger" );
			
			//mete elementos en la pila
			for( int elemento : elementosInteger )
			{
				System.out.printf( "%d ", elemento);
				pilaInteger.push(elemento);
			}
		}
		catch( ExcepcionPilaLlena ex)
		{
			System.err.println();
			ex.printStackTrace();
		}
	}
	
	public void pruebaPopInteger()
	{
		try
		{
			System.out.println( "\nSacando elementos de pilaInteger" );
			int valorASacar; //Almacena el elemento que se elimino de la pila.
			
			while( true )
			{
				valorASacar = pilaInteger.pop(); //saca el elemento de pilaDouble.
				System.out.printf( "%d ", valorASacar);
			}
		}
		catch(ExcepcionPilaVacia ex)
		{
			System.err.println();
			ex.printStackTrace();
		}
	} */

	public static void main(String[] args)
	{
		new PruebaPila().pruebaPilas();
	}
}




















