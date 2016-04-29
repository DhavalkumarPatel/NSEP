<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.nsep.beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
  <title>Approve Loan Request</title>
  <link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css" />
  <script type="text/javascript" src="/NSEP_System/HTML/Loan_Management/Loan_Request/approveLoanRequest.js">
	</script>
  <%
	String msg = (String)request.getAttribute("msg");
	if (msg==null)
	{
		msg="";
	}
%>
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
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Request/LoanRequestHomePage.html">Loan Request Home</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Request/createLoanRequestFirstPage.html">Create Loan Request</a></td></tr>
    			<tr><td id="menu_button"><a href="../../../LoanRequest?action=View"/>View Loan Request</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Request/approveLoanRequest.jsp">Approve Loan Request</a></td></tr>
    			<!--  <tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Request/updateLoanRequest.html"/>Update Loan Request</a></td></tr>
    			<tr><td id="menu_button"><a href/>Approve Loan Request</a></td></tr>
    			<tr><td id="menu_button"><a href/>Delete Loan Request</a></td></tr>
-->       
       	</table>
      </div>

      <div id="content">
        <h1>Approve Loan Request</h1>
		<form name="approveForm" method="post" onsubmit="return validation()" action="/NSEP_System/LoanAccount" class="form_settings">
		<table>
					<% LoanRequestBean foundStu = (LoanRequestBean)request.getAttribute("editObj"); %>		
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
		<td><input type='text' name='LoanPurpose' disabled='true'
					id='LoanPurpose'
				onfocus='changeColor(this)' onblur='changeBGcolor(this)'
				maxlength='30' value="<%= foundStu.getLoanPurpose()%>"/></td>
		
		<td><label id="LnPurpose"></label></td>
	</tr>
	<tr>
		<td>Loan Amount <img src="/NSEP_System/CSS/Images/rupeesymbol.png" height="10" width="10" style="padding-top:5px"/> :</td>
		<td><input type='text' name='LoanAmount' disabled='true' id='LoanAmount'
				onfocus='changeColor(this)' onblur='changeBGcolor(this)'
				maxlength='10' value="<%= foundStu.getLoanAmount()%>"/></td>
		<td><label id="LnAmt"></label></td>
	</tr>
	<tr>
		<td>Repayment Period:</td>
		<td><input type='text' name='RepaymentPeriod' disabled='true'
				id='RepaymentPeriod' onfocus='changeColor(this)'
				onblur='changeBGcolor(this)' maxlength='2'
				value="<%= foundStu.getRepaymentPeriod()%>"/></td>
		<td><label id="RPeriod"></label></td>
	</tr>
	<tr>
		<td><input type='button' class='gridbutton' value='Approve' onclick="window.location.href='LoanRequest?action=Approve&id=<%= foundStu.getLoanId()%>'"/></td>
		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<td><input type='button' class='gridbutton' value='Reject' onclick="window.location.href='LoanRequest?action=Reject&id=<%= foundStu.getLoanId()%>'"/>
			</td>
	</tr>
			</table>
			<input type="hidden" name="h_field" value="approve2"></input>
			</form>
      </div>

      <div id="site_content_bottom"></div>
    </div>
    <div id="footer">Copyright &copy; NSEP System. All Rights Reserved. </div>
  </div>
</body>
</html>
