package com.nsep.service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nsep.beans.*;
import com.nsep.DAO.*;

/**
 * Service for Loan Account Module.
 * @author Ravi Patel, Bhagyashree Soni     
 * @version 1.0     
 * @Class LoanAccountService
 * @Creation 30-DEC-2011
 */

public class LoanAccountService
{
	LoanAccountDAO dao;
	
	/**
	 * Constructs an object of LoanAccountService with an instance of LoanAccountDAO
	 */
	public LoanAccountService()
	{
		dao = new LoanAccountDAO();
	}

	/**
	 * Inserts a New Loan Account.
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @since JDK 1.5.0
	 * @see getAllLoanAccountList
	 */
	public void addLoanAccount(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		try {
			LoanAccountBean la = new LoanAccountBean();
			//Object of LoanAccountBean to store the details of new Loan Account.
			
			int flag=dao.checkAccountNumber(request.getParameter("acc_no"));
			
			if(flag==0)
			{
				la.setLoanId(Integer.parseInt(request.getParameter("loan_id_field")));
				la.setStudentId(Integer.parseInt(request.getParameter("student_id_field")));
				la.setLoanAmount(Double.parseDouble(request.getParameter("loan_amount_field")));
				la.setTenure(Integer.parseInt(request.getParameter("tenure_field")));
				la.setStartDate(request.getParameter("start_date"));
				la.setAccountNumber(request.getParameter("acc_no"));
				la.setBankName(request.getParameter("bank"));
				la.setFirstName(request.getParameter("first_name_field"));
				la.setMiddleName(request.getParameter("middle_name_field"));
				la.setLastName(request.getParameter("last_name_field"));
				la.setOutstandingAmount(Double.parseDouble(request.getParameter("outstanding_amount_field")));

				dao.insertLoanAccount(la);
				getAllLoanAccountList(request, response);
			}
			else
			{
				String date = request.getParameter("start_date");
				String[] data = date.split("-");
				String month = data[0];
				String day = data[1];
				String year = data[2];
				
				la=(LoanAccountBean)dao.retrieveLoanAccountById(Integer.parseInt(request.getParameter("loan_id_field")));
				la.setStartDate(year+"-"+month+"-"+day);
				la.setAccountNumber(request.getParameter("acc_no"));
				la.setBankName(request.getParameter("bank"));
				request.setAttribute("editObj", la);	
				String msg = "This Account Number Already exist";
				request.setAttribute("msg", msg);		
				request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/addLoanAccount2.jsp").forward(request,response);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Searches the Loan Request from the given Loan ID.
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @since JDK 1.5.0
	 */
	public void findLoanRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		try {
			LoanAccountBean la1 = new LoanAccountBean();
			//Object of LoanAccountBean to find the Loan Id in LoanRequest database
			LoanAccountBean la2 = new LoanAccountBean();
			//Object of LoanAccountBean to find the Loan Id in LoanAccount database
			
			int id;
			//requested Loan ID
			id  = Integer.parseInt(request.getParameter("loan_id"));
			
			la1=dao.retrieveLoanRequest(id);
			la2=dao.retrieveLoanAccountById(id);
			
			if(la1.getFirstName()==null)
			{
				String msg="The requested Loan ID does not exist";
				request.setAttribute("msg",msg );
				request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/addLoanAccount1.jsp").forward(request,response);
			}
			else if(la2.getFirstName()!=null)
			{
				String msg="The Loan Account for this ID already exists";
				request.setAttribute("msg",msg );
				request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/addLoanAccount1.jsp").forward(request,response);
			}
			else
			{
				request.setAttribute("laObj", la1);
				request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/addLoanAccount2.jsp").forward(request,response);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Fetches all the Loan Account details.
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @since JDK 1.5.0
	 */
	public void getAllLoanAccountList(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		try {
			ArrayList<LoanAccountBean> alData = new ArrayList<LoanAccountBean>();
			//ArrayList to Store all LoanAccount
			alData = dao.retrieveAllLoanAccount();
			
			if(alData!=null)
			{
				request.setAttribute("al", alData);
			}
			
			request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/viewAllLoanAccount.jsp").forward(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	/**
	 * Fetches the Loan Account Details with the given Loan ID(View by ID).
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @since JDK 1.5.0
	 */
	public void getLoanAccount(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		try {
			LoanAccountBean la = new LoanAccountBean();
			//Loan Account Bean to Store the details of requested Loan Account
			
			String sId = null;
			//Get the Loan Id from request
			sId= request.getParameter("id_field");
			
			int id;
			//Store the Loan ID
			id= Integer.parseInt(sId);
			
			la=dao.retrieveLoanAccountById(id);
			if(la.getFirstName()!=null)
			{
				request.setAttribute("editObj", la);
				RequestDispatcher rd = request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/viewLoanAccount2.jsp");
				rd.forward(request, response);
			}
			else
			{	
				String msg="Loan ID not found";
				request.setAttribute("msg",msg );
				RequestDispatcher rd = request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/viewLoanAccount1.jsp");
				rd.forward(request, response);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Fetches the details of Loan Account to be edited (Grid view).
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @since JDK 1.5.0
	 */
	public void editAccount(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		try {
			LoanAccountBean la = new LoanAccountBean();
			//Loan Account Bean to Store the details of requested Loan Account
			
			String sId = null;
			//Get the Loan Id from request
			sId = request.getParameter("id_field");
			
			int id;
			//Store the Loan ID
			id = Integer.parseInt(sId);
			
			la=(LoanAccountBean)dao.retrieveLoanAccountById(id);
			
			if(la.getFirstName()==null)
			{
				String msg = "The requested Loan ID does not exist";
				request.setAttribute("msg", msg);		
				request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/editLoanAccount1.jsp").forward(request,response);
			}
			else
			{
				request.setAttribute("editObj", la);		
				request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/editLoanAccount2.jsp").forward(request,response);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Edits the Loan Account Details.
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @see getAllLoanAccountList
	 */
	public void editLoanAccount(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		try {
			LoanAccountBean la = new LoanAccountBean();
			//Loan Account Bean to Store the details of requested Loan Account
			
			int flag=dao.checkAccountNumber(request.getParameter("acc_no"));
			
			if(flag==0)
			{
				la.setLoanId(Integer.parseInt(request.getParameter("loan_id_field")));
				la.setStudentId(Integer.parseInt(request.getParameter("student_id_field")));
				la.setLoanAmount(Double.parseDouble(request.getParameter("loan_amount_field")));
				la.setTenure(Integer.parseInt(request.getParameter("tenure_field")));
				la.setStartDate(request.getParameter("start_date"));
				la.setAccountNumber(request.getParameter("acc_no"));
				la.setBankName(request.getParameter("bank"));
				la.setFirstName(request.getParameter("first_name_field"));
				la.setMiddleName(request.getParameter("middle_name_field"));
				la.setLastName(request.getParameter("last_name_field"));
				la.setOutstandingAmount(Double.parseDouble(request.getParameter("outstanding_amount_field")));
			
				dao.updateLoanAccount(la);
				getAllLoanAccountList(request, response);
			}
			else
			{
				String date = request.getParameter("start_date");
				String[] data = date.split("-");
				String month = data[0];
				String day = data[1];
				String year = data[2];
				
				la=(LoanAccountBean)dao.retrieveLoanAccountById(Integer.parseInt(request.getParameter("loan_id_field")));
				la.setStartDate(year+"-"+month+"-"+day);
				la.setAccountNumber(request.getParameter("acc_no"));
				la.setBankName(request.getParameter("bank"));
				request.setAttribute("editObj", la);	
				String msg = "This Account Number Already exist";
				request.setAttribute("msg", msg);		
				request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/editLoanAccount2.jsp").forward(request,response);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Deletes the Loan Account.
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @see getAllLoanAccountList
	 */
	public void deleteLoanAccount(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		try {
			LoanAccountBean la = new LoanAccountBean();
			//Loan Account Bean to Store the details of requested Loan Account
			
			String sId = null;
			//Get the Loan Id from request
			sId = request.getParameter("id_field");
			
			int id;
			//Store the Loan ID
			id = Integer.parseInt(sId);
			
			la=(LoanAccountBean)dao.retrieveLoanAccountById(id);
			
			if(la.getFirstName()==null)
			{
				String msg = "Loan ID not found";
				request.setAttribute("msg", msg);		
				request.getRequestDispatcher("/HTML/Loan_Management/Loan_Account/deleteLoanAccount1.jsp").forward(request,response);
			}
			else
			{
				la.setLoanId(id);
				//Store the Loan ID
				
				dao.deleteLoanAccount(la);
				getAllLoanAccountList(request, response);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}