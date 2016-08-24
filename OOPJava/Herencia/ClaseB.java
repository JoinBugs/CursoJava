public class ClaseB extends ClaseA
{
	/*
	@Override
	public final String getName()  // No Se Puede Sobrescribir Por Que EL Metodo De La Super Clase Es final.
	{
		return "ClaseB";
	}
	*/
	
	//@Override 
	private String getDetails() // No Es Error De Compilacion Puesto Que Los Metodos Privados De 
	{							// Una Super Clase No Se Heredan Y Porsupuesto Tambien No Son Visibles
		return "Minusculas";	// Para Cualquier Clase. Lo Que Se Esta Haciendo Aqui Es Definir Un Nuevo 
	}							// Metodo Para Esta Clase.
	
	public static void main(String[] args)
	{
		System.out.println(new ClaseB().getDetails());
	}
}