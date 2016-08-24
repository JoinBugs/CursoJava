public class TestCajon
{
	public static void main(String[] args)
	{
		Cajon<String> cj = new Cajon<>();
		
		cj.set("Negro");
		cj.set("Balnco");
		cj.set("Marron");
		
		System.out.printf("%s\n", cj.get());
	}
}