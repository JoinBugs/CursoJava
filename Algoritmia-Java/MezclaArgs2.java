
public class MezclaArgs2 {

    public MezclaArgs2() {}
    
    	public static void main (String[] args)throws Exception {
    		
    		int[] vect1,vect2;
    		vect1=new int[12];
    		vect2=new int[12];
    		
    			for (int i = 0; i<12; i++) {
    				
    					System.out.print("\nIntroduce El Numero Para El Primer Array > ");
    					vect1[i]=Entrada.leerNumero();
    						
    					System.out.print("Introduce El Numero Para El Segundo Array > ");
    					vect2[i]=Entrada.leerNumero();
					}
    		
    		new MezclaArgs2().mezcla(vect1,vect2);
		}
		
		public void mezcla(int[] args1,int[] args2){
			
			int[] args3=new int[args1.length+args2.length];
			
			int j=0;
			
					for (int i = 0; i<12; i+=3) {
							
							for (int k = 0; k<3; k++) {
								
									args3[j]=args1[i+k];
									j++;
								}
								
							for (int k = 0; k<3; k++) {
								
									args3[j]=args2[i+k];
									j++;
								}
						}
						
				    Entrada.showArray(args3);
					    		
		}
}