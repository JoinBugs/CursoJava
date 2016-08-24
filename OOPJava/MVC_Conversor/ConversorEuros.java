public class ConversorEuros
{
	private double cambio;
	
	public ConversorEuros(double valorCambio) { cambio = valorCambio; }
	
	public double eurosAmoneda(double cantidad) { return cantidad * cambio; }
	
	public double monedaAeuros(double cantidad) { return cantidad / cambio; }
}