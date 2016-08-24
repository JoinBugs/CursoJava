@FunctionalInterface
public interface PorPagar
{	
	public default String getNumSerie()
	{
		return new String("S11120062");
	}

	double getMonto();
}