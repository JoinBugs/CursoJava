import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.ToIntFunction;
import java.util.function.IntFunction;

public class TestBinaryOperator
{
	public static void main( String[] args )
	{ 
		BinaryOperator<Integer> sum = Integer::sum;
		System.out.println( sum.apply( 5, 7 ) );

		BiFunction<String, Integer, Integer> valueOf = Integer::valueOf;
		System.out.println( valueOf.apply( "10001", 2 ) ); // 10001 base 2 -> 17 base 10

		Function<String, Integer> length = String::length;
		System.out.println( length.apply( "Andres" ) );

		ToIntFunction<String> lengthToInt = String::length;
		System.out.println( length.apply( "Thinking" ) );

		BiFunction<String, Integer, String> multString = ( str, mult ) ->
		{
			String strCopy = str;
			for( int i = 1; i < mult; i++ )
				str += strCopy;
			return str;
		};

		IntFunction<String> sumString = count -> {
			String number = "";
			for( int i = 0; i < count; i++ )
				number += count;
			return number;
		};

		System.out.println( sumString.apply( 5 ) );
		System.out.println( multString.apply( "A", 5 ) );
	}
}