<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.nsep.beans.LoanRequestBean"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
<title>Create Loan Request Home</title>
<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css" />
<script type="text/javascript" src="createLoanRequest2.js"></script>
</head>

<body onLoad="document.createLoanRequest.FirstName.focus();">
<div id="main">
<div id="header">
<div id="logo">
<div id="logo_text">
<h1>NSEP<span class="alternate_colour"> System</span></h1>
</div>
</div>
<div id="menubar">
<ul id="menu">
	<li><a href="#">Home</a></li>
	<li><a
		href="#">User
	Management</a></li>
	<li><a href="#">Account
	Management</a></li>
	<li class="tab_selected"><a
		href="/NSEP_System/HTML/Loan_Management/LMHome.html">Loan
	Management</a></li>
</ul>
</div>
</div>
<div id="site_content">
<div class="sidebar">
<table>
	<tr>
		<td id="menu_button"><a
			href="/NSEP_System/HTML/Loan_Management/Loan_Request/LoanRequestHomePage.html">Loan
		Request Home</a></td>
	</tr>
	<tr>
		<td id="menu_button"><a
			href="/NSEP_System/HTML/Loan_Management/Loan_Request/createLoanRequestFirstPage.html">Create
		Loan Request</a></td>
	</tr>
	<tr>
		<td id="menu_button"><a href="../../../LoanRequest?action=View" />View
		Loan Request</a></td>
	</tr>
	<tr>
		<td id="menu_button"><a
			href="/NSEP_System/HTML/Loan_Management/Loan_Request/approveLoanRequest.jsp">Approve
		Loan Request</a></td>
	</tr>
	<!--  <tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Request/updateLoanRequest.html"/>Update Loan Request</a></td></tr>
    			<tr><td id="menu_button"><a href/>Approve Loan Request</a></td></tr>
    			<tr><td id="menu_button"><a href/>Delete Loan Request</a></td></tr>
-->
</table>
</div>

<div id="content">
<h1>View Loan Request</h1>

<%
	ArrayList<LoanRequestBean> aLoanRequestList = new ArrayList<LoanRequestBean>();
	aLoanRequestList = (ArrayList<LoanRequestBean>) request.getAttribute("LoanDetails");

	int isize = aLoanRequestList.size();
%>
<form>
<table border='1' width='40%'>

	<tr>
		<th>Loan Id</th>
		<th>First Name</th>
		<th>Student Id</th>
		<th>Loan Purpose</th>
		<th>Loan Amount</th>
		<th>Repayment Period</th>
		<th>Status</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>

	<%
		for (int i = 0; i < isize; i++)

		{

			LoanRequestBean loanObj = aLoanRequestList.get(i);
	%>


	<tr>
		<td><%=loanObj.getLoanId()%></td>

		<td><%=loanObj.getFirstName()%></td>

		<td><%=loanObj.getStudentId()%></td>

		<td><%=loanObj.getLoanPurpose()%></td>

		<td><%=loanObj.getLoanAmount()%></td>

		<td><%=loanObj.getRepaymentPeriod()%></td>

		<td><%=loanObj.getStatus()%></td>

		<td><input type='button' class='gridbutton' value='Update' onclick="window.location.href='LoanRequest?action=update&count=<%=i%>'" /></td>

		<td><input type='button' class='gridbutton' value='Delete' onclick="window.location.href='LoanRequest?action=Delete&id=<%= loanObj.getLoanId()%>'"/></td>
	</tr>

	<%
		}
	%>




</table>
</form>


</div>

<div id="site_content_bottom"></div>
</div>
<div id="footer">Copyright &copy; NSEP System. All Rights
Reserved.</div>
</div>
</body>
</html>
