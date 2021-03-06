import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class PruebaArregloCompartido
{
	public static void main(String[] args)
	{
		ArregloSimple arregloSimpleCompartido = new ArregloSimple(6);
		
		EscritorArreglo escritor1 = new EscritorArreglo(1, arregloSimpleCompartido);
		EscritorArreglo escritor2 = new EscritorArreglo(11, arregloSimpleCompartido);
		
		ExecutorService ejecutor = Executor.newCachedThreadPool();
		ejecutor.execute(escritor1);
		ejecutor.execute(escritor2);
		
		ejecutor.shutdown();
		
		try
		{
			boolean tareasTerminaron = ejecutor.awaitTremination(1, TimeUnit.MINUTES);
			
			if(tareasTerminaron)
				System.out.println(arregloSimpleCompartido);
			else
				System.out.println(
					"Se agoto el tiempo esperado a que las tareas terminaran.");
		}
		catch(InterruptedException ex)
		{
			System.out.println(
				"Hubo una interrupcion mientras esperaba a que terminaran las tareas.");
		}
	}
}




















