public class PruebaMaximo
{
	public static < T extends Comparable< T > > T maximo( T x, T y, T z )
	{
		T max = x;
			
		if( y.compareTo( max ) > 0 )
			max = y;
			
		else if( z.compareTo( max ) > 0 )
			max = z;
			
		return max;
	}
	
	public static void main(String[] args)
	{
		System.out.printf( "Maximo De %d, %d Y %d Es %d\n\n", 3, 4, 5, 
			maximo(new Integer(3), 4, 5) );
			
		System.out.printf( "Maximo De %.1f, %.1f Y %.1f Es %.1f\n\n", 6.6, 8.8, 7.7, 
			maximo(6.6, 8.8, 7.7) );
			
		System.out.printf( "Maximo De %s, %s Y %s Es %s\n\n", "pera", "manzana", "naranja", 
			maximo("pera", "manzana", "naranja") );
	}
}


















