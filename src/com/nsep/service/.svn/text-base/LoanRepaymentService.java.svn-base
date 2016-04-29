/**
* It is a Loan Re payment Service that creates instance of loanRepaymentDAO
* and has functions that calls the method of loanRepaymentDAO and performs business logic.
      * @author   	:Dhaval Patel(537643),Arpan Jaiswal(537777)  
      * @version  	:1.0    
      * @Class 		:loanRepaymentService
      * @Creation 	:15-Dec-2011
     * @ History	:
*/

package com.nsep.service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nsep.beans.LoanAccountBean;
import com.nsep.beans.LoanRepaymentBean;
import com.nsep.DAO.LoanRepaymentDAO;

public class LoanRepaymentService
{
	LoanRepaymentDAO dao;
	//LoanRepaymentdao reference is created
	
	public LoanRepaymentService()
	{
		dao = new LoanRepaymentDAO();
		//Object of LoanRepaymentDAO is assigned.
	}
	
	/**
	 * This function is used for search re payment data from the loanRepaymentDAO
	 * @param		:<HttpServletRequest><It is used to pass request from servlet received from client>
	 * 				 <HttpServletResponse><It is used to give response to the client>
	 * @return		:none
	 * @exception 	:throws ServletException, IOException
	 * @since		:<JDK version 1.5>
	 * @see			:LoanRepaymentBean, loanRepaymentDAO
	 */
	public void searchInstallments(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		ArrayList<LoanRepaymentBean> alData = dao.viewInstallments();
		//ArrayList contains the object of LoanRepaymentBean
		request.setAttribute("allInstallments", alData);
		request.getRequestDispatcher("/HTML/Loan_Management/Loan_Repayment/ViewInstallments.jsp").forward(request,response);
	}
	
	/**
	 * This function is used for getting all the data from the loanRepaymentDAO
	 * @param		:<HttpServletRequest><It is used to pass request from servlet received from client>
	 * 				 <HttpServletResponse><It is used to give response to the client>
	 * @return		:none
	 * @exception 	:throws ServletException, IOException
	 * @since		:<JDK version 1.5>
	 * @see			:LoanRepaymentBean, loanRepaymentDAO
	 */
	public void viewInstallments(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		ArrayList<LoanRepaymentBean> alData = dao.viewInstallments();
		//ArrayList contains the object of LoanRepaymentBean
		request.setAttribute("allInstallments", alData);
		request.getRequestDispatcher("/HTML/Loan_Management/Loan_Repayment/ViewInstallments.jsp").forward(request,response);		
	}
	
	/**
	 * This function is used for pass all the data to loanRepaymentDAO for add to database
	 * @param		:<HttpServletRequest><It is used to pass request from servlet received from client>
	 * 				 <HttpServletResponse><It is used to give response to the client>
	 * @return		:none
	 * @exception 	:throws ServletException, IOException
	 * @since		:<JDK version 1.5>
	 * @see			:LoanRepaymentBean, loanRepaymentDAO
	 */
	public void payInstallments(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		LoanRepaymentBean lr = new LoanRepaymentBean();
		//LoanrepaymentBean object is created.
		
		//get the data from request object
		int loanId=Integer.parseInt(request.getParameter("txtLoanId"));
		int studentId=Integer.parseInt(request.getParameter("txtStudentId"));
		double amount=Double.parseDouble(request.getParameter("txtAmount"));
		String repaymentDate=request.getParameter("txtRepaymentDate");
		
		//set the data to bean object
		lr.setLoanId(loanId);
		lr.setStudentId(studentId);
		lr.setAmount(amount);
		lr.setRepaymentDate(repaymentDate);
		
		int repaymentId;
		//repaymentId for newly added payment
		
		if(dao.checkId(lr))
		{
			repaymentId=dao.insertInstallments(lr);
		}
		else
		{
			repaymentId=-1;
		}
		//set repaymentId
		lr.setRepaymentId(repaymentId);
		
		//set attribute to request object.
		request.setAttribute("installmentBean", lr);
		request.getRequestDispatcher("/HTML/Loan_Management/Loan_Repayment/PaidInstallments.jsp").forward(request,response);
	}

	/**
	 * This function is used for getting all the data of one installment from the loanRepaymentDAO
	 * @param		:<HttpServletRequest><It is used to pass request from servlet received from client>
	 * 				 <HttpServletResponse><It is used to give response to the client>
	 * @return		:none
	 * @exception 	:throws ServletException, IOException
	 * @since		:<JDK version 1.5>
	 * @see			:LoanRepaymentBean, loanRepaymentDAO
	 */
	
	public void editInstallments(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		int repaymentId=Integer.parseInt(request.getParameter("hidRepaymentId"));
		LoanRepaymentBean lr=dao.editInstallments(repaymentId);
		request.setAttribute("updateBean", lr);
		request.getRequestDispatcher("/HTML/Loan_Management/Loan_Repayment/UpdateInstallments.jsp").forward(request,response);
	}
	
	/**
	 * This function is used for pass all data of installment to loanRepaymentDAO for update it.
	 * @param		:<HttpServletRequest><It is used to pass request from servlet received from client>
	 * 				 <HttpServletResponse><It is used to give response to the client>
	 * @return		:none
	 * @exception 	:throws ServletException, IOException
	 * @since		:<JDK version 1.5>
	 * @see			:LoanRepaymentBean, loanRepaymentDAO
	 */
	public void updateInstallments(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		LoanRepaymentBean lr = new LoanRepaymentBean();
		//LoanrepaymentBean object is created.
		
		//get the data from request object
		int repaymentId=Integer.parseInt(request.getParameter("txtRepaymentId"));
		int loanId=Integer.parseInt(request.getParameter("txtLoanId"));
		int studentId=Integer.parseInt(request.getParameter("txtStudentId"));
		double amount=Double.parseDouble(request.getParameter("txtAmount"));
		String repaymentDate=request.getParameter("txtRepaymentDate");
	
		//set the data to bean object
		lr.setRepaymentId(repaymentId);
		lr.setLoanId(loanId);
		lr.setStudentId(studentId);
		lr.setAmount(amount);
		lr.setRepaymentDate(repaymentDate);
		
		if(dao.checkId(lr))
		{
			dao.updateInstallments(lr);
		}
		else
		{
			lr.setRepaymentId(0);
		}
		request.setAttribute("installmentBean", lr);
		request.getRequestDispatcher("/HTML/Loan_Management/Loan_Repayment/UpdatedInstallments.jsp").forward(request,response);
	}
	
	/**
	 * This function is used for pass repaymentId loanRepaymentDAO for delete it from database
	 * @param		:<HttpServletRequest><It is used to pass request from servlet received from client>
	 * 				 <HttpServletResponse><It is used to give response to the client>
	 * @return		:none
	 * @exception 	:throws ServletException, IOException
	 * @since		:<JDK version 1.5>
	 * @see			:LoanRepaymentDAO
	 */
	
	public void deleteInstallments(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		int repaymentId=Integer.parseInt(request.getParameter("hidRepaymentId"));
		//Get repaymentId for delete that row and store it to repaymentId.
		
		dao.deleteInstallments(repaymentId);
		viewInstallments(request, response);
	}
	
	
	
	public void generateLoanRepaidCertificate(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		int loanId=Integer.parseInt(request.getParameter("txtLoanId"));
		int studentId=Integer.parseInt(request.getParameter("txtStudentId"));

		LoanAccountBean lab=dao.viewLoanAccount(loanId, studentId);
		double paidAmount=dao.viewPaidAmount(loanId, studentId);
		

		if(paidAmount>=lab.getOutstandingAmount())
		{
			request.setAttribute("lab",lab);
			request.setAttribute("paidAmount", paidAmount);
		}	
		request.getRequestDispatcher("/HTML/Loan_Management/Loan_Repayment/LoanRepaidCertificate.jsp").forward(request,response);		
	}
	
	
	
	public void generateDefaulterList(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		int month=Integer.parseInt(request.getParameter("txtMonth"));
		int year=Integer.parseInt(request.getParameter("txtYear"));
		ArrayList<LoanRepaymentBean> alData = dao.searchDefaulter(month,year);
		//ArrayList contains the object of LoanRepaymentBean
		request.setAttribute("defaulters", alData);
		request.setAttribute("month", month);
		request.setAttribute("year", year);
		request.getRequestDispatcher("/HTML/Loan_Management/Loan_Repayment/GenerateDefaulterList.jsp").forward(request,response);
	}
}

