/**
 * It is a Loan Request DAO having functions executing database queries.
 * It is a model used for interacting with database.
 * @author   	Bhagyesh Mandal(537673),Pareechi Gandhi(537723)  
 * @version  	1.0    
 * @Class 		loanRequestDAO
 * @Creation 	15-Dec-2011
 */

package com.nsep.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.nsep.DAOutil.DBHelper_f;
import com.nsep.beans.LoanRequestBean;
import com.nsep.beans.StudentBean;

public class loanRequestDAO {

	/**
	 * This function is used for getting all the data from the database.
	 * 
	 * @return ArrayList<LoanRequestBean> <Here ArrayList having objects of
	 *         LoanReqoestBean type are returned>
	 */

	public ArrayList<LoanRequestBean> listAllData() {
		Connection conn = null; //Create instance of Connection class
		
		Statement statement = null; //Create instance of Statement class
		
		ArrayList<LoanRequestBean> alReturn = new ArrayList<LoanRequestBean>(); //Create instance of ArrayList<LoanRequestBean> class
		
		try {
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();

			ResultSet rs_select = statement
					.executeQuery("SELECT * FROM LOANREQUEST");

			// Print the result set
			while (rs_select.next()) {
				LoanRequestBean lR = new LoanRequestBean(); //Create instance of com.nsep.beans.LoanRequestBean class
				lR.setLoanId(rs_select.getInt("LOANID"));
				lR.setFirstName(rs_select.getString("FIRSTNAME"));
				lR.setMiddleName(rs_select.getString("MIDDLENAME"));
				lR.setLastName(rs_select.getString("LASTNAME"));
				lR.setStudentId(rs_select.getInt("STUDENTID"));
				lR.setLoanPurpose(rs_select.getString("LOANPURPOSE"));
				lR.setLoanAmount(rs_select.getDouble("LOANAMOUNT"));
				lR.setRepaymentPeriod(rs_select.getInt("REPAYMENTPERIOD"));
				lR.setStatus(rs_select.getString("STATUS"));
				alReturn.add(lR);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return alReturn;
	}

	/**
	 * This function is used for adding a single LoanRequest in the database.
	 * 
	 * @param newLoanRequest
	 *            <LoanRequestBean> <LoanRequestBean's getters are used to
	 *            insert LoanRequest details/attributes>
	 */

	public void addLoanRequest(LoanRequestBean newLoanRequest) {

		Connection conn = null; //Create instance of Connection class
		Statement statement = null; //Create instance of Statement class
		try {
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();

			int loanId;

			ResultSet rs_insert = statement
					.executeQuery("SELECT MAX(LOANID) AS LoanId FROM LOANREQUEST");

			if (rs_insert.next())

			{
				loanId = rs_insert.getInt("LoanId") + 1;

			} else {
				loanId = 100000000;
			}

			String sql_insert = "INSERT INTO LOANREQUEST(LOANID, FIRSTNAME,"
					+ " MIDDLENAME, LASTNAME, STUDENTID, LOANPURPOSE, "
					+ "LOANAMOUNT, REPAYMENTPERIOD, STATUS) VALUES(" + loanId
					+ ",'" + newLoanRequest.getFirstName() + "','"
					+ newLoanRequest.getMiddleName() + "','"
					+ newLoanRequest.getLastName() + "',"
					+ newLoanRequest.getStudentId() + ",'"
					+ newLoanRequest.getLoanPurpose() + "',"
					+ newLoanRequest.getLoanAmount() + ","
					+ newLoanRequest.getRepaymentPeriod() + ",'Initiated')";
			statement.executeUpdate(sql_insert);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close down
				statement.close();
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

	/**
	 * This function is used for deleting a single LoanRequest in the database.
	 * 
	 * @param id
	 *            <int> <LoanId is passed as integer and is used for deleting
	 *            LoanRequest referring to that>
	 */

	public void DeleteData(int id) {
		Connection conn = null; //Create instance of Connection class
		Statement statement = null; //Create instance of Statement class

		try {
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();

			statement.executeUpdate("DELETE FROM LOANREQUEST WHERE LOANID="
					+ id + "");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close down
				statement.close();
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

	/**
	 * This function is used for updating a single LoanRequest in the database.
	 * 
	 * @param person
	 *            <LoanRequestBean> <LoanRequestBean's getters are used to
	 *            update LoanRequest details/attributes>
	 */

	public void updateCustomerInDB(LoanRequestBean person) {
		Connection conn = null; //Create instance of Connection class
		Statement statement = null; //Create instance of Statement class
 
		try {
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();

			statement.executeQuery("UPDATE LOANREQUEST SET FIRSTNAME='"
					+ person.getFirstName() + "',LASTNAME='"
					+ person.getLastName() + "',MIDDLENAME='"
					+ person.getMiddleName() + "',STUDENTID='"
					+ person.getStudentId() + "',LOANPURPOSE='"
					+ person.getLoanPurpose() + "',LOANAMOUNT='"
					+ person.getLoanAmount() + "',REPAYMENTPERIOD='"
					+ person.getRepaymentPeriod() + "'WHERE LOANID='"
					+ person.getLoanId() + "'");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close down
				statement.close();
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

	public StudentBean searchStudentFromDB(int id) 
	{
		Connection conn = null; //Create instance of Connection class
		Statement statement = null; //Create instance of Statement class
		StudentBean st = new StudentBean();
		try {
			conn = DBHelper_f.getConnection();

			// Create a statement object
			statement = conn.createStatement();

			ResultSet rs = statement.executeQuery("SELECT * FROM DUMMYSTUDENT WHERE STUDENT_ID='"+id+"'");
						
			while (rs.next())
			{
				st.setStudentId(rs.getString("STUDENT_ID"));
				st.setFirstName(rs.getString("FIRST_NAME"));
				st.setMiddleName(rs.getString("MIDDLE_NAME"));
				st.setLastName(rs.getString("LAST_NAME"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close down
				statement.close();
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return st;
	}

}
