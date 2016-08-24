public class RegistroCuenta
{
	private int cuenta;
	private String primerNombre;
	private String primerApellido;
	private double saldo;
	
	public RegistroCuenta() { this( 0, "", "", 0.0 ); }
	
	public RegistroCuenta( int cta, String nombre, String apellido, double sal )
	{
		setCuenta( cta );
		setPrimerNombre( nombre );
		setPrimerApellido( apellido );
		setSaldo( sal );
	}
	
	public void setCuenta( int cta ) { cuenta = cta; }
	
	public int getCuenta() { return cuenta; }
	
	public void setPrimerNombre( String nombre ){ primerNombre = nombre; }
	
	public String getPrimerNombre() { return primerNombre; }
	
	public void setPrimerApellido( String apellido ) { primerApellido = apellido; }
	
	public String getPrimerApellido() { return primerApellido; }
	
	public void setSaldo( double sal ) { saldo = sal; }
	
	public double getSaldo() { return saldo; }
}








































