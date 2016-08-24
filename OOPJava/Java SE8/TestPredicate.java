import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;

public class TestPredicate
{
	public static void main( String[] args )
	{ 
		final List<String> 	friends = 
									Arrays.asList( "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" ),
						  	comrades = 
									Arrays.asList( "Kate", "Ken", "Nick", "Paula", "Zach" ),
							editors = 
									Arrays.asList( "Brian", "Jackie", "John", "Mike" );

		final Predicate<String> startsWithN = name -> name.startsWith( "N" );

		final long countFriendsStartsN	=	friends.stream().filter( startsWithN ).count();
		final long countComradesStarstN =	comrades.stream().filter( startsWithN ).count();
		final long countEditorsStartsN 	=	editors.stream().filter( startsWithN ).count();

		printCounts( countFriendsStartsN, countComradesStarstN, countEditorsStartsN );
	}

	public static void printCounts( final long ...counts )
	{
		for( long count : counts )
			System.out.println( count );
	}
}
		


























