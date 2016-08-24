import java.util.function.Function;

public class TestComposeFunctions
{
	public static void main( String[] args )
	{ 
		Function<Long, Long> square = x -> x * x;
		Function<Long, Long> addOne = x -> x + 1;

		//Compose functions from the two functions.
		Function<Long, Long> squareAddOne = square.andThen( addOne );
		Function<Long, Long> addOneSquare = square.compose( addOne );

		//Get an identify function.
		Function<Long, Long> identity = Function.<Long>identity();

		//test the functions.
		long num = 5L;
		System.out.println( "Numbre : " + num );
		System.out.println( "Square and then add one : " + squareAddOne.apply( num ) );
		System.out.println( "Add one and then square : " + addOneSquare.apply( num ) );
		System.out.println( "Identity : " + identity.apply( num ) );
	}
}