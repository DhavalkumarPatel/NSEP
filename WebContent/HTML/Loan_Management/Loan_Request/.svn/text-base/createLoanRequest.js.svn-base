
function formvalidator(form)
{
	var RepPeriod=document.getElementById("RepaymentPeriod");
	var RPeriod=document.getElementById("RPeriod");
	var Amount=document.getElementById("LoanAmount");
	var LnAmt=document.getElementById("LnAmt");
	
	var count =0;
	var foc=0;

	if(validateForm(RepPeriod,RPeriod,"Please Enter Repayment Period as Total of Months",2))
	{
		if(isNumeric(RepPeriod,RPeriod,"Please Enter Numeric Values for Repayment Period"))
		{
			if(isInLimit(RepPeriod,RPeriod,"Please Enter Repayment Period between 3 to 12 months"))
			{
				
				count++;
			}
			else
			{
				foc = RepPeriod;
			}
		}
		else
		{
			foc = RepPeriod;

		}
	}
	else
	{
		foc = RepPeriod;

	}
	if(validateForm(Amount,LnAmt,"Please Enter Loan Amount",10))
	{
		if(isNumeric(Amount,LnAmt,"Please Enter Numeric Values for Loan Amount"))
		{
			count++;
		}
		else
		{
			foc = Amount;

		}
	}
	else
	{
		foc = Amount;

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
	if ((x==null || x=="") || x.length > textLength)
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
	 var numericExpression = /^[0-9.]+$/;
	 if(field.value.match(numericExpression) && field.value>0)
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
function isInLimit(field,label,label_text)
{
	
	 if((field.value>= 3) && (field.value<=12) )
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
	document.getElementById("LoanAmount").focus();
	document.getElementById("RepaymentPeriod").style.backgroundColor="#FFFFFF";
	document.getElementById("LoanAmount").style.backgroundColor="#FFFFFF";
	document.getElementById("LnAmt").innerHTML="";
	document.getElementById("RPeriod").innerHTML="";
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
 {
	 document.getElementById("LoanAmount").focus();
	 return false;
 }
}
