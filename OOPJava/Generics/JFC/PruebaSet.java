import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

import java.util.ArrayList;

public class PruebaSet
{
	private static final String[] colores = {"rojo", "blanco", "azul", 
		"verde", "gris", "naranja", "carne", "blanco", "cyan", 
		"durazno", "gris", "naranja"};
		
	public PruebaSet()
	{
		List<String> lista = Arrays.asList(colores);
		System.out.printf("ArraysList: %s\n", lista);
		imprimirSinDuplicados(lista);
		
		ArrayList<String> listaArray = new ArrayList<String>(Arrays.asList("andres", "jorge", "daniel", "daniel"));
		imprimirSinDuplicados(listaArray);
	}
	
	public void imprimirSinDuplicados(Collection<String> colle)
	{
		Set<String> conjunto = new HashSet<String>(colle);
		
		System.out.println("\nLos Valores Sin Duplicados Son : ");
		
		for(String s : conjunto)
			System.out.printf("%s ", s);
		
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		new PruebaSet();
	}
}

















