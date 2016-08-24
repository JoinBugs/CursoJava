import java.util.ArrayList;
import java.util.Arrays;

public class TestComodines
{
	public static void main(String[] args)
	{
		/*ArrayList< ? extends Number > lista;
		
		lista = new ArrayList< Integer >();
		
		//lista.add(new Integer(5));*/
		
		ArrayList<Integer> listaInteger = new ArrayList<Integer>(Arrays.asList(3, 4, 7, 8));
		
		ArrayList<? extends Number> list = listaInteger;
		
		for(Number num : list)
			System.out.print(num + ", ");
			
		//list.add(7);
	}
}