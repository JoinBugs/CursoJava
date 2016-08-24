
public class MezclaArrgs {

    public MezclaArrgs() {}
    
    	public static void main (String[] args)throws Exception {
    		
    			  int[] vect1,vect2;
    		
    			  vect1=new int [10];
    			  vect2=new int [10];
    		
    		for (int i = 0; i<10; i++) {
    			
    				System.out.print("\nIntroduce El Numero Para El Primer Array > ");
    				vect1[i]=Entrada.leerNumero();
    				
    				System.out.print("\nIntroduce El Numero Para El Segundo Array > ");
    				vect2[i]=Entrada.leerNumero();
				}
    		
    		new MezclaArrgs().mezcla(vect1,vect2);
		}
    
    	public void mezcla(int []arg1,int []args2){
    		
    			int []args3=new int	[arg1.length*2];
    			
    			int i,j=0;
    			
    			for (i = 0; i<10; i++) {
    				
    					args3[j]=arg1[i];
    					args3[j+1]=args2[i];
    					j+=2;
				}
				
				Entrada.showArray(args3);
    	}
}