public class CreadorSubprocesos
{
	public static void main(String[] args)
	{
		System.out.println("Creacion de subprocesos");
		
		Thread subproceso1 = new Thread(new TareaImprimir("Tarea 1"));
		Thread subproceso2 = new Thread(new TareaImprimir("Tarea 2"));
		Thread subproceso3 = new Thread(new TareaImprimir("Tarea 3"));
		
		System.out.println("Subprocesos creados, iniciando tareas.");
		
		subproceso1.start();
		subproceso2.start();
		subproceso3.start();
	}
}