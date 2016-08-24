

public class PrimeroUltimo {

    public PrimeroUltimo() {}
    
    	public static void main (String[] args)throws Exception{
    		
    		int []num=new int [10];
    		
    		for (int i = 0; i<10; i++) {
    				
    				System.out.print("Introduce Un Numero > ");
    				num[i]=Entrada.leerNumero();
				}
    		
    		new PrimeroUltimo().firstUltimo(num);
    		
		}
    
    	public void firstUltimo(int []collection){
    		
    		int back=collection.length-1;
    		
    		for (int i = 0; i<5; i++) {
    			
    				System.out.print("\n"+collection[i]+", "+collection[back]);
    				back--;
				}
    		
    	}
}