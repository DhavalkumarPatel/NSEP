function validation()
{
	var loanId=document.LRCertificate.txtLoanId.value;
	var studentId=document.LRCertificate.txtStudentId.value;
	var checkDigit= /^[1-9][0-9]+$/;
	var retrn=true; 
	
	if(loanId=="" || loanId.length!=9)
	{
		document.getElementById('lblLoanId').innerHTML="Please Enter Nine Digit Loan Id.";
		retrn=false;
	}
	else if(!loanId.match(checkDigit))
	{
		document.getElementById('lblLoanId').innerHTML="Loan Id should contain only numerics and not start with Zero.";
		retrn=false;
	}
	else
	{
		document.getElementById('lblLoanId').innerHTML="";
	}
	
	if(studentId=="")
	{
		document.getElementById('lblStudentId').innerHTML="Please Enter Student Id.";
		retrn=false;
	}
	else if(studentId.length>9)
	{
		document.getElementById('lblStudentId').innerHTML="Student Id Should Contain Maximum Nine Digits.";
		retrn=false;
	}
	else if(!studentId.match(checkDigit))
	{
		document.getElementById('lblStudentId').innerHTML="Student Id should contain only numerics and not start with Zero.";
		retrn=false;
	}
	else
	{
		document.getElementById('lblStudentId').innerHTML="";
	}
		
	if(retrn)
	{
		var con=confirm("Do you Want to Generate Loan Repaid Certificate ?");
		if (con==false)
		  {
			return false;
		  }
	}
	
	return retrn;
}
function resetForm()
{
	var con=confirm("Do you Want to Reset ?");
	if (con==false)
	  {
		return false;
	  }
	else
	{	
		document.getElementById('lblLoanId').innerHTML="";
		document.getElementById('lblStudentId').innerHTML="";
		return true;
	}
}
