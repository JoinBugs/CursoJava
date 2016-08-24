import java.util.Random;
import java.sql.Date;
import java.util.ArrayList;

public final class TestConnectionDB
{
	public static void main(String[] args)
	{
		 new TestConnectionDB().initTest();
	}
	
	public void initTest()
	{
		new GeneraRegs();
	}
	
	private class GeneraRegs
	{
		ConnectionDB north;
		
		String[] customID;
		String[] employeeID;
		String[] shipVia;
		String[] freight;
		String[] shipNames;
		String[] shipAddress;
		String[] shipCity;
		String[] shipRegion;
		String[] shipPC;
		String[] shipCountry;
		
		int Orders_ID_MAJOR;
		
		ArrayList<Integer> listProductID = new ArrayList<>(78);
	
		public GeneraRegs()
		{
			north = new ConnectionDB("127.0.0.1:3306/northwind", "OpenGL", ConnectionDB.GestorDB.MYSQLSERVER); 
			
			initIDMajor();
			initOrders();
			insertMillions();
			north.getClosedStreams();
		}
			void initListProductID()
			{
				listProductID.clear();
				
				for(int i = 1; i <= 78; i++)
					listProductID.add(i);
			}
		
			void initIDMajor()
			{
				north.prepareStatement("SELECT * FROM orders Order by 1 DESC Limit 1");
				north.executeSentence();
				Orders_ID_MAJOR = Integer.parseInt(north.getColumn()[0]);
			}
			
			void initOrders()
			{
				north.prepareStatement("SELECT CustomerID FROM orders GROUP BY 1 ORDER BY 1");
				north.executeSentence();
				customID	= north.getColumn();
				
				north.prepareStatement("SELECT EmployeeID FROM orders GROUP BY 1 ORDER BY 1");
				north.executeSentence();
			    employeeID	= north.getColumn();
				
				north.prepareStatement("SELECT ShipVia FROM orders GROUP BY 1 ORDER BY 1");
				north.executeSentence();
				shipVia	= north.getColumn();
				
				north.prepareStatement("SELECT Freight FROM orders GROUP BY 1 ORDER BY 1");
				north.executeSentence();
			    freight	= north.getColumn();
				
				north.prepareStatement("SELECT ShipName FROM orders GROUP BY 1 ORDER BY 1");
				north.executeSentence();
				shipNames	= north.getColumn();
				
				north.prepareStatement("SELECT ShipAddress FROM orders GROUP BY 1 ORDER BY 1");
				north.executeSentence();
				shipAddress= north.getColumn();
				
				north.prepareStatement("SELECT ShipCity FROM orders GROUP BY 1 ORDER BY 1");
				north.executeSentence();
				shipCity	= north.getColumn();
				
				north.prepareStatement("SELECT ShipRegion FROM orders GROUP BY 1 ORDER BY 1");
				shipRegion	= north.getColumn();
				
				north.prepareStatement("SELECT ShipPostalCode FROM orders GROUP BY 1 ORDER BY 1");
				north.executeSentence();
				shipPC		= north.getColumn();
				
				north.prepareStatement("SELECT ShipCountry FROM orders GROUP BY 1 ORDER BY 1");
				north.executeSentence();
				shipCountry= north.getColumn();
			}
		
			void insertMillions()
			{
				int lengthItera = 10_000_000;
				int numOrders;
				
				int orderID = Orders_ID_MAJOR;
				
				int ale_Index_CusID;
				int ale_Index_EmpID;
				int ale_Index_ShipV;
				int ale_Index_Freight;
				int ale_Index_ShipNam;
				int ale_Index_ShipAdd;
				int ale_Index_ShipCity;
				int ale_Index_ShipReg;
				int ale_Index_ShipPC;
				int ale_Index_ShipCoun;
				
				Date orderDate;
				Date shippedDate;
				Date requiredDate;
				
				int	indexProductID;
				int	unitPrice;
				int	quantity;
				int	discount;
				
				Random rnd = new Random();
				
				for(int i = 0; i < lengthItera; i++)
				{
					++orderID;
					ale_Index_CusID		= rnd.nextInt(customID.length);
					ale_Index_EmpID		= rnd.nextInt(employeeID.length);
					ale_Index_ShipV		= rnd.nextInt(shipVia.length);
					ale_Index_Freight	= rnd.nextInt(freight.length);
					ale_Index_ShipNam	= rnd.nextInt(shipNames.length);
					ale_Index_ShipAdd	= rnd.nextInt(shipAddress.length);
					ale_Index_ShipCity	= rnd.nextInt(shipCity.length);
					ale_Index_ShipReg	= rnd.nextInt(shipRegion.length);
					ale_Index_ShipPC	= rnd.nextInt(shipPC.length);
					ale_Index_ShipCoun	= rnd.nextInt(shipCountry.length);
					
					orderDate		= getDateAle();
					requiredDate	= getDateAle();
					shippedDate		= getDateAle();
					
					System.out.println ("INSERT INTO orders VALUES(" + 
						orderID + ", '" + customID[ale_Index_CusID] + "', " + employeeID[ale_Index_EmpID] + 
						", " + orderDate + ", " + requiredDate + ", " + shippedDate + ", " + shipVia[ale_Index_ShipV] + ", " + 
						freight[ale_Index_Freight] + ", " + shipNames[ale_Index_ShipNam] + ", " + shipAddress[ale_Index_ShipAdd] + ", " + 
						shipCity[ale_Index_ShipCity] + ", " + shipRegion[ale_Index_ShipReg] + ", " + 
						shipPC[ale_Index_ShipPC] + ", " + shipCountry[ale_Index_ShipCoun] + ")");
					
					north.prepareStatement("INSERT INTO orders VALUES(" + 
						orderID + ", '" + customID[ale_Index_CusID] + "', " + employeeID[ale_Index_EmpID] + 
						", ?" + ", ?" + ", ?" + ", " + shipVia[ale_Index_ShipV] + ", " + 
						freight[ale_Index_Freight] + ", \"" + shipNames[ale_Index_ShipNam] + "\", \"" + shipAddress[ale_Index_ShipAdd] + "\", \"" + 
						shipCity[ale_Index_ShipCity] + "\", \"" + shipRegion[ale_Index_ShipReg] + "\", \"" + 
						shipPC[ale_Index_ShipPC] + "\", \"" + shipCountry[ale_Index_ShipCoun] + "\")");
					
					north.updateSentence(orderDate, requiredDate, shippedDate);
					
					initListProductID();
					numOrders = rnd.nextInt(5) + 1;
					
					System.out.println ("\nNum De Ordenes : " + numOrders);
					for(int j = 0; j < numOrders; j++)
					{
						indexProductID	= rnd.nextInt(listProductID.size());
						
						unitPrice	= rnd.nextInt(262)	+ 2;
						quantity	= rnd.nextInt(130)	+ 1;
						discount	= rnd.nextInt();
						
						/*System.out.println ("\nPara La Orden " + orderID + " : " + listProductID.get(indexProductID));
						for (int k : listProductID)
							System.out.print(k + ", ");*/
						
						System.out.println ("INSERT INTO OrderDetails VALUES(" + 
							orderID + ", " + listProductID.get(indexProductID) + ", " + unitPrice + ", " + 
							quantity + ", " + discount + " )");
						
						north.prepareStatement( "INSERT INTO OrderDetails VALUES(" + 
							orderID + ", " + listProductID.get(indexProductID) + ", " + unitPrice + ", " + 
							quantity + ", " + discount + " )" );
							
						north.updateSentence();
						
						listProductID.remove(indexProductID);
					}
				}
			}
			
			Date getDateAle()
			{
				Random rnd = new Random();
				
				int año = rnd.nextInt(15) + 100;
				int mes = rnd.nextInt(12) + 1;
				int dia = rnd.nextInt(31) + 1;
				
				//System.out.println (año);
				
				return new Date(año, mes, dia);
			}
		
			void showDatos(String[] array)
			{
				for(String dato : array)
					System.out.println (dato);
			}
	}
}	