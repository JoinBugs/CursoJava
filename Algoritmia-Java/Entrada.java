import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Entrada {

static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    public Entrada() {}
    
    	public static int leerNumero()throws Exception{
    		
    		return Integer.parseInt(br.readLine());	
    	}
    	
    	public static float leerFloat()throws Exception{
    		
    		return Float.parseFloat(br.readLine());
    	}
    	
    	public static char leerChar()throws Exception{
    		
    		return br.readLine().charAt(0);
    	}
    	
    	public static String leerCadena()throws Exception{
    		
    		return br.readLine();
    	}
    	
    	public static void showArray(int[] vect){
    		
    		for (int i = 0; i<vect.length; i++) System.out.print(vect[i]+", ");		
    	}
    
}