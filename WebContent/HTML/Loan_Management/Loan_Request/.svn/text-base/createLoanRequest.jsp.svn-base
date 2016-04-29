<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.nsep.beans.StudentBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Create Loan Request</title>
<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css" />
<script type="text/javascript"
	src="/NSEP_System/HTML/Loan_Management/Loan_Request/createLoanRequest.js"></script>
</head>

<body onLoad="document.createLnRequest.LoanAmount.focus()">
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
<h1>Create Loan Request</h1>
<form class="form_settings" action="/NSEP_System/LoanRequest" method="post"
	onsubmit="return submitButton()" id="createLnRequest">
<%
		StudentBean st = (StudentBean)request.getAttribute("student");
	%>
<table>
	<tr>
		<td>First Name:</td>
		<td><input type="text" maxlength="20" disabled="disabled"
			value="<%=st.getFirstName() %>" /></td>
		<td><input type="hidden" id="FirstName" name="FirstName"
			value="<%=st.getFirstName() %>" /></td>
	</tr>
	<tr>
		<td>Middle Name:</td>
		<td><input type="text" maxlength="20"
			value="<%=st.getMiddleName() %>" disabled="disabled" /></td>
		<td><input type="hidden" id="MiddleName" name="MiddleName"
			value="<%=st.getMiddleName()%>" /></td>
	</tr>
	<tr>
		<td>Last Name:</td>
		<td><input type="text" maxlength="20"
			value="<%=st.getLastName() %>" disabled="disabled" /></td>
		<td><input type="hidden" id="LastName" name="LastName"
			value="<%=st.getLastName() %>" /></td>
	</tr>
	<tr>
		<td>Student Id:</td>
		<td><input type="text" maxlength="9"
			value="<%=st.getStudentId() %>" disabled="disabled" /></td>
		<td><input type="hidden" id="StudentId" name="StudentId"
			value="<%=st.getStudentId() %>" /></td>
	</tr>
	<tr>
		<td>Loan Purpose:</td>
		<td><input type="radio" name="LoanPurpose" id="LoanPurpose"
			value="examFee" checked="checked"/>Exam fee of a Competitive Exam<br />
			<input type="radio" name="LoanPurpose" id="LoanPurpose"
			value="bookPurchase" />Purchase of Academic Books<br />
			<input type="radio" name="LoanPurpose" id="LoanPurpose"
			value="enroll" />To enroll in any technical certification course
			
		</td>
		<td><label id="LnPurpose"></label></td>
	</tr>
	<tr>
		<td>Loan Amount <img
			src="/NSEP_System/CSS/Images/rupeesymbol.png" height="10" width="10"
			style="padding-top: 5px" /> :</td>
		<td><input type="text" name="LoanAmount" id="LoanAmount"
			onfocus="changeColor(this)" onblur="changeBGcolor(this)"
			maxlength="10" /><span style="color: Red; font-size: 150%">*</span></td>
		<td><label id="LnAmt"></label></td>
	</tr>
	<tr>
		<td>Repayment Period:</td>
		<td><input type="text" name="RepaymentPeriod"
			id="RepaymentPeriod" onfocus="changeColor(this)"
			onblur="changeBGcolor(this)" maxlength="2" /><span
			style="color: Red; font-size: 150%">*</span></td>
		<td><label id="RPeriod"></label></td>
	</tr>
</table>
<p>All the Fields marked with <span
	style="color: Red; font-size: 150%">*</span> are mandatory <br />
<input type="submit" value="Create" class="submit" />
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="reset" value="Reset"
	onclick="return resetButton()" class="submit" /> <input type="hidden"
	name="h_field" value="createRequest"></input></p>
</form>
</div>

<div id="site_content_bottom"></div>
</div>
<div id="footer">Copyright &copy; NSEP System. All Rights
Reserved.</div>
</div>
</body>
</html>