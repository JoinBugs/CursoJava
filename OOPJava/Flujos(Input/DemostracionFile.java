import java.io.File;

public class DemostracionFile
{
	public void analizarRuta( String ruta )
	{
		File nombre = new File( ruta );
		
		if( nombre.exists() )
		{
			System.out.printf( "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s", 
			
				nombre.getName(), "existe", 
				( nombre.isFile() ? "Es Un Archivo" : "No Es Un Archivo"), 
				( nombre.isDirectory() ? "Es Un Directorio" : "No Es Un Directorio"),
				( nombre.isAbsolute() ? "Es Una Ruta Absoluta" : "No Es Una Ruta Absoluta"),
				nombre.lastModified(), "Tamaño : ", nombre.length(),
				"Ruta : ", nombre.getPath(), "Ruta Absoluta : ", 
				nombre.getAbsolutePath(), "Padre : ", nombre.getParent() );
				
			if( nombre.isDirectory() ) // Muestra El Listado Del Directorio
			{
				String directorio[] = nombre.list();
				System.out.println("\n\nContenido Del Directorio:\n");
				
				for( String nombreDirectorio : directorio )
					System.out.printf( "%s\n", nombreDirectorio );
			}
		}
		else
			System.out.printf( "%s %s", ruta, "no existe.");
	}
}









































