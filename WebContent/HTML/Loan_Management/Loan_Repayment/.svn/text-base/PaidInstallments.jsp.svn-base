<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.nsep.beans.LoanRepaymentBean"%><html
	xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
<title>Pay Installments</title>
<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css" />
<link rel="stylesheet" type="text/css"
	href="/NSEP_System/CSS/CalendarControl.css" />
<script src="/NSEP_System/JavaScript/CalendarControl.js"
	language="javascript"></script>
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
	LoanRepaymentBean lrBean = (LoanRepaymentBean) request
			.getAttribute("installmentBean");
	if (lrBean.getRepaymentId() == 0) {
%>
<br/>
<br/>
<b>Installment is not paid.</b>
<%
	} 
	else if(lrBean.getRepaymentId()==-1)
	{
%>
<br/>
<br/>
<b>Because of Wrong Loan Id or Student Id,Installment is not paid.</b>
<%
	} 
	else
	{
%>
<h1>Your Payment Added Successfully.</h1>
<table cellpadding="10px" cellspacing="10px">
	<tr>
		<td><b>Re payment Id</b></td>
		<td><%=lrBean.getRepaymentId()%></td>
	</tr>
	<tr>
		<td><b>Loan Id</b></td>
		<td><%=lrBean.getLoanId()%></td>
	</tr>
	<tr>
		<td><b>Student Id</b></td>
		<td><%=lrBean.getStudentId()%></td>
	</tr>
	<tr>
		<td><b>Amount</b></td>
		<td><%=lrBean.getAmount()%></td>
	</tr>
	<tr>
		<td><b>Re payment Date</b></td>
		<td><%=lrBean.getRepaymentDate()%></td>
	</tr>
</table>
<%
	}
%>

<br/>
<br/>
<a href="/NSEP_System/HTML/Loan_Management/Loan_Repayment/ViewInstallments.jsp"><b style="color:brown">Go To View Installment Page</b></a>
</div>

<div id="site_content_bottom"></div>
</div>
<div id="footer"><b>NSEP System</b></div>
</div>
</body>
</html>
