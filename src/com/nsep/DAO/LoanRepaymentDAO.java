/**
* It is a Loan Re Payment DAO having functions executing database queries.
* It is a model used for interacting with database.
      * @author   	:Dhaval Patel(537643),Arpan Jaiswal(537777)  
      * @version  	:1.0    
      * @Class 		:loanRepaymentDAO
      * @Creation 	:15-Dec-2011
     * @ History	:
*/

package com.nsep.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.nsep.beans.LoanAccountBean;
import com.nsep.beans.LoanRepaymentBean;
import com.nsep.DAOutil.DBHelper_f;

public class LoanRepaymentDAO
{
	/**
	 * This function is used for getting all the data from the database. 
	 * @param		:none
	 * @return		:ArrayList<LoanRepaymentBean> Here ArrayList having objects of LoanRepaymentBean type are returned.
	 * @exception 	:Exception will be generated if Select query is not executed.
	 * @since		:JDK version 1.5
	 * @see			:LoanRepaymentBean, DBHelper_f
	 */
	public ArrayList<LoanRepaymentBean> viewInstallments()
	{
		Connection conn=null;
		//Reference of Connection interface
		Statement statement=null;
		//Reference of Statement interface
		ArrayList<LoanRepaymentBean> alReturn = new ArrayList<LoanRepaymentBean>();
		//Arraylist to store objects of LoanRepaymentBean 
		try
		{    	
			conn = DBHelper_f.getConnection();
			statement = conn.createStatement();
			String sql="SELECT * FROM LOANREPAYMENT";
			ResultSet rs = statement.executeQuery(sql);
		
			while(rs.next())
			{
				LoanRepaymentBean lr = new LoanRepaymentBean();
				
				lr.setRepaymentId(rs.getInt("RepaymentId"));
				lr.setLoanId(rs.getInt("LoanId"));
				lr.setStudentId(rs.getInt("StudentId"));
				lr.setAmount(rs.getDouble("Amount"));
				String ss=rs.getDate("RepaymentDate").toString();
				String sa[]=ss.split("-");
				String ans=sa[1]+"-"+sa[2]+"-"+sa[0];
				lr.setRepaymentDate(ans);
				
				alReturn.add(lr);
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
				statement.close();
				//statement close
				conn.close();
				//conn close
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return alReturn;
	}
	
	/**
	 * This function is used for adding a single LoanRepayment in the database. 
	 * @param		:LoanRepaymentBean LoanRepaymentBean's getters are used to insert LoanRepayment details/attributes>
	 * @return		:int Returns the generated RepaymentId.
	 * @exception 	:Exception will be generated if Select or Insert query is not executed.
	 * @since		:JDK version 1.5
	 * @see			:LoanRepaymentBean, DBHelper_f
	 */
	public int insertInstallments(LoanRepaymentBean newLR)
	{
		Connection conn=null;
		//Reference of Connection interface
		Statement statement=null;
		//Reference of Statement interface
		int repaymentId=0;
		//repaymentId for new Repayment is created.
		
		try
		{    	
			conn = DBHelper_f.getConnection();
			statement = conn.createStatement();
			
			String sql="SELECT MAX(REPAYMENTID) AS RepaymentId FROM LOANREPAYMENT";
			ResultSet rs = statement.executeQuery(sql);
			
			if(rs.next())
			{
				repaymentId=rs.getInt("RepaymentId")+1;	
				//assign new RepaymentId
			}	
			else
			{
				repaymentId=1;
				//assign new RepaymentId for first record
			}
			
			sql="INSERT INTO LOANREPAYMENT VALUES("+repaymentId+","+newLR.getLoanId()+","+newLR.getStudentId()+","+newLR.getAmount()+", to_date('"+newLR.getRepaymentDate()+"','MM-DD-YYYY'))";
			statement.executeUpdate(sql);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				statement.close();
				//statement close
				conn.close();
				//conn close
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return repaymentId;
	}
	
	/**
	 * This function is used for checking Loan Id and Student Id are there in LoanAccount table in the database. 
	 * @param		:LoanRepaymentBean LoanRepaymentBean's getters are used to getting LoanId and StudentId.
	 * @return		:boolean If both Id's are in Database then returns true else false.
	 * @exception 	:Exception will be generated if Select query is not executed.
	 * @since		:JDK version 1.5
	 * @see			:LoanRepaymentBean, DBHelper_f
	 */
	public boolean checkId(LoanRepaymentBean newLR)
	{
		Connection conn=null;
		//Reference of Connection interface
		Statement statement=null;
		//Reference of Statement interface
		try
		{    	
			conn = DBHelper_f.getConnection();
			statement = conn.createStatement();
			
			ResultSet rs = statement.executeQuery("SELECT * FROM LOANACCOUNT WHERE LOANID="+newLR.getLoanId()+" AND STUDENTID="+newLR.getStudentId()+"");
			
			if(rs.next())
			{
				return true;				
			}	
			else
			{
				return false;
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
				statement.close();
				//statement close
				conn.close();
				//conn close
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return false;
	}
	
	/**
	 * This function is used for getting details of a single LoanRepayment from the database. 
	 * @param		:int repaymentId is passed to this method for finding Re payment Details for this Id. 
	 * @return		:LoanRepaymentBean LoanrepaymentBean is returned for Particular RepaymentId.
	 * @exception 	:Exception will be generated if Select query is not executed or connection isn't established.
	 * @since		:JDK version 1.5
	 * @see			:LoanRequestBean,DBHelper_f
	 */
	
	public LoanRepaymentBean editInstallments(int rePaymentId)
	{
		Connection conn=null;
		//Reference of Connection interface
		Statement statement=null;
		//Reference of Statement interface
		LoanRepaymentBean currentLR = new LoanRepaymentBean();
		//LoanRepaymentBean object
		try
		{    	
			conn = DBHelper_f.getConnection();
			statement = conn.createStatement();
					
			ResultSet rs = statement.executeQuery("SELECT * FROM LOANREPAYMENT where REPAYMENTID="+rePaymentId+" ");
			
			if(rs.next())
			{
				currentLR.setRepaymentId(rs.getInt("RepaymentId"));
				currentLR.setLoanId(rs.getInt("LoanId"));
				currentLR.setStudentId(rs.getInt("StudentId"));
				currentLR.setAmount(rs.getDouble("Amount"));
				String ss=rs.getDate("RepaymentDate").toString();
				String sa[]=ss.split("-");
				String ans=sa[1]+"-"+sa[2]+"-"+sa[0];
				currentLR.setRepaymentDate(ans);
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
				statement.close();
				//statement close
				conn.close();
				//conn close
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return currentLR;
	}
	
	/**
	 * This function is used for updating a single LoanRepayment in the database. 
	 * @param		:LoanRepaymentBean LoanRepaymentBean's getters are used to update LoanRepayment details/attributes
	 * @return		:none
	 * @exception 	:Exception will be generated if Update query is not executed or connection isn't established.
	 * @since		:JDK version 1.5
	 * @see			:LoanRepaymentBean,DBHelper_f
	 */
	public void updateInstallments(LoanRepaymentBean newLR)
	{
		Connection conn=null;
		//Reference of Connection interface
		Statement statement=null;
		//Reference of Statement interface
		try
		{    	
			conn = DBHelper_f.getConnection();
			statement = conn.createStatement();
			
			String sql="UPDATE LOANREPAYMENT SET LOANID="+newLR.getLoanId()+", STUDENTID="+newLR.getStudentId()+", AMOUNT="+newLR.getAmount()+", REPAYMENTDATE=to_date('"+newLR.getRepaymentDate()+"','MM-DD-YYYY') WHERE REPAYMENTID="+newLR.getRepaymentId()+" ";
			statement.executeUpdate(sql);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				statement.close();
				//statement close
				conn.close();
				//conn close
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
	}
	
	/**
	 * This function is used for deleting a single LoanRepayment in the database. 
	 * @param		:int RepaymentId is passed as integer and is used for deleting LoanRepayment referring to that.
	 * @return		:none
	 * @exception 	:Exception will be generated if Delete query is not executed.
	 * @since		:JDK version 1.5
	 * @see			:DBHelper_f
	 */
	public void deleteInstallments(int repaymentId)
		{
		Connection conn=null;
		//Reference of Connection interface
		Statement statement=null;
		//Reference of Statement interface
			try
			{    	
				conn = DBHelper_f.getConnection();
				statement = conn.createStatement();
				
				String sql="DELETE FROM LOANREPAYMENT WHERE REPAYMENTID="+repaymentId+"";
				statement.executeUpdate(sql);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally 
			{
				try 
				{
					statement.close();
					//statement close
					conn.close();
					//conn close
				} 
				catch (SQLException se) 
				{
					se.printStackTrace();				
				}
			}
		}	
	
	
	
	public double viewPaidAmount(int loanId,int studentId)
	{
		Connection conn=null;
		Statement statement=null;
		double paidAmount=0;
		try
		{    	
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();
					
			ResultSet rs = statement.executeQuery("SELECT SUM(AMOUNT) AS Amount FROM LOANREPAYMENT where LOANID="+loanId+" and STUDENTID="+studentId+" ");
			
			if(rs.next())
			{
				paidAmount=rs.getDouble("Amount");
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
				// Close down
				statement.close();
				conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return paidAmount;
	}
	
	
	
	public LoanAccountBean viewLoanAccount(int loanId,int studentId)
	{
		Connection conn=null;
		Statement statement=null;
		
		LoanAccountBean la = new LoanAccountBean();
		try
		{    	
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();
					
			ResultSet rs = statement.executeQuery("SELECT * FROM LOANACCOUNT where LOANID="+loanId+" and STUDENTID="+studentId+" ");
			
			if(rs.next())
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
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// Close down
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
	
	
	
	public ArrayList<LoanRepaymentBean> searchDefaulter(int month, int year)
	{
		Connection conn=null;
		//Reference of Connection interface
		Statement statement=null;
		Statement statement1=null;
		
		//Reference of Statement interface
		ArrayList<LoanRepaymentBean> alLA = new ArrayList<LoanRepaymentBean>();
		//Arraylist to store objects of LoanRepaymentBean 
		try
		{    	
			conn = DBHelper_f.getConnection();
			statement = conn.createStatement();
			
			String sql="SELECT * FROM LOANACCOUNT";
			ResultSet rs = statement.executeQuery(sql);
		
			while(rs.next())
			{
				
				LoanRepaymentBean lr=new LoanRepaymentBean();
				
				String startDate=month+"/1/"+year;
				String dueDate=month+"/25/"+year;
				
				int loanId=rs.getInt("LOANID");
				System.out.println(loanId);
				int studentId=rs.getInt("STUDENTID");
				
				sql="SELECT * FROM LOANREPAYMENT where LOANID="+loanId+" and STUDENTID="+studentId+" and REPAYMENTDATE between to_date('"+startDate+"','MM-DD-YYYY') and to_date('"+dueDate+"','MM-DD-YYYY') ";
		
				statement1 = conn.createStatement();
				ResultSet rs1=statement1.executeQuery(sql);
				
				if(rs1.next())
				{
					
				}
				else
				{
					lr.setLoanId(loanId);
					lr.setStudentId(studentId);
					alLA.add(lr);
				}								
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
				statement.close();
				//statement close
				conn.close();
				//conn close
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();				
			}
		}
		return alLA;
	}
}
