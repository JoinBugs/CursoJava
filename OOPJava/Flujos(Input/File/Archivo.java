import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.FormatterClosedException;
import java.util.Formatter;

public final class Archivo 
{
	private Scanner		scan;
    private File		archivo;
	private PrintWriter	salida;
	
    public Archivo()
    {
    	scan	= null;
    	archivo	= null;
    	salida	= null;
    }
    
    	private boolean initFile(final String URL)
    	{
    		try
    		{
    			archivo	= new File(URL);
    			scan	= new Scanner(archivo);
    			salida	= new PrintWriter(archivo);
    		}
    		catch(FileNotFoundException ex)
    		{
    			System.out.println ("Archivo No Encontrado");
    			ex.printStackTrace();
    			
    			return false;
    		}
    		
    		return true;
    	}
    
    	private boolean writeFile(String[] format, Object... datos)
    	{
    		try
    		{
    			int index = 0;
    			
    			/*for(Object dato : datos)
    				salida.format("\n" + format[index++], dato);*/
    			
    			salida.println("Andres");
    			salida.println("Cornejo");
    			salida.format("\n%s", "Otravez");
    			
    		}
    		catch(FormatterClosedException ex)
    		{
    			ex.printStackTrace();
    			return false;
    		}
    		catch(NoSuchElementException ex)
    		{
    			ex.printStackTrace();
    			return false;
    		}
    		finally
    		{
    			saveChanges();
    		}
    		
    		return true;
    	}
    	
    	private void readFile()
    	{
    		try
    		{
 				while(scan.hasNext())
 					System.out.println(scan.next());
    		}
    		catch(NoSuchElementException ex)
    		{
    			ex.printStackTrace();
    		}
    	}
    
    	private void saveChanges() { salida.close(); }
 
    	public static void main (String[] args) 
    	{
    		Archivo myFile = new Archivo();

    		myFile.initFile("delimiter.txt");
    		myFile.writeFile(new String[]{"%d", "%s", "%s", "%s"}, 12, "Andres", "Cornejo", "Cruz");
    		myFile.readFile();
		}
}