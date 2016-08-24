import java.util.ArrayList;

public class PruebaComodin
{
	public static void main( String[] args )
	{
		ArrayList<Integer>	listaEnteros = llenaLista(new Integer[]{1, 2, 3, 4, 5});
		ArrayList<Double>	listaDoubles = llenaLista(new Double[]{1.1, 3.3, 5.5});
		ArrayList<Number>	listaNumeros = llenaLista(new Number[]{1, 2.4, 3, 4.1});
		
		System.out.printf("%s\n", sumar(listaEnteros));
		System.out.printf("%.1f\n", sumar(listaDoubles));
		System.out.printf("%s\n", sumar(listaNumeros));
	}
	
	public static <T> ArrayList<T> llenaLista(T[] array)
	{
		ArrayList<T> lista = new ArrayList<T>(array.length);
		
		for(T elemento : array)
			lista.add(elemento);
		
		return lista;
	}
	
	public static <T extends Number> double sumar(ArrayList<T> lista)
	{
		double total = 0.0;
		
		for(T numero : lista)
			total += numero.doubleValue();
		
		return total;
	}
}