public abstract class Empleado implements PorPago
{
	private String name;
	private String lastName;
	
	public Empleado(String nombre, String apellido)
	{
		name = nombre;
		lastName = apellido;
	}
		public abstract double getSueldo();
		
		public String getName() { return name; }
		
		public void setName(String nombre) { name = nombre; }
		
		
		public String getLastName() { return lastName; }
		
		public void setLastName(String apellido) { lastName = apellido; }
	
}