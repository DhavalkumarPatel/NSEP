<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.nsep.beans.LoanRepaymentBean"%><html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
<title>Update Installments</title>
 <script src="/NSEP_System/HTML/Loan_Management/Loan_Repayment/JavaScript/UpdateInstallments.js" language="javascript"></script>
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
	LoanRepaymentBean lrBean = (LoanRepaymentBean) request.getAttribute("updateBean");
%>
<h1>Update Installment</h1>
<form action='/NSEP_System/LoanRepayment' method='post' name="UpdateInstallment" class="form_settings">
			<table>
				<tr>
					<td colspan="3"><label>All Fields Are Mandatory.</label></td>
				</tr>
				<tr>
					<td>Re payment Id</td>
					<td><input type='text' disabled='true' value="<%=lrBean.getRepaymentId()%>"/><input type="hidden" name="txtRepaymentId" value="<%=lrBean.getRepaymentId()%>"/></td>
					<td>You Can Not Change Repayment Id.</td>
				</tr>
				<tr>
					<td>Loan Id</td>
					<td><input type='text' name='txtLoanId' value="<%=lrBean.getLoanId()%>"/></td>
					<td><label id="lblLoanId"></label></td>		
				</tr>
				<tr>
					<td>Student Id</td>
					<td><input type='text' name='txtStudentId' value="<%=lrBean.getStudentId()%>"/></td>
					<td><label id="lblStudentId"></label></td>	
				</tr>
				<tr>
					<td>Amount <img src="/NSEP_System/CSS/Images/rupeesymbol.png" height="10" width="10" style="padding-top:5px"/></td>
					<td><input type='text' name='txtAmount' value="<%=lrBean.getAmount()%>"/></td>
					<td><label id="lblAmount"></label></td>		
				</tr>
				<tr>
					<td>Date</td>
					<td><input type='text' name='txtRepaymentDate' value="<%=lrBean.getRepaymentDate()%>" readonly="readonly" onfocus="showCalendarControl(this)"/></td>
					<td><label id="lblRepaymentDate"></label></td>	
				</tr>
				<tr>
					<td><input type="submit" value="Submit" class="submit" onclick="return validation();"/></td>
					<td colspan="2"><input type="reset" value="Reset" class="submit" onclick="return resetForm();"/></td>
				</tr>
			</table>
			<input type="hidden" name="hidfield" value="UpdateInstallments"></input>
		</form>
</div>

<div id="site_content_bottom"></div>
</div>
<div id="footer"><b>NSEP System</b></div>
</div>
</body>
</html>