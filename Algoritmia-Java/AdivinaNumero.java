import java.util.Random;

public class AdivinaNumero {

    public AdivinaNumero() {}
    
    	public static void main (String[] args)throws Exception{
    	
    	 AdivinaNumero	objAn= new AdivinaNumero();
    	
    					objAn.adivina();
		}
		
		public void adivina()throws Exception{
			
			char car=(int)2,choice;
			int n,ale;
			boolean atino=false;
			
			Random rnd=new Random();
			
			ale=rnd.nextInt(100+1);
			
			do{
			
				System.out.print("\n\nIntroduce El Numero A Adivinar > ");
				n=Entrada.leerNumero();
				
				if(n<ale) System.out.print("\nEl Numero Es Menor");
					else if(n>ale) System.out.print("\nEl Numero Es Mayor");
						else{
							System.out.print("\n"+car+" Haz Atinado Correctamente!!! "+car);
							atino=true;
				}
				
				System.out.print("\nMostrar Numero [S/N] > "); 
			    choice=Entrada.leerChar();
			    if(choice=='S'||choice=='s') System.out.print("\nEl Numero Es "+ale+"\n");
				
			    /*if(atino==false){
			    System.out.print("\nDeseas Intentarlo De Nuevo [S/N] > "); 
			    choice=Entrada.leerChar();
			    		
				if(choice=='S'||choice=='s') atino=false;
			    }*/
			
			}while(atino==false);
			
		}
}