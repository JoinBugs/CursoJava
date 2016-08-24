public class TestPorPagar
{
	public static void main(String[] args)
	{
		/* Se puede inferir la sentencia return. solo cuando 
		 * el cuerpo de la expresion lambda contiene una unica sentencia simple sin llaves.
		 * si se colocaran las llaves y en el cuerpo de la expresion lambda existinera una unica
		 * sentencia no se puede oviar la sentencia return.
		*/
		PorPagar factura = () -> 5.7;
		
		PorPagar factura2 = new PorPagar()
		{
			@Override
			public double getMonto()
			{
				return 5.7;
			}
		};
		
		System.out.printf("Factura con LAMBDAS\n%.1f\n", factura.getMonto());
		System.out.printf("\nFactura con Clase Anonima Interna\n%.1f\n", factura2.getMonto());
	}
}