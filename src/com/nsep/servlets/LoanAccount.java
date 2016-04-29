package com.nsep.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.nsep.service.LoanAccountService;

/**
 * This is a Servlet class for LoanAccount Module. 
 * @author Ravi Patel , Bhagyashree Soni
 * @Version v1.0
 * @Class Name LoanAccount
 * @Creation Date 30-DEC-2011
 * @History
 */

public class LoanAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	//Default Constructor of LoanAccount
	
	
	
    public LoanAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * This method is used to response all requests.
	 * @param request
	 * @param response
	 * @exception ServletException , IOException
	 * @since JDK 1.5.0 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		try {
			String h_field;
			// h_field variable is used to identify all requests.
			
			h_field= request.getParameter("h_field");
			
			if(h_field.equals("add1"))
			{
				LoanAccountService service = new LoanAccountService();
				service.findLoanRequest(request, response);
			}
			else if(h_field.equals("add2"))
			{
				LoanAccountService service = new LoanAccountService();
				service.addLoanAccount(request, response);
			}
			else if(h_field.equals("del1"))
			{
				LoanAccountService service = new LoanAccountService();
				service.deleteLoanAccount(request, response);
			}
			else if(h_field.equals("edit1"))
			{
				LoanAccountService service = new LoanAccountService();
				service.editAccount(request, response);
			}
			else if(h_field.equals("edt2"))
			{
				LoanAccountService service = new LoanAccountService();
				service.editLoanAccount(request, response);			
			}
			else if(h_field.equals("viewList"))
			{	
				LoanAccountService service = new LoanAccountService();
				service.getAllLoanAccountList(request, response);
			}
			else if(h_field.equals("vew1"))
			{	
				LoanAccountService service = new LoanAccountService();
				service.getLoanAccount(request, response);
			}
			else if(h_field.equals("view_by_id"))
			{	
				LoanAccountService service = new LoanAccountService();
				service.getLoanAccount(request, response);
			}
			else if(h_field.equals("edit"))
			{	
				LoanAccountService service = new LoanAccountService();
				service.editAccount(request, response);
			}
			else if(h_field.equals("delete"))
			{
				LoanAccountService service = new LoanAccountService();
				service.deleteLoanAccount(request, response);
			}
			else if(h_field.equals("exit"))
			{	
				response.sendRedirect("HTML/Loan_Management/Loan_Account/loanAccountMenu.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
