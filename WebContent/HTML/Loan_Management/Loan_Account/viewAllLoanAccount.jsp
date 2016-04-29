<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.nsep.beans.LoanAccountBean" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>Loan Account List</title>

	<link rel='stylesheet' type='text/css' href='/NSEP_System/CSS/style.css' />
	
	<script type='text/javascript' src='/NSEP_System/HTML/Loan_Management/Loan_Account/viewAllLoanAccount.js'>
	</script>

</head>
<body>

<% 	ArrayList<LoanAccountBean> alData = new ArrayList<LoanAccountBean>();
	alData=(ArrayList<LoanAccountBean>)request.getAttribute("al");
	int size = alData.size();
%>

<div id='main'>
		    <div id='header'>
		      <div id='logo'>
		        <div id='logo_text'>
		           <h1>NSEP<span class='alternate_colour'> System</span></h1>
		        </div>
		      </div>
		      <div id='menubar'>
		        <ul id='menu'>
				<li><a href="#">Home</a></li>
				<li><a href="#">User Management</a></li>
				<li><a href="#">Account Management</a></li>
				<li class="tab_selected"><a href="/NSEP_System/HTML/Loan_Management/LMHome.html">Loan Management</a></li>
		        </ul>
		      </div>
		    </div>
		    <div id='site_content'>
		      <div class='sidebar'>
				<table>
		    	<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/loanAccountMenu.jsp">Loan Account Home</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/addLoanAccount1.jsp">Create Loan Account</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/viewLoanAccount1.jsp">View Loan Account</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/editLoanAccount1.jsp">Edit Loan Account</a></td></tr>
    			<tr><td id="menu_button"><a href="/NSEP_System/HTML/Loan_Management/Loan_Account/deleteLoanAccount1.jsp">Delete Loan Account</a></td></tr>
		    	</table>
		      </div>

		      <div id='content'>
		        <h1>Loan Account List</h1>
				
				<form name='myform' method='post' action='/NSEP_System/HTML/Loan_Management/Loan_Account/loanAccountMenu.jsp' class='form_settings'>
				<input type="submit" value="Exit" class="gridbutton">
				</form>
				<br/>
				
				<table border='1'>
				<tr><th>No.</th><th>Loan ID</th><th>Student Name</th><th>Bank Name</th><th>Account No.</th><th>EDIT</th><th>DELETE</th></tr>
				
				<% for(int i=0;i<size;i++)
				{
					LoanAccountBean al = alData.get(i);%>
					
					<form name = 'myform<%=i%>' method='post' action='LoanAccount' class='form_settings'>
	
					<td><%=(i+1) %></td><input type='hidden' name='h_field'></input><input type='hidden' name='id_field' value='<%=al.getLoanId()%>'></input>
					<td class='gridtd'><%=al.getLoanId()%></td>
					<td class='gridtd'><%=al.getFirstName()%></td>
					<td class='gridtd'><%=al.getBankName()%></td>
					<td class='gridtd'><%=al.getAccountNumber()%></td>
					<td class='gridtd'><input type='submit' value='Edit' onclick='return edit1(this.form)' class='gridbutton'/></td>
					<td class='gridtd'><input type='submit' value='Delete' onclick='return delete1(this.form)' class='gridbutton'/></td></tr>

					</form>
				<% } %>		
				</table>
		      </div>

		      <div id='site_content_bottom'></div>
		    </div>
		    <div id='footer'>Copyright &copy; NSEP System. All Rights Reserved. </div>
		  </div>

</body>
</html>