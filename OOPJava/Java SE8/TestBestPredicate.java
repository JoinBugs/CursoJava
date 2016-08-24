import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;

public class TestBestPredicate
{
	public static void main( String[] args )
	{ 
		final List<String> 	friends = 
									Arrays.asList( "Brian", "Nate", "Neal", "Raju", "Sara", "Scott" ),
						  	comrades = 
									Arrays.asList( "Kate", "Ken", "Nick", "Paula", "Zach" ),
							editors = 
									Arrays.asList( "Brian", "Jackie", "John", "Mike" );	

		friends.stream().filter( checkIfStartsWith( "N" ) );
		friends.stream().filter( checkIfStartsWith( "B" ) );
	}

	public static Predicate<String> checkIfStartsWith( final String letter )
	{
		return name -> name.startsWith( letter );
	}
}
		