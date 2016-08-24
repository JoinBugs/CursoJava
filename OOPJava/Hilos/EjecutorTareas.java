import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class EjecutorTareas
{
	public static void main(String[] args)
	{
		TareaImprimir tarea1 = new TareaImprimir("Tarea1");
		TareaImprimir tarea2 = new TareaImprimir("Tarea2");
		TareaImprimir tarea3 = new TareaImprimir("Tarea3");
		
		System.out.println("Iniciando Executor");
		
		ExecutorService ejecutorSubprocesos = Executors.newCachedThreadPool();
		
		ejecutorSubprocesos.execute(tarea1);
		ejecutorSubprocesos.execute(tarea2);
		ejecutorSubprocesos.execute(tarea3);
		
		ejecutorSubprocesos.shutdown();
		
		System.out.println("Tareas iniciadas, main termina\n");
	}
}














