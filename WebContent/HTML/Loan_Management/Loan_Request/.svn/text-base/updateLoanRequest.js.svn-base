function formvalidator(form)
{
	var LoanId=document.getElementById("LoanId");
	var LnId=document.getElementById("LnId");
	
	var count =0;
	var foc=0;

	if(validateForm(LoanId,LnId,"Please Enter 9-Digit Loan Id",9))
	{
		count++;
		if(isNumeric(LoanId,LnId,"Please Enter Numeric(0-9) for Loan Id"))
		{
			
			count++;
		}
		else
		{
			foc = LoanId;
		}
	}
	else
	{
		foc = LoanId;
	}
	if (count!=2)
	{
		foc.focus();
		foc.select();
		return false;
	}
	else
		return true;
	
}
function validateForm(field,label,label_text,textLength)
{
	var x=field.value;
	if ((x==null || x=="") || x.length != textLength)
	  {
		label.innerHTML = label_text;
		
		field.style.backgroundColor="pink";
		return false;
	  }
	else
	{
		label.innerHTML = "";
		
		return true;
	}
}  
function isNumeric(field,label,label_text)
{
	 var numericExpression = /^[0-9]+$/;
	 if(field.value.match(numericExpression))
	 {
		 
		 return true;
	 }
	 else
	 {
		 label.innerHTML = label_text;
		 field.style.backgroundColor="pink";
		 return false;
	 }
	 
}


function changeColor(value)
{
	value.style.backgroundColor="#fffacd";
}

function changeBGcolor(value)
{
	value.style.backgroundColor="#ffffff";
}


function resetButton()
{
 var a=confirm("Do you really want to Reset ?");
 if(a==true)
  { 
	document.getElementById("LoanId").focus();
	document.getElementById("LoanId").style.backgroundColor="#FFFFFF";
	
   return true;
  }
 else 
   return false;

}
function submitButton()
{
 var b=confirm("Do you want to submit Loan Request Details ?");
 if(b==true)
	 return formvalidator();
 else 
	 return false;
}
