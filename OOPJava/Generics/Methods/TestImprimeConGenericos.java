public class TestImprimeConGenericos
{
	public static void main(String[] args)
	{
									// autoboxing.
		Integer[]	arrayInteger	= {new Integer(3), 5, 34, new Integer(12)};
		Character[] arrayCharacter	= {'H', new Character('O'), 'L', 'A'};
		Double[]	arrayDouble		= {34.6, 12.8, 5.8, 11.7};
		
		System.out.printf("%s\n", new String("Arreglo De Enteros:"));
		ImprimeConGenericos.imprimeArreglo(arrayInteger);
		
		System.out.printf("%s\n", new String("Arreglo De Caracteres:"));
		ImprimeConGenericos.imprimeArreglo(arrayCharacter);
		
		System.out.printf("%s\n", new String("Arreglo De Doubles:"));
		ImprimeConGenericos.imprimeArreglo(arrayDouble);
	}
}