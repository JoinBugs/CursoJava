import java.util.function.Predicate;
import java.util.function.Consumer;

public class TestMethodReferences
{
	public static void main( String[] args )
	{ 
		String instanceOfString = "";

		 /*
		    La Sentencia Del Cuerpo de la lambda es una instruccion simple,
		    es decir solo una. la sentencia se carateriza por llamar unicamente
		    a un metodo y pasar como parametro del metodo que llamo, el parametro que
		    implementa del tipo de la lambda o target typing.
		    Nota: la firma del metodo del tipo de la lambda es exactamente la 
		          misma que la del metodo que se llama en el cuerpo de la lambda.
		 */

		 // sintaxsis con lambdas.
	     Predicate<String> startsWithSLambda = name -> name.startsWith( "S" );

	     /*
	     	Es Posible Acortar La Sintaxis De Una Lambda Especificamente como la del
	     	ejemplo de arriba esto si en el cuerpo de la implementacion de la lambda
	     	se tiene una sola instruccion y esa instruccion es una llamanda a un metodo
	     	y la firma de ese metodo es la misma que la firma de el tipo de la lambda.
	     	la sintaxis acortdada queda como la de abajo.
	     	Nota: En Algunos Casos No Tiene Que Ser La Misma Firma De traget typing que la
	     	del metodo a llamar ejemplo : Function<String, Integer> length = String::length;

	        La Magia Ocurre:
	          El Compilador Verifica Si Existen una unica sentencia
	     */

	     // sintaxis con method references.
	     Predicate<String> startsWithSMethod = instanceOfString::startsWith;
	}
}
		