function validation()
{
	var loanId=document.PayInstallment.txtLoanId.value;
	var studentId=document.PayInstallment.txtStudentId.value;
	var amount=document.PayInstallment.txtAmount.value;
	var amountFloat=parseFloat(amount);
	var repaymentDate=document.PayInstallment.txtRepaymentDate.value;
	var checkDigit= /^[1-9][0-9]+$/;
	var checkDecimal=/^[0-9.]+$/;
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
	
	if(amount=="")
	{
		document.getElementById('lblAmount').innerHTML="Please Enter Amount.";
		retrn=false;
	}
	else if(!amount.match(checkDecimal))
	{
		document.getElementById('lblAmount').innerHTML="Amount should only contain numerics.";
		retrn=false;
	}
	else if(amountFloat==0)
	{
		document.getElementById('lblAmount').innerHTML="Amount should not be Zero.";
		retrn=false;
	}
	else
	{
		document.getElementById('lblAmount').innerHTML="";
	}
	
	if(repaymentDate=="")
	{
		document.getElementById('lblRepaymentDate').innerHTML="Please Enter Repayment Date.";
		retrn=false;
	}
	else
	{
		document.getElementById('lblRepaymentDate').innerHTML="";
	}
	
	
	if(retrn)
	{
		var con=confirm("Do you Want to Submit the Details?");
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
		document.getElementById('lblAmount').innerHTML="";
		document.getElementById('lblRepaymentDate').innerHTML="";
		return true;
	}
}
