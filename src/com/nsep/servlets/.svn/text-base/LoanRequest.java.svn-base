package com.nsep.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.nsep.DAO.loanRequestDAO;
import com.nsep.beans.LoanRequestBean;
import com.nsep.beans.StudentBean;
import com.nsep.service.loanRequestService;

/**
 * It is a Loan Request Servlet that creates instance of loanRequestService and
 * has functions that calls the method of loanRequestService and performs
 * business logic for request and response. It is a controller used for request
 * and response.
 * 
 * @author Bhagyesh Mandal(537673),Pareechi Gandhi(537723)
 * @version 1.0
 * @Class LoanRequest
 * @Creation 15-Dec-2011
 */
public class LoanRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoanRequest() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// try-catch block added
		try {
			String sAction = request.getParameter("action");
			// Null check for sAction Object
			if (sAction != null) {
				loanRequestService service = new loanRequestService();
				if (sAction.equals("View")) {
					service.getAllLoanList(request, response);
				} else if (sAction.equals("update")) {
					int sCount = Integer
							.parseInt(request.getParameter("count"));
					loanRequestDAO dao = new loanRequestDAO();
					ArrayList<LoanRequestBean> alData = dao.listAllData();
					LoanRequestBean updateObj = alData.get(sCount);
					request.setAttribute("foundStudent", updateObj);
					service.updateTable(request, response);
				} else if (sAction.equals("Delete")) {
					String s = request.getParameter("id");
					int i = Integer.parseInt(s);
					service.deleteLoanRequest(request, response, i);
					response.sendRedirect("LoanRequest?action=View");
				} else if (sAction.equals("finalUpdate")) {
					service.finalUpdateLoanRequest(request, response);
				}

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException

	{
		// try-catch block added
		try {
			String h_field = request.getParameter("h_field");
			// Null check for h_field Object
			if (h_field != null) {
				loanRequestService service = new loanRequestService();
				if (h_field.equals("createFirstPage")) {
					StudentBean st = service.searchStudent(request, response);
					request.setAttribute("student", st);
					if (st.getStudentId() == null) {
						RequestDispatcher disp = request
								.getRequestDispatcher("HTML/Loan_Management/Loan_Request/noStudentPage.jsp");
						disp.forward(request, response);

					}
					RequestDispatcher disp = request
							.getRequestDispatcher("HTML/Loan_Management/Loan_Request/createLoanRequest.jsp");
					disp.forward(request, response);
					// response.sendRedirect("LoanRequest?action=View");
				} else if (h_field.equals("createRequest")) {

					service.addNewLoanRequest(request, response);
					response
							.sendRedirect("HTML/Loan_Management/Loan_Request/successInsert.html");
				} else if (h_field.equals("finalUpdate")) {
					service.finalUpdateLoanRequest(request, response);
					response.sendRedirect("LoanRequest?action=View");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
