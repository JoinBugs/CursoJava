
public class BackInTime {

    public BackInTime() {}
    
    	public static void main (String[] args)throws Exception {
    		
    			int[] arg=new int[10];
    			int cant;
    			
    			for (int i = 0; i<arg.length; i++) {
    				
    					System.out.print("\nIntroduce El Elemento No.["+(i+1)+"] > ");
    					arg[i]=Entrada.leerNumero();
					}
					
				System.out.print("\nIntroduce El Numero De Dezplazamientos > ");
				cant=Entrada.leerNumero();
				
				Desplaza(arg,cant);
		}
		
		public static void Desplaza(int[] vect,int des){
			
			int aux=vect[0];
			int cnt=0;
			
			while (cnt<des) {
			
				for (int i = 0; i<vect.length-1; i++) {
				
						vect[i]=vect[i+1];
					}
				cnt++;
			}
				
			vect[vect.length-cnt]=aux;
			
			Entrada.showArray(vect);
		}
}