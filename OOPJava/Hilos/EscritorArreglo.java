public class EscritorArreglo implements Runnable
{
	private final ArregloSimple arregloSimpleCompartido;
	private final int valorInicial;
	
	public EscritorArreglo(int valor, arregloSimple arreglo)
	{
		valorInicial = valor;
		arregloSimpleCompartido = arreglo;
	}
	
	public void run()
	{
		for(int i = valorInicial; i < valorInicial; i++)
			arregloSimpleCompartido.agregar(i);
	}
}