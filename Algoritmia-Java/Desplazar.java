
public class Desplazar {

    public Desplazar() {}
    
    	public static void main (String[] args)throws Exception {
    		
    		int[] args1=new int[10];
    		int num,pos;
    		
    		for (int i = 0; i<args1.length-2; i++) {
    			
    				System.out.print("\nIntroduce El Numero En La Pos["+i+"] > ");
    				args1[i]=Entrada.leerNumero();
				}
				
			System.out.print("\nIntroduce El Numero A Insertar > ");
			num=Entrada.leerNumero();
			
			System.out.print("\nIntroduce La Posicion Del Array > ");
			pos=Entrada.leerNumero();
				
			Dezplazar(args1,num,pos);	
		}
		
		public static void Dezplazar(int[] vect,int n,int pos){
			
				for (int i = vect.length-1; i>pos; i--) vect[i]=vect[i-1];
					
				vect[pos]=n;
				
				Entrada.showArray(vect);
		}
}