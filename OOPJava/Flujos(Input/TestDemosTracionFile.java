import java.util.Scanner;

public class TestDemosTracionFile
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner( System.in );
		DemostracionFile app = new DemostracionFile();
		
		System.out.print("Escribe Aqui El Nombre Del Arhivo O Directorio : ");
		app.analizarRuta( entrada.nextLine() );
	}
}