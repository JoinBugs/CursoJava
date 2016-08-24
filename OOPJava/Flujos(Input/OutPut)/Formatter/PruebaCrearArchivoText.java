public class PruebaCrearArchivoText
{
	public static void main( String[] args )
	{
		CrearArchivoTexto app = new CrearArchivoTexto();
		app.abrirArchivo();
		app.agregarRegistros();
		app.cerrarArchivo();
	}
}