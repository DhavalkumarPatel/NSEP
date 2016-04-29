<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<form name="myform" method="post" onsubmit="return validation()" action="/NSEP_System/LoanAccount" class="form_settings">
		<table>
			<tr>
				<td> Enter Loan ID : </td>
				<td> <input type="textbox" id="id_field" name="id_field" size="10" maxlength="9" onfocus="focusColor(this)" onblur="blurColor(this)"> <label id="loan_id_label"><%= msg %></label></td>
			</tr>			
			<tr>
				<td><input type="submit" value="Submit" class='submit'/></td>
				<td><input type="reset" value="Reset" onclick="return callReset()" class='submit'/></td>
			</tr>			
			</table>
			<input type="hidden" name="h_field" value="approve1"></input>
			</form>
      </div>

      <div id="site_content_bottom"></div>
    </div>
    <div id="footer">Copyright &copy; NSEP System. All Rights Reserved. </div>
  </div>
</body>
</html>
