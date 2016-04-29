<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.nsep.beans.LoanRequestBean"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
<title>Update Loan Request</title>
<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css" />
<script type="text/javascript" src="/NSEP_System/HTML/Loan_Management/Loan_Request/createLoanRequest2.js"></script>
</head>

<body onLoad="document.updateLoanRequest.FirstName.focus();">
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



<form class="form_settings" action="/NSEP_System/LoanRequest" method="post"
	onSubmit="return submitButton()" name="updateLoanRequest">

<table>
	<% LoanRequestBean foundStu = (LoanRequestBean)request.getAttribute("foundStudent"); %>
	<tr>
		<td>Loan Id:</td>
		<td><input type='text' id='LoanId' disabled='true'
			onfocus='changeColor(this)' onblur='changeBGcolor(this)'
			maxlength='20' value="<%= foundStu.getLoanId()%>" /></td>
		<td><input type='hidden' name='LoanId'
			value="<%= foundStu.getLoanId()%>" /></td>
			
		
	</tr>
			<tr>
		<td>First Name:</td>
		<td><input type='text' id='FirstName' disabled='true'
				onfocus='changeColor(this)' onblur='changeBGcolor(this)'
				maxlength='20' value="<%= foundStu.getFirstName()%>"/></td>
			<td><input type='hidden' name='FirstName'
				value="<%= foundStu.getFirstName()%>"/></td>
			<td><label id="StFName"></label></td>	
	</tr>
	<tr>
		<td>Middle Name:</td>
		<td><input type='text' id='MiddleName' disabled='true'
				onfocus='changeColor(this)' onblur='changeBGcolor(this)'
				maxlength='20' value="<%= foundStu.getMiddleName()%>"/></td>
		<td><input type='hidden' name='MiddleName'
				value="<%= foundStu.getMiddleName()%>"/></td>
		<td><label id="StMName"></label></td>
	</tr>
	<tr>
		<td>Last Name:</td>
		<td><input type='text' id='LastName' disabled='true'
				onfocus='changeColor(this)' onblur='changeBGcolor(this)'
				maxlength='20' value="<%= foundStu.getLastName()%>" /></td>
		<td><input type='hidden' name='LastName'
				value="<%= foundStu.getLastName()%>"/></td>
		<td><label id="StLName"></label></td>
	</tr>
	<tr>
		<td>Student Id:</td>
		<td><input type='text' id='StudentId' disabled='true'
				onfocus='changeColor(this)' onblur='changeBGcolor(this)'
				maxlength='9' value="<%= foundStu.getStudentId()%>"/></td>
		<td><input type='hidden' name='StudentId'
				value="<%= foundStu.getStudentId()%>"/></td>
		<td><label id="StId"></label></td>
	</tr>
	<tr>
		<td>Loan Purpose:</td>
		<td><input type='text' name='LoanPurpose' id='LoanPurpose'
				onfocus='changeColor(this)' onblur='changeBGcolor(this)'
				maxlength='30' value="<%= foundStu.getLoanPurpose()%>"/></td>
		
		<td><label id="LnPurpose"></label></td>
	</tr>
	<tr>
		<td>Loan Amount <img src="/NSEP_System/CSS/Images/rupeesymbol.png" height="10" width="10" style="padding-top:5px"/> :</td>
		<td><input type='text' name='LoanAmount' id='LoanAmount'
				onfocus='changeColor(this)' onblur='changeBGcolor(this)'
				maxlength='10' value="<%= foundStu.getLoanAmount()%>"/></td>
		<td><label id="LnAmt"></label></td>
	</tr>
	<tr>
		<td>Repayment Period:</td>
		<td><input type='text' name='RepaymentPeriod'
				id='RepaymentPeriod' onfocus='changeColor(this)'
				onblur='changeBGcolor(this)' maxlength='2'
				value="<%= foundStu.getRepaymentPeriod()%>"/></td>
		<td><label id="RPeriod"></label></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="Update" class="submit" />&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input
			type="reset" value="Reset" onclick="return resetButton()"
			class="submit" /></td>
	</tr>
</table>



<input type='hidden' name='h_field' value='finalUpdate' />
</form>
</body>

</div>

<div id="site_content_bottom"></div>
</div>
<div id="footer">Copyright &copy; NSEP System. All Rights
Reserved.</div>
</div>
</body>
</html>
