import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet
{
	private static final String nombres[] = {"amarillo", "verde", 
		"negro", "carne", "gris", "blanco", "naranja", "rojo", "verde"};
		
	public PruebaSortedSet()
	{
		SortedSet<String> arbol = new TreeSet<String>(Arrays.asList(nombres));
		
		System.out.println("Conjunto Ordenado: ");
		imprimirConjunto(arbol);
		
		//Imprimie subconjunto mediante headSet con base en naranja
		System.out.print("\nheadSet (\"naranja\"): ");
		imprimirConjunto(arbol.headSet("naranja"));
		
		//Imprimie subconjunto mediante tailSet con base en naranja
		System.out.print("\ntailSet (\"naranja\"): ");
		imprimirConjunto(arbol.tailSet("naranja")); 
		
		//obtiene los elementos primero y ultimo
		System.out.printf("primero: %s\n", arbol.first());
		System.out.printf("ultimo: %s\n", arbol.last());
	}
	
	private void imprimirConjunto(SortedSet<String> conjunto)
	{
		for(String s : conjunto)
			System.out.printf("%s ", s);
		
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		new PruebaSortedSet();
	}
}















