<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.nsep.beans.LoanRepaymentBean"%>

<%@page import="com.nsep.beans.LoanAccountBean"%><html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
<title>Loan Repaid Certificate</title>
<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css" />
<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/CalendarControl.css" />
<script src="/NSEP_System/JavaScript/CalendarControl.js" language="javascript"></script>
</head>

<body>
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
		<li><a href="#">User Management</a></li>
		<li><a href="#">Account Management</a></li>
		<li class="tab_selected"><a href="/NSEP_System/HTML/Loan_Management/LMHome.html">Loan Management</a></li>
</ul>
</div>
</div>
<div id="site_content">
<div class="sidebar">
<table>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Repayment/LR_Home.html">Loan Repayment Home</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Repayment/PayInstallments.html">Pay Installments</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Repayment/ViewInstallments.jsp">View Installments</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Repayment/GenerateDefaulterList.html">Generate Defaulter List</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Repayment/LoanRepaidCertificate.html">Loan Repaid Certificate</a></td></tr>
</table>
</div>

<div id="content">
<%
	LoanAccountBean lab=(LoanAccountBean)request.getAttribute("lab");
	Double paidAmount=(Double)request.getAttribute("paidAmount");
	if(lab==null)
	{
%>
<br/>
<br/>
<b>Installments Are Not Paid, So You Can Not Generate Loan Repaid Certificate.</b>
<%
	} 
	else
	{
%>
<h1>Loan Repaid Certificate</h1>
<table cellpadding="10px" cellspacing="10px">
	<tr>
		<td><b>Loan Id</b></td>
		<td><%=lab.getLoanId()%></td>
	</tr>
	<tr>
		<td><b>Student Id</b></td>
		<td><%=lab.getStudentId()%></td>
	</tr>
	<tr>
		<td><b>Student Name</b></td>
		<td><%=lab.getFirstName()%> <%=lab.getMiddleName()%> <%=lab.getLastName()%></td>
	</tr>
	<tr>
		<td><b>Loan Amount</b></td>
		<td><%=lab.getLoanAmount()%></td>
	</tr>
	<tr>
		<td><b>Outstanding Amount</b></td>
		<td><%=lab.getOutstandingAmount()%></td>
	</tr>
	<tr>
		<td><b>Paid Amount</b></td>
		<td><%=paidAmount%></td>
	</tr>
</table>
<%
	}
%>
</div>

<div id="site_content_bottom"></div>
</div>
<div id="footer"><b>NSEP System</b></div>
</div>
</body>
</html>
