package com.nsep.service;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.nsep.DAO.loanRequestDAO;
import com.nsep.beans.LoanRequestBean;
import com.nsep.beans.StudentBean;

/**
 * It is a Loan Request Service that creates instance of loanRequestDAO and has
 * functions that calls the method of loanRequestDAO and performs business
 * logic. It is a model used for interaction between LoanRequest Servlet and
 * loanRequestDAO.
 * 
 * @author Bhagyesh Mandal(537673),Pareechi Gandhi(537723)
 * @version 1.0
 * @Class loanRequestService
 * @Creation 15-Dec-2011 
 */

public class loanRequestService {

	loanRequestDAO dao; // Create instance of com.nsep.DAO.loanRequestDAO Class

	// constructor
	public loanRequestService() {
		dao = new loanRequestDAO();
	}

	/**
	 * This function is used for getting all the data from the loanRequestDAO
	 * through listAllData().
	 * 
	 * @param request
	 *            <HttpServletRequest> <It is used to pass request from servlet
	 *            received from client>
	 * @param response
	 *            <HttpServletResponse> <It is used to give response to the
	 *            client>
	 * @throws ServletException
	 * @throws IOException
	 * @since <JDK version 1.5>
	 * @see listAllData() of com.nsep.DAO.loanRequestDAO Class
	 */
	public void getAllLoanList(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// try-catch block added
		try {
			ArrayList<LoanRequestBean> alData = dao.listAllData();
			// Null check for object
			if (alData != null) {
				request.setAttribute("LoanDetails", alData);
				RequestDispatcher disp = request
						.getRequestDispatcher("HTML/Loan_Management/Loan_Request/viewLoanRequest.jsp");
				disp.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This function is used for adding new LoanRequest by getting client
	 * request and passing it to loanRequestDAO's addLoanRequest() method.
	 * 
	 * @param request
	 *            <HttpServletRequest> <It is used to pass request from servlet
	 *            received from client>
	 * @param response
	 *            <HttpServletResponse> <It is used to give response to the
	 *            client>
	 * @throws ServletException
	 * @throws IOException
	 * @since <JDK version 1.5>
	 * @see addLoanRequest(LoanRequestBean) of com.nsep.DAO.loanRequestDAO
	 *      Class, setters of LoanRequestBean Class
	 */
	public void addNewLoanRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// try-catch block added
		try {
			LoanRequestBean addedLR = new LoanRequestBean();
			// Null check of object

			if (addedLR != null) {
				addedLR.setFirstName(request.getParameter("FirstName"));
				addedLR.setMiddleName(request.getParameter("MiddleName"));
				addedLR.setLastName(request.getParameter("LastName"));
				addedLR.setStudentId(Integer.parseInt(request
						.getParameter("StudentId")));
				addedLR.setLoanPurpose(request.getParameter("LoanPurpose"));
				addedLR.setLoanAmount(Double.parseDouble(request
						.getParameter("LoanAmount")));
				addedLR.setRepaymentPeriod(Integer.parseInt(request
						.getParameter("RepaymentPeriod")));
				dao.addLoanRequest(addedLR);
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This function is used for viewing LoanRequest that is to be updated by
	 * getting client request and responses to client the JSP for update.
	 * 
	 * @param request
	 *            <HttpServletRequest><It is used to pass request from servlet
	 *            received from client>
	 * @param response
	 *            <HttpServletResponse><It is used to give response to the
	 *            client>
	 * @throws ServletException
	 * @throws IOException
	 * @since <JDK version 1.5>
	 */
	public void updateTable(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// try-catch block added
		try {
			RequestDispatcher disp = request
					.getRequestDispatcher("HTML/Loan_Management/Loan_Request/updateLoanRequest.jsp");
			disp.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This function is used for updating LoanRequest that is requested by
	 * getting client request and passes it to loanRequestDAO's
	 * updateCustomerInDB() method.
	 * 
	 * @param request
	 *            <HttpServletRequest><It is used to pass request from servlet
	 *            received from client>
	 * @param response
	 *            <HttpServletResponse><It is used to give response to the
	 *            client>
	 * @since <JDK version 1.5>
	 * @see of updateCustomerInDB(LoanRequestBean) of
	 *      com.nsep.DAO.loanRequestDAO Class
	 */
	public void finalUpdateLoanRequest(HttpServletRequest request,
			HttpServletResponse response) {
		// try-catch block added
		try {
			LoanRequestBean loanObj = new LoanRequestBean();
			// try-catch block added to check whether object is null or not
			// Null check for Object
			if (loanObj != null) {
				loanObj.setLoanId(Integer.parseInt(request
						.getParameter("LoanId")));
				loanObj.setFirstName(request.getParameter("FirstName"));
				loanObj.setMiddleName(request.getParameter("MiddleName"));
				loanObj.setLastName(request.getParameter("LastName"));
				loanObj.setStudentId(Integer.parseInt(request
						.getParameter("StudentId")));
				loanObj.setLoanPurpose(request.getParameter("LoanPurpose"));
				loanObj.setLoanAmount(Double.parseDouble(request
						.getParameter("LoanAmount")));
				loanObj.setRepaymentPeriod(Integer.parseInt(request
						.getParameter("RepaymentPeriod")));
				// Null check for Request Parameters
				if ((request.getParameter("FirstName")) != null
						|| (request.getParameter("MiddleName")) != null
						|| (request.getParameter("LastName")) != null
						|| (request.getParameter("StudentId")) != null
						|| (request.getParameter("LoanPurpose")) != null
						|| (request.getParameter("LoanAmount")) != null
						|| (request.getParameter("RepaymentPeriod")) != null) {
					dao.updateCustomerInDB(loanObj);
				}

			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This function is used for deleting the requested LoanRequest by LoanId
	 * and it is passed to loanRequestDAO's DeleteData() method.
	 * 
	 * @param request
	 *            <HttpServletRequest><It is used to pass request from servlet
	 *            received from client>
	 * @param response
	 *            <HttpServletResponse><It is used to give response to the
	 *            client>
	 * @param id
	 *            <int> <Loan Id is provided>
	 * @throws ServletException
	 * @throws IOException
	 * @since <JDK version 1.5>
	 * @see DeleteData(int) of com.nsep.DAO.loanRequestDAO Class
	 */
	public void deleteLoanRequest(HttpServletRequest request,
			HttpServletResponse response, int id) throws ServletException,
			IOException {
		// try-catch block added
		try {
			dao.DeleteData(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public StudentBean searchStudent(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException
	{
		int id = Integer.parseInt(request.getParameter("studentId"));
		StudentBean student = dao.searchStudentFromDB(id);
		return student;
	
		
	}
}
