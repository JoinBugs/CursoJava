public class ImprimeConGenericos
{
				  //1.-Se Declara El Parametro De Tipo De Elemento Generico Que Se Recive Antes Del Tipo De Retorno.
				  //2.-Se Especifica Con El Mismo Tipo De Parametro De Elemento Con El Que Declaro.El Tipo Del Argumento.
	public static <E> void imprimeArreglo(E[] arregloElementos)
	{
		for(E elemento : arregloElementos)
			System.out.printf("%s, ", elemento);
			
		System.out.println();
	}
}