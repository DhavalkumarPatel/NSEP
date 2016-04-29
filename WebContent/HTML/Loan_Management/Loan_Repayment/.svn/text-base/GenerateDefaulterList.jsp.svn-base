<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.nsep.beans.LoanRepaymentBean"%>

<%@page import="com.nsep.beans.LoanAccountBean"%>
<%@page import="java.util.ArrayList"%><html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
<title>Defaulter List</title>
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
<%
ArrayList<LoanRepaymentBean> defaulters=(ArrayList<LoanRepaymentBean>)request.getAttribute("defaulters");
int month=(Integer)request.getAttribute("month");
int year=(Integer)request.getAttribute("year");
%>

<div id="content">
	<h1>Defaulter List</h1>
	<br/>
	<%
	if(defaulters.size()==0)
	{
	%>
		<b>No defaulters in month : <%=month%> of year : <%=year%>.</b>	
	<%
	}
	else
	{
	%>
	
	<b>Month : <%=month%></b><br/>
	<b>Year : <%=year%></b><br/>
		
		<table border="1" width="300px" style="margin-top:10px">
		<tr style="background-color: #332B2D;color:#E7F5E1;">
			<th>Sr.No.</th>
			<th>Loan Id</th>
			<th>Student Id</th>
		</tr>
		<%
		for(int i=0;i<defaulters.size();i++)
		{
			LoanRepaymentBean al = defaulters.get(i);
			Integer ii=new Integer(al.getRepaymentId());
		%>
		
		<%
			if(i%2==0)
			{
		%>
				<tr style="background-color: #FCF7D4">
		<%	
			}
			else
			{
		%>
				<tr style="background-color: #DEDAC3">
		<%
			}
		%>
			<td><%=i+1%></td>
			<td><%=al.getLoanId()%></td>
			<td><%=al.getStudentId()%></td>
		</tr>
		<%
		}
		%>
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
