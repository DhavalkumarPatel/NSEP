package com.nsep.DAOutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
* It is a DAO util class used for database connectivity between 
* DB-a57f and NSEP_System project.
      * @author   	:Bhagyesh Mandal(537673),Pareechi Gandhi(537723),
      * 			 Ravi Patel(537640),Bhagyashree Soni(537650),
      * 			 Dhaval Patel(537643),Arpan Jaiswal(537777)  
      * @version  	:JDK 1.5.0    
      * @Class 		:DBHelper_f
      * @Creation 	:15-Dec-2011
*/
public class DBHelper_f 
{
	public static String DBUSERNAME = "a57f";
	//Database username
	public static String DBPASSWORD = "a57f";
	//Database password
	public static String DBURL = "jdbc:oracle:thin:@INGNRILPINFM01:1521:ORCL";
	//Database URL
	
	/**
	 * Creates a Connection between JAVA and Database(Oracle).
	 * return returns a Connection Object
	 */
	public static Connection getConnection() 
	{
		Connection conn = null;
		//Create a connection
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
			return conn;
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			return conn;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			return conn;
		}
	}
}
