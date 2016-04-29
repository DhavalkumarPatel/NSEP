<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>Delete Loan Account</title>
 	
 	<link rel="stylesheet" type="text/css" href="/NSEP_System/CSS/style.css" />

 	<script type="text/javascript" src="/NSEP_System/HTML/Loan_Management/Loan_Account/deleteLoanAccount1.js">
	</script>
	
</head>
<%
	String msg = (String)request.getAttribute("msg");
	if (msg==null)
	{
		msg="";
	}
%>
<body onload="document.myform.id_field.focus()">
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
        <h1>Delete Loan Account </h1>
		
		<form name="myform" method="post" onsubmit="return validation()" onreset="get_reset()" action="/NSEP_System/LoanAccount" class="form_settings">			
	
			<table>			
			<tr>
				<td> Enter Loan ID : </td>
				<td> <input type="textbox" id="id_field" name="id_field" size="10" maxlength="9" onfocus="focusColor(this)" onblur="blurColor(this)"> <label id="loan_id_label"><%= msg %></label></td>
			</tr>			
			<tr >
				<td> <input type="submit" value="Delete" class="submit"/></td>
				<td><input type="reset" value="Reset" class="submit" onclick="return callReset()"/></td>
			</tr>			
			</table>			
			<input type="hidden" name="h_field" value="del1"></input>
			</form>
		
      </div>

      <div id="site_content_bottom"></div>
    </div>
    <div id="footer">Copyright &copy; NSEP System. All Rights Reserved. </div>
  </div>
</body>
</html>