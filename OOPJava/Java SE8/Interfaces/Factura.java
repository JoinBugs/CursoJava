public class Factura implements PorPagar
{
	private double monto;

	public Factura(double monto)
	{
		this.monto = monto;
	}
	
		public static void main(String[] args)
		{
			Factura fact = new Factura(45.7567);
			System.out.printf("%.2f\n", fact.getMonto());
			
			System.out.printf("%s\n", fact.getNumSerie());
		}
		
		@Override
		public double getMonto()
		{
			return monto;
		}
}