import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

import java.sql.Statement;
import java.sql.PreparedStatement;

import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

import java.sql.Date;

public class ConnectionDB
{
	private Connection session;
	private PreparedStatement sentenciaSQL;
	
	private final String DB;
	private final String USER;
	private final String PASS;
	
	private GestorDB gestor;
	
	private ResultSet cdr;
	private ResultSetMetaData cdrMeta;
	
	public enum GestorDB
	{
		SQLSERVER("com.microsoft.sqlserver.jdbc.SQLServerDriver", "sqlserver"),
		MYSQLSERVER("com.mysql.jdbc.Driver", "mysql");
		
		private final String pathDriver;
		private final String name;
		
		GestorDB(final String path, final String nameServer)
		{
			pathDriver = path;
			name = nameServer;
		}
		
		public String getPathDriver() { return pathDriver; }
		
		public String getServerName() { return name; }
	};
	
	public ConnectionDB(final String DATA_BASE, final String PASS_USER, GestorDB typeGestorDB)
	{
		this(DATA_BASE, "root", PASS_USER, typeGestorDB);
	}
	
	public ConnectionDB(final String DATA_BASE, final String USER_NAME, final String PASS_USER, GestorDB typeGestorDB)
	{
		DB		= DATA_BASE;
		USER	= USER_NAME;
		PASS	= PASS_USER;
		
		gestor = typeGestorDB;
		
		initDriver();
		setConecction();
	}
	
		protected void initDriver()
		{
			try
			{
				Class.forName(gestor.getPathDriver()).newInstance();
			}
			catch(InstantiationException | IllegalAccessException | ClassNotFoundException ex)
			{
				System.out.print("\nHa Ocurrido Un Error Con El Driver De " + gestor + 
				"\n En La Ruta " + gestor.getPathDriver() + " Detalles : \n");
				ex.printStackTrace();
				System.exit(0);
			}
			
			System.out.println("\nConnection Successful For " + gestor.toString());
		}
		
		protected void setConecction()
		{
			try
			{
				session = DriverManager.getConnection("jdbc:" + gestor.getServerName() + "://" + DB, USER, PASS);
				System.out.println("\nConnection Successful For");
				System.out.println("jdbc:" + gestor.getServerName() + "://" + DB);
			}
			catch(SQLException ex)
			{
				System.out.println("Ha Ocuurido Un Error\nMientras Se Establecia La Coneccio Con La BD\n");
				ex.printStackTrace();
			}
		}
		
		protected void prepareStatement(String sql)
		{	
			try
			{
				sentenciaSQL = session.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				System.out.println("\nSentence Successful For");
				System.out.println("Sentencia SQL Creada");
			}
			catch(SQLException ex)
			{
				System.out.println("\nError Al Crear La Sentencia SQL");
				ex.printStackTrace();
			}
		}
		
		public void executeSentence()
		{
			try
			{
				cdr = sentenciaSQL.executeQuery();
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		
		public void updateSentence(Date orderDate, Date shippedDate, Date requiredDate)
		{
			try
			{
				sentenciaSQL.setDate(1, orderDate);
				sentenciaSQL.setDate(2, shippedDate);
				sentenciaSQL.setDate(3, requiredDate);
				
				sentenciaSQL.executeUpdate();
				System.out.println ("Registros Actualizados Correctamente");
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		
		public void updateSentence()
		{
			try
			{
				sentenciaSQL.executeUpdate();
				System.out.println ("Registros Actualizados Correctamente");
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		
		public final String[] getColumn()
		{
			int index = 0;
			
			String[] array = null;
			
			try
			{
				cdr.last();
				array = new String[cdr.getRow()];
				cdr.beforeFirst();
				
				while(cdr.next())
				{
					array[index++] = cdr.getString(1);
				}
			}
			catch(SQLException ex)
			{
				System.out.println ("Erro En El Conjunto De Resultados Detalles: \n");
				ex.printStackTrace();
			}
			
			return array;
		}
		
		public boolean getClosedStreams()
		{
			try 
			{
				session.close();
				sentenciaSQL.close();
				cdr.close();
			}
			catch (SQLException ex) 
			{
				return false;
			}
			
			return true;
		}
}