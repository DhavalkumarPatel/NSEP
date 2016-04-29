<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.nsep.DAO.LoanRepaymentDAO,com.nsep.service.LoanAccountService,java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.nsep.beans.LoanRepaymentBean"%>
<%
		ArrayList<LoanRepaymentBean> alData;
		if(request.getAttribute("allInstallments")==null)
		{
			LoanRepaymentDAO dao=new LoanRepaymentDAO();
			alData=dao.viewInstallments();
		}
		else
		{
			alData=(ArrayList<LoanRepaymentBean>)request.getAttribute("allInstallments");
		}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css"/>
<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/CalendarControl.css"/>
<script src="/NSEP_System/JavaScript/CalendarControl.js" language="javascript"></script>
<script type='text/javascript'>
function updateClk(oForm)
{
	oForm.elements['hidfield'].value='EditInstallments';
	return true;
}

function deleteClk(oForm)
{
	oForm.elements['hidfield'].value='DeleteInstallments';
	return confirm('Do You Want To Delete?');
}

function enableDisable()
{	
	var search=new Array();
	search= document.getElementsByName("txtSearch");
	for(var i=0;i<search.length;i++)
	{
		if(search[i].checked)
		{
			if(search[i].value=="RepaymentId")
			{
				document.getElementById("txtRepaymentId").disabled=false;
			}
			if(search[i].value=="LoanId")
			{
				document.getElementById("txtLoanId").disabled=false;
			}
			else if(search[i].value=="StudentId")
			{
				document.getElementById("txtStudentId").disabled=false;
			}
			else if(search[i].value=="Datee")
			{
				document.getElementById("txtFromDate").disabled=false;
				document.getElementById("txtToDate").disabled=false;
			}
		}
		else
		{
			if(search[i].value=="RepaymentId")
			{
				document.getElementById("txtRepaymentId").value="";
				document.getElementById("txtRepaymentId").disabled=true;
			}
			else if(search[i].value=="LoanId")
			{
					document.getElementById("txtLoanId").value="";
					document.getElementById("txtLoanId").disabled=true;
			}
			else if(search[i].value=="StudentId")
			{
					document.getElementById("txtStudentId").value="";
					document.getElementById("txtStudentId").disabled=true;
			}
			else if(search[i].value=="Datee")
			{
					document.getElementById("txtFromDate").value="";
					document.getElementById("txtToDate").value="";					
					document.getElementById("txtFromDate").disabled=true;
					document.getElementById("txtToDate").disabled=true;
			}
		}
	}
}
</script>
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
        <h1>View Installments</h1>
        <form action="/NSEP_System/LoanRepayment" method="post" name="ViewInstallment" class="form_settings">
			<table>
				<tr>
					<td colspan="2"><b>Search By:</b></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="txtSearch" value="RepaymentId" onclick="enableDisable()">Repayment Id</td>
					<td><input type="text" name="txtRepaymentId" disabled="disabled"/></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="txtSearch" value="LoanId" onclick="enableDisable()">Loan Id</td>
					<td><input type="text" name="txtLoanId" disabled="disabled"/></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="txtSearch" value="StudentId" onclick="enableDisable()">Student Id</td>
					<td><input type="text" name="txtStudentId" disabled="disabled"/></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="txtSearch" value="Datee" onclick="enableDisable()">Date From </td>
					<td> <input type="text" name="txtFromDate" onfocus="showCalendarControl(this)" disabled="disabled"/> To <input type="text" name="txtToDate" onfocus="showCalendarControl(this)" disabled="disabled"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Search" class="submit"/></td>
				</tr>
			</table>
			<input type="hidden" name="hidfield" value="ViewInstallments"></input>
		</form>
			
		<table border="1" width="625px" style="margin-top:10px">
		<tr style="background-color: #332B2D;color:#E7F5E1;">
			<th>Sr.No.</th>
			<th>Repayment Id</th>
			<th>Loan Id</th>
			<th>Student Id</th>
			<th>Amount</th>
			<th>Repayment Date</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
		for(int i=0;i<alData.size();i++)
		{
			LoanRepaymentBean al = alData.get(i);
			Integer ii=new Integer(al.getRepaymentId());
			String s="form"+ii.toString();
		%>
		<form action="/NSEP_System/LoanRepayment" name="<%=s%>", method="post" class="form_settings">
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
			<td><%=al.getRepaymentId()%></td>
			<td><%=al.getLoanId()%></td>
			<td><%=al.getStudentId()%></td>
			<td><%=al.getAmount()%></td>
			<td><%=al.getRepaymentDate()%><input type="hidden" name="hidfield"/><input type="hidden" name="hidRepaymentId" value="<%=al.getRepaymentId()%>"/></td>
			<td style="text-align: center"><input type='submit' name='b1' value='Update' onclick='return updateClk(this.form);' class="gridbutton"/></td>
			<td style="text-align: center"><input type='submit' name='b2' value='Delete' onclick='return deleteClk(this.form);' class="gridbutton"/></td>
		</tr>
		</form>
		<%
		}
		%>
		</table>		
      </div>

      <div id="site_content_bottom"></div>
    </div>
    <div id="footer"><b>NSEP System</b></div>
  </div>
</body>
</html>
