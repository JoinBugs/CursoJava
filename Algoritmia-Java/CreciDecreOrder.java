

public class CreciDecreOrder {

    public CreciDecreOrder() {}
    
    	public static void main (String[] args)throws Exception {
    		
    		int[] args1=new int[10];
    		
    		for (int i = 0; i<args1.length; i++) {
    			
    				System.out.print("\nIntroduce Un Numero ["+(i+1)+"] > ");
    				args1[i]=Entrada.leerNumero();
				}
				
			new CreciDecreOrder().creciDecreOrder(args1); 
		}
    
    	public void creciDecreOrder(int[] vect1){
    		
    		boolean creciente=false,decreciente=false;
    		int i;
    		
    		for ( i = 0; i<vect1.length-1; i++) {
    			
    				if(vect1[i]>vect1[i+1]) decreciente=true;
    				
    				if(vect1[i]<vect1[i+1]) creciente=true;
    				
    				if(decreciente==true&&creciente==true){
    					
    					decreciente=false;
    					creciente=false;
    					break;
    				} 
    				
				}
    		
    		if(creciente) System.out.print("Orden Creciente");
    		
    		if (decreciente) System.out.print("\nOrden Decreciente");
    			
    		if(i<vect1.length-1) System.out.print("\nDesordenados");
    	}
    
}