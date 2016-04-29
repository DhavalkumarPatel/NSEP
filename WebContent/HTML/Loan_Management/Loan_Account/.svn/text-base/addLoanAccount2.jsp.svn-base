<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.nsep.beans.LoanAccountBean" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 	
 	<title>Create Loan Account</title>
  	
  	<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css" />
  	<link href="/NSEP_System/CSS/CalendarControl.css" rel="stylesheet" type="text/css"/>
  
 	<script type="text/javascript" src="/NSEP_System/HTML/Loan_Management/Loan_Account/addLoanAccount2.js">
	</script>
	
	<script type="text/javascript" src="/NSEP_System/JavaScript/CalendarControl.js"> //language="javascript">
	</script>
</head>
<%
	String msg = (String)request.getAttribute("msg");
	if (msg==null)
	{
		msg="";
	}
%>
<body>

<% 	LoanAccountBean laObj = new LoanAccountBean();
	laObj=(LoanAccountBean)request.getAttribute("laObj");
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
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/addLoanAccount2.jsp">Create Loan Account</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/viewLoanAccount1.jsp">View Loan Account</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/editLoanAccount1.jsp">Edit Loan Account</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/deleteLoanAccount1.jsp">Delete Loan Account</a></td></tr>
    	</table>
      </div>

      <div id="content">
        <h1>Create Loan Account </h1>
		
		<form name="myform" method="post" onsubmit="return validation()" onreset="get_reset()" action="/NSEP_System/LoanAccount" class="form_settings">
			<table>
			<tr>
				<td>Loan ID</td>
				<td><input type="textbox" disabled="true" value="<%= laObj.getLoanId()%>" id="loan_id" name="loan_id" size="30" maxlength="9" onfocus="focusColor(this)" onblur="blurColor(this)"><label id="loan_id_label"></label></td>
			</tr>
			<tr>
				<td>Student ID</td>
				<td><input type="textbox" disabled="true" value="<%= laObj.getStudentId()%>" id="student_id" name="student_id" size="30" maxlength="9" onfocus="focusColor(this)" onblur="blurColor(this)"><label id="loan_id_label"></label></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="textbox" disabled="true" value="<%= laObj.getFirstName()%>" id="student_id" name="student_id" size="30" maxlength="9" onfocus="focusColor(this)" onblur="blurColor(this)"><label id="loan_id_label"></label></td>
			</tr>
			<tr>
				<td>Loan Amount</td>
				<td><input type="textbox" disabled="true" value="<%=laObj.getLoanAmount() %>" id="loan_amount" name="loan_amount" size="30" maxlength="8" onfocus="focusColor(this)" onblur="blurColor(this)"><label id="loan_amount_label"></label></td>
			</tr>
			<tr>
				<td>tenure</td>
				<td><input type="textbox" disabled="true" value="<%=laObj.getTenure() %>" id="tenure" name="tenure" size="30" maxlength="2" onfocus="focusColor(this)" onblur="blurColor(this)"><label id="tenure_label"></label></td>
			</tr>			
			<tr>
				<td>Start Date</td>
				<td><input type="textbox" id="start_date" readonly="readonly" name="start_date" size="30" onfocus="showCalendarControl(this)" onblur="blurColor(this)"><label id="start_date_label"></label></td>
			</tr>			
			<tr>
				<td>Bank</td>
				<td><select id="bank" name="bank" onfocus="focusColor(this)" onblur="blurColor(this)">
					<option value="not_selected">---Select---</option>
					<option value="State Bank Of India">State Bank of India</option>
					<option value="Punjab National Bank">Punjab National Bank</option>
					<option value="Indian Bank">Indian Bank</option>
					<option value="Syndicate Bank">Syndicate Bank</option>
					<option value="Oriental Bank Of Commerce">Oriental Bank of Commerce</option>
					</select><label id="bank_label"></label>
				</td>
			</tr>		
			<tr>
				<td>Account No.</td>
				<td><input type="textbox" id="acc_no" name="acc_no" size="30" maxlength="14" onfocus="focusColor(this)" onblur="blurColor(this)"><label id="acc_no_label"><%= msg %></label></td>
			</tr>			
			<tr >
				<td> <input type="submit" value="Submit" class="submit"/></td>
				<td><input type="reset" value="Reset" onclick="return callReset()" class="submit"/></td>
			</tr>
			</table>			
			<input type="hidden" name="h_field" value="add2"></input>
			<input type="hidden" name="loan_id_field" value="<%=laObj.getLoanId()%>"></input>
			<input type="hidden" name="student_id_field" value="<%=laObj.getStudentId()%>"></input>
			<input type="hidden" name="first_name_field" value="<%=laObj.getFirstName()%>"></input>
			<input type="hidden" name="middle_name_field" value="<%=laObj.getMiddleName()%>"></input>
			<input type="hidden" name="last_name_field" value="<%=laObj.getLastName()%>"></input>
			<input type="hidden" name="loan_amount_field" value="<%=laObj.getLoanAmount()%>"></input>
			<input type="hidden" name="outstanding_amount_field" value="<%=laObj.getLoanAmount()%>"></input>
			<input type="hidden" name="tenure_field" value="<%=laObj.getTenure()%>"></input>
			</form>
		
      </div>

      <div id="site_content_bottom"></div>
    </div>
    <div id="footer">Copyright &copy; NSEP System. All Rights Reserved. </div>
  </div>
</body>
</html>
