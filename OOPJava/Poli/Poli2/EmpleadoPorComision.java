public class EmpleadoPorComision extends Empleado
{
	private double sueldo;

	public EmpleadoPorComision(String name, String lastName, double sueldo)
	{
		super(name, lastName);
		this.sueldo = sueldo;
	}
	
		@Override
		public double getSueldo()
		{
			return sueldo;
		}
	
		/***************
		*  mportante!!!*
		***************/
		//Si No Se Sobrescribe Cada Uno De Los Metodos En Una Clase Que implemente a una Interface El 
		// Contrato De La Interface Se Hereda A Las Siguientes Clases Que Hereden A Esa Clase Abstracta
		@Override 
		public double getMonto()
		{
			return sueldo * 100;
		}
}