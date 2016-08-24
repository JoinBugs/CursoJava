import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Max3Num {

    public Max3Num() {}
    
    public void mayorAMenor(int x1, int x2, int x3){
    		
    	if(x1>x2&&x1>x3){
    			
    		if(x2>x3) System.out.print(x1+", "+x2+", "+x3);
    			else  System.out.print(x1+", "+x3+", "+x2);		
    			
    	}else if(x2>x1&&x2>x3){
    		
    		if(x1>x3) System.out.print(x2+", "+x1+", "+x3);
    			else  System.out.print(x2+", "+x3+", "+x1);
    		
    	}else if(x3>x1&&x3>x2){
    		
    		if(x1>x2) System.out.print(x3+", "+x1+", "+x2);
    			else  System.out.print(x3+", "+x2+", "+x1);
    	}
    	
    }
    
    	public static void main (String[] args)throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		
    		int n1,n2,n3;
    		
			System.out.print("\nIntroduce Un Numero > ");
			n1=Integer.parseInt(br.readLine());
		
    		System.out.print("\nIntroduce Un 2'do Numero > ");
    		n2=Integer.parseInt(br.readLine());
    		
    		System.out.print("\nIntroduce Un 3'er Numero > ");
    		n3=Integer.parseInt(br.readLine());
    		
    		new Max3Num().mayorAMenor(n1,n2,n3);
		}
}