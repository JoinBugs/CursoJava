import java.util.Arrays;
import java.util.ArrayList;

public class TestLambdas
{
	public static void main( String[] args )
	{ 
		String[] arrayFriends = { "Andres", "Daniel", "Hugo", "Carla", 
							 "Maria", "Steve", "Oscar" };

		ArrayList<String> friends = new ArrayList<String>( Arrays.asList( arrayFriends ) );

		//Con Lambdas
		System.out.println( "Con Lambdas:" );
		friends.stream().map( friend -> friend.toUpperCase() )
						.forEach( friend -> System.out.println( friend ) );

		new java.util.Scanner( System.in ).nextLine();

		System.out.println( "Con Method Refernces:" );
		friends.stream().map( String::toUpperCase )
						.forEach( friend -> System.out.println( friend ) );

		//friends.forEach( friend -> System.out.println( friend ) );
	}
}