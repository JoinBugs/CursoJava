import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;
import java.util.function.Function;

public class TestBetterPredicate
{
	public static void main( String[] args )
	{ 
		final List<String> 	friends = 
									Arrays.asList( "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" ),
						  	comrades = 
									Arrays.asList( "Kate", "Ken", "Nick", "Paula", "Zach" ),
							editors = 
									Arrays.asList( "Brian", "Jackie", "John", "Mike" );

		final Function< String, Predicate<String> > startsWithLetter = 
			( String letter ) -> {
				Predicate<String> checkStartsWith = 
					( String name ) -> name.startsWith( letter );
				return checkStartsWith;
			};

		final long countFriendsStartN = friends.stream().filter( startsWithLetter.apply( "N" ) ).count();
		final long countFriendsStartB = friends.stream().filter( startsWithLetter.apply( "B" ) ).count();

		printCounts( countFriendsStartN, countFriendsStartB );
	}

	public static void printCounts( final long ...counts )
	{
		for( long count : counts )
			System.out.println( count );
	}
}































