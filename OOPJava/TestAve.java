public class TestAve
{
	public static void main(String[] args)
	{
		Pato pato = new Pato();
		System.out.println(pato.numAlas());
		System.out.println(pato.getName());
		System.out.println(pato.getColor());
		System.out.println(pato.getSonido());
		
		System.out.println("\n-------------\n");
		
		Ave ave = new Pato();
		
		Pato p = (Pato)ave;
		System.out.println(ave.numAlas());
		System.out.println(ave.getName());
		System.out.println(ave.getColor());
		//System.out.println(ave.getSonido());
	}
}