package com.nsep.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.nsep.beans.LoanAccountBean;
import com.nsep.DAOutil.DBHelper_f;

/**
 * DAO for Loan Account Module.
 * @author Ravi Patel, Bhagyashree Soni
 * @version 1.0     
 * @Class LoanAccountDAO
 * @Creation 30-DEC-2011
 */
public class LoanAccountDAO 
{
	/**
	 * Insert Loan Account in database.
	 * @param newLA	Loan Account to be inserted in database
	 * @since JDK 1.5.0
	 */
	public void insertLoanAccount(LoanAccountBean newLA)
	{
		Connection conn=null;
		//Create a new Connection object
		Statement statement=null;
		//Create a new Statement Object
		
		try
		{    	
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();
			
			statement.executeQuery(
			"INSERT INTO loanAccount (ACCOUNTNUMBER, LOANID, FIRSTNAME, MIDDLENAME, LASTNAME, STUDENTID, LOANAMOUNT, TENURE, OUTSTANDINGAMOUNT, STARTDATE, BANKNAME) VALUES('"+newLA.getAccountNumber()+"','"+newLA.getLoanId()+"','"+newLA.getFirstName()+"','"+newLA.getMiddleName()+"','"+newLA.getLastName()+"','"+newLA.getStudentId()+"','"+newLA.getLoanAmount()+"','"+newLA.getTenure()+"','"+newLA.getOutstandingAmount()+"',to_date('"+newLA.getStartDate()+"','MM-DD-YYYY'),'"+newLA.getBankName()+"')" );
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// Close Connection
				statement.close();
				conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
	}
	
	/**
	 * Retrieve the list of all Loan Accounts from database.
	 * @return Returns an ArrayList of Loan Account.
	 */
	public ArrayList<LoanAccountBean> retrieveAllLoanAccount()
	{
		Connection conn=null;
		//Create a new Connection object
		Statement statement=null;
		//Create a new Statement Object
		
		ArrayList<LoanAccountBean> alReturn = new ArrayList<LoanAccountBean>();
		// return ArrayList
		
		try
		{    	
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();

			
			ResultSet rs = statement.executeQuery(
			"SELECT * FROM loanAccount" );
			
			// Print the result set
			while(rs.next())
			{
				LoanAccountBean la = new LoanAccountBean();
				la.setFirstName(rs.getString("FIRSTNAME"));
				la.setMiddleName(rs.getString("MIDDLENAME"));
				la.setLastName(rs.getString("LASTNAME"));
				la.setLoanId(rs.getInt("LOANID"));
				la.setAccountNumber(rs.getString("ACCOUNTNUMBER"));
				la.setBankName(rs.getString("BANKNAME"));
				la.setLoanAmount(rs.getDouble("LOANAMOUNT"));
				la.setOutstandingAmount(rs.getDouble("OUTSTANDINGAMOUNT"));
				la.setStartDate(rs.getString("STARTDATE"));
				la.setStudentId(rs.getInt("STUDENTID"));
				la.setTenure(rs.getInt("TENURE"));
				
				alReturn.add(la);
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// Close Connection
				statement.close();
				conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return alReturn;
	}
	
	
	public int checkAccountNumber(String accNo)
	{
		Connection conn=null;
		//Create a new Connection object
		Statement statement=null;
		//Create a new Statement Object
		
		int flag = 0;
		// return integer
		
		try
		{    	
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();

			
			ResultSet rs = statement.executeQuery(
			"SELECT * FROM loanAccount where ACCOUNTNUMBER='"+accNo+"'" );
			
			// Print the result set
			while(rs.next())
			{
				flag++;
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// Close Connection
				statement.close();
				conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return flag;
	}
	
	
	
	/**
	 * Retrieve the Loan Account details of the given Loan ID from database. 
	 * @param loanID	The requested Loan ID
	 * @return Returns the LoanAccountBean for requested Loan Account
	 * @since JDK 1.5.0
	 */
	public LoanAccountBean retrieveLoanAccountById(int loanID)
	{
		Connection conn=null;
		//Create a new Connection object
		Statement statement=null;
		//Create a new Statement Object
		
		LoanAccountBean la = new LoanAccountBean();
		//return LoanAccountBean object
		
		try
		{    	
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();

			ResultSet rs = statement.executeQuery(
			"SELECT * FROM loanAccount where LOANID="+loanID+"" );
			
			// Print the result set
			if(rs.next()==true)
			{				
				la.setFirstName(rs.getString("FIRSTNAME"));
				la.setMiddleName(rs.getString("MIDDLENAME"));
				la.setLastName(rs.getString("LASTNAME"));
				la.setLoanId(rs.getInt("LOANID"));
				la.setAccountNumber(rs.getString("ACCOUNTNUMBER"));
				la.setBankName(rs.getString("BANKNAME"));
				la.setLoanAmount(rs.getDouble("LOANAMOUNT"));
				la.setOutstandingAmount(rs.getDouble("OUTSTANDINGAMOUNT"));
				la.setStartDate(rs.getString("STARTDATE"));
				la.setStudentId(rs.getInt("STUDENTID"));
				la.setTenure(rs.getInt("TENURE"));
			
			}			
			else
				la.setStatus(false);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// Close Connection
				statement.close();
				conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return la;
	}

	/**
	 * Retrieve the Loan Request details for the given Loan ID from database.
	 * @param loanID 
	 * @return Returns LoanRequestBean for the requested Loan ID.
	 * @since JDK 1.5.0
	 */
	public LoanAccountBean retrieveLoanRequest(int loanID)
	{
		Connection conn=null;
		//Create a new Connection object
		Statement statement=null;
		//Create a new Statement Object
		
		LoanAccountBean la = new LoanAccountBean();
		//return LoanAccountBean object
		
		try
		{    	
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();

			ResultSet rs = statement.executeQuery(
			"SELECT * FROM loanrequest where LOANID="+loanID+"" );
			
			
			// Print the result set
			if(rs.next()==true)
			{				
				la.setFirstName(rs.getString("FIRSTNAME"));
				la.setMiddleName(rs.getString("MIDDLENAME"));
				la.setLastName(rs.getString("LASTNAME"));
				la.setLoanId(rs.getInt("LOANID"));
				la.setLoanAmount(rs.getDouble("LOANAMOUNT"));
				la.setOutstandingAmount(rs.getDouble("LOANAMOUNT"));
				la.setStudentId(rs.getInt("STUDENTID"));
				la.setTenure(rs.getInt("REPAYMENTPERIOD"));
			}			
			else
				la.setStatus(false);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// Close Conection
				statement.close();
				conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return la;
	}
	
	/**
	 * Update the Loan Account Details in database.
	 * @param newLA	Loan Account to be edited.
	 * @since JDK 1.5.0
	 */
	public void updateLoanAccount(LoanAccountBean newLA)
	{
		Connection conn=null;
		//Create a new Connection object
		Statement statement=null;
		//Create a new Statement Object
		
		try
		{    	
			conn = DBHelper_f.getConnection();
	
			// Create a statement object
			statement = conn.createStatement();
			statement.executeQuery(
					
			"update loanAccount set ACCOUNTNUMBER='"+newLA.getAccountNumber()+"', FIRSTNAME='"+newLA.getFirstName()+"', MIDDLENAME='"+newLA.getMiddleName()+"', LASTNAME='"+newLA.getLastName()+"', STUDENTID='"+newLA.getStudentId()+"', LOANAMOUNT='"+newLA.getLoanAmount()+"', TENURE='"+newLA.getTenure()+"', OUTSTANDINGAMOUNT='"+newLA.getOutstandingAmount()+"', STARTDATE=to_date('"+newLA.getStartDate()+"','MM-DD-YYYY'), BANKNAME='"+newLA.getBankName()+"' where LOANID='"+newLA.getLoanId()+"'");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// Close Connection
				statement.close();
				conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
	}
	
	/**
	 * Delete the Loan Account from database.
	 * @param newLA The Loan Account Details to be deleted.
	 * @since JDK 1.5.0
	 */
	public void deleteLoanAccount(LoanAccountBean newLA)
	{
		Connection conn=null;
		//Create a new Connection object
		Statement statement=null;
		//Create a new Statement Object
		
		try
		{    	
			conn = DBHelper_f.getConnection();
	
			// Create a statement object
			statement = conn.createStatement();
			statement.executeQuery(
					
			"delete from loanAccount where LOANID='"+newLA.getLoanId()+"'");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// Close Connection
				statement.close();
				conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
	}
}