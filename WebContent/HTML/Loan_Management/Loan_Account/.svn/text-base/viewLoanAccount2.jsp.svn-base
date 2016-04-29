<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.nsep.beans.LoanAccountBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<title>View Loan Account</title>
	
  	<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css" />
  
 	<script type="text/javascript" src="/NSEP_System/HTML/Loan_Management/Loan_Account/viewLoanAccount2.js">
	</script>
</head>
<body>

<% 	LoanAccountBean obj = new LoanAccountBean();
	obj=(LoanAccountBean)request.getAttribute("editObj");
	
	String date = obj.getStartDate();
	String[] data1 = date.split("-");
	String[] data2 = data1[2].split(" ");
	
	String year= data1[0];
	String month= data1[1];
	String day=data2[0];
%>

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
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/loanAccountMenu.jsp">Loan Account Home</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/addLoanAccount1.jsp">Create Loan Account</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/viewLoanAccount1.jsp">View Loan Account</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/editLoanAccount1.jsp">Edit Loan Account</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/deleteLoanAccount1.jsp">Delete Loan Account</a></td></tr>
    	</table>
      </div>

      <div id="content">
		<h1>View Loan Account </h1>
		<form name="myform" method="post" onsubmit="" action="/NSEP_System/LoanAccount" class="form_settings">		
			<table>
			<tr>
				<td>Loan ID </td>
				<td><input disabled ="false" type="textbox" id="loan_id" value="<%=obj.getLoanId() %>" name="loan_id" size="30" ></td>
			</tr>			
			<tr>
				<td>Loan Amount</td>
				<td><input disabled="false" type="textbox" id="loan_amount" value="<%=obj.getLoanAmount()%>" name="loan_amount" size="30"></td>
			</tr>			
			<tr>
				<td>Outstanding Amount</td>
				<td><input disabled="false" type="textbox" id="outstanding_amount" value="<%=obj.getOutstandingAmount()%>" name="outstanding_amount" size="30"></td>
			</tr>			
			<tr>
				<td>tenure</td>
				<td><input disabled="false"  type="textbox" id="tenure" name="tenure" value="<%=obj.getTenure()%>" size="30"></td>
			</tr>			
			<tr>
				<td>Start date</td>
				<td><input disabled="false"  type="textbox" id="tenure" name="tenure" value="<%=month+"-"+day+"-"+year %>" size="30"></td>
			</tr>			
			<tr>
				<td>Bank</td>
				<td><select id='bank' disabled="true" name='bank' onfocus='focusColor(this)' onblur='blurColor(this)'>
					<option value='not_selected'>---Select---</option>
					<option value='State Bank Of India'  <%=(obj.getBankName().equals("State Bank Of India")?"selected":"") %> >State Bank of India</option>
					<option value='Punjab National Bank' <%= (obj.getBankName().equals("Punjab National Bank")?"selected":"") %> >Punjab National Bank</option>
					<option value='Indian Bank' <%=(obj.getBankName().equals("Indian Bank")?"selected":"") %> >Indian Bank</option>
					<option value='Syndicate Bank' <%=(obj.getBankName().equals("Syndicate Bank")?"selected":"") %> >Syndicate Bank</option>
					<option value='Oriental Bank Of Commerce' <%=(obj.getBankName().equals("Oriental Bank Of Commerce")?"selected":"") %> >Oriental Bank of Commerce</option>
					</select><label id='bank_label'></label>
				</td>
			</tr>			
			<tr>
				<td>Account no</td>
				<td><input disabled="false" type="textbox" id="acc_no" name="acc_no" value="<%=obj.getAccountNumber()%>" size="30"></td>
			</tr>			
			<tr >
				<td><input type="submit" value="Edit" onclick="edit()" class="submit"/></td>
				<td><input type="submit" value="Delete" onclick="delt()" class="submit" /></td>
			</tr>	
			<tr >
				<td><input type="submit" value="Exit" onclick="exit()" class="submit"/></td>
			</tr>		
			</table>
			<input type="hidden" name="h_field" value="exit"></input>
			<input type='hidden' name='id_field' value="<%=obj.getLoanId() %>"></input>
			</form>

      </div>

      <div id="site_content_bottom"></div>
    </div>
    <div id="footer">Copyright &copy; NSEP System. All Rights Reserved. </div>
  </div>
</body>
</html>